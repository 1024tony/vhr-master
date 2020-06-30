import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex);

export default new Vuex.Store({
  state: {
    routes:[],

  },
  mutations: {
    // 初始化路由数组
    initRoutes(state, data) {
      state.routes = data;
    },
  },
  actions: {

  },
  modules: {
  }
})
