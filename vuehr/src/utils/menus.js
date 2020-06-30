import {getRequest} from "./api";

// 初始化左侧菜单
export const initMenu = (router, store) => {
    if (store.state.routes.length > 0) {
        return
    }
    getRequest("/system/config/menu").then(data => {
        if (data) {
            let fmtRoutes = formatRoutes(data);
            router.addRoutes(fmtRoutes);
            // fmtRoutes -> initRoutes
            store.commit('initRoutes', fmtRoutes);
        }
    })
};

// 格式化routes
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

        // 菜单的children
        if (children && children instanceof Array) {
            children = formatRoutes(children) // 递归调用，重新格式化
        }

        let fmRouter = {
            path: path,
            name: name,
            iconCls: iconCls,
            meta: meta,
            children: children,
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
                }
            }
        };
        fmRoutes.push(fmRouter);
    });
    return fmRoutes;
};