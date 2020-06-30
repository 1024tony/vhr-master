import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
import 'font-awesome/css/font-awesome.min.css';

Vue.use(ElementUI);

Vue.config.productionTip = false;

import {postKeyValueRequest} from "./utils/api";
import {postRequest} from "./utils/api";
import {getRequest} from "./utils/api";
import {putRequest} from "./utils/api";
import {deleteRequest} from "./utils/api";
import {initMenu} from "./utils/menus";

// 添加 Vue 实例方法
Vue.prototype.postKeyValueRequest = postKeyValueRequest;
Vue.prototype.postRequest = postRequest;
Vue.prototype.getRequest = getRequest;
Vue.prototype.putRequest = putRequest;
Vue.prototype.deleteRequest = deleteRequest;

// 注册一个全局前置守卫：
router.beforeEach((to, from, next) => {
  if (to.path == '/') {
    next();
  } else {
    // 如果登录，初始化菜单
    if(window.sessionStorage.getItem("user")){
      initMenu(router, store);
      next();
    }else {
      // 没有登录，则跳转登录页,->重定向到未登录要请求的页面
      next('/?redirect='+to.path);
    }

  }
});

new Vue({
  router,
  store,
  render: h => h(App)
}).$mount('#app');
