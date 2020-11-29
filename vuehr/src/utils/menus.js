import {getRequest} from "./api";

/* 菜单初始化方法：
  （router: 服务端请求到的数据要加到 router 里；store：数据要保存在store） */
export const initMenu = (router, store) => {
    // 如果有菜单数据，直接返回
    if (store.state.routes.length > 0) {
        return
    }
    // 否则请求菜单数据
    getRequest("/system/config/menu").then(data => {
        if (data) {
            let fmtRoutes = formatRoutes(data); // 格式化
            router.addRoutes(fmtRoutes);
            store.commit('initRoutes', fmtRoutes);
        }
    })
}

export const formatRoutes = (routes) => {
    let fmRoutes = [];
    routes.forEach(router => {
        // 批量定义变量 -> let path = router.path, let component = router.component ...
        let {
            path,
            component,
            name,
            meta,
            iconCls,
            children
        } = router;

        // 一级菜单的children
        if (children && children instanceof Array) {
            children = formatRoutes(children) // 递归调用
        }

        let fmRouter = {
            path: path,
            name: name,
            iconCls: iconCls,
            meta: meta,
            children: children,
            // 动态加载 component
            component(resolve) {
                if (component.startsWith("Home")) {
                    require(['../views/' + component + '.vue'], resolve);
                } else if (component.startsWith("Emp")) {
                    require(['../views/emp/' + component + '.vue'], resolve);
                } else if (component.startsWith("Per")) {
                    require(['../views/per/' + component + '.vue'], resolve);
                } else if (component.startsWith("Sal")) {
                    require(['../views/sal/' + component + '.vue'], resolve);
                } else if (component.startsWith("Sta")) {
                    require(['../views/sta/' + component + '.vue'], resolve);
                } else if (component.startsWith("Sys")) {
                    require(['../views/sys/' + component + '.vue'], resolve);
                }/*else if (component.startsWith("Map")) {
                    require(['../views/map/' + component + '.vue'], resolve);
                }*/
            }
        }
        fmRoutes.push(fmRouter);
    })
    return fmRoutes;
}