<template>
  <div class="menutree">
    <el-menu router unique-opened>
      <el-submenu :index="index+''" :key="index" v-for="(item,index) in routes"
                  v-if="!item.hidden">
        <template slot="title">
          <i style="color: #409eff;margin-right: 5px" :class="item.iconCls"></i>
          <span>{{ item.name }}</span>
        </template>
        <el-menu-item :index="child.path" :key="index1" v-for="(child,index1) in item.children">
          {{ child.name }}
        </el-menu-item>
      </el-submenu>
    </el-menu>
  </div>
</template>

<script>
export default {
  name: "menuTree",
  // 监听属性 类似于data概念
  computed: {
    routes() {
      // 监听属性 类似于data概念
      return this.$store.state.routes;
    }
  },
}
</script>
<style scoped>
</style>