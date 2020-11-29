import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    routes:[] // 路由数组（菜单项）
  },
  // 更改 Vuex 的 store 中的状态的唯一方法是提交 mutation
  mutations: {
    // data: 传进来的参数
    initRoutes(state,data){
      state.routes = data
    }
  },
  /*
   * Action 类似于 mutation，不同在于：
   *  Action 提交的是 mutation，而不是直接变更状态。
   *  Action 可以包含任意异步操作。
   * */
  actions: {

  },
  modules: {
  }
})
