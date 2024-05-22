<script lang="ts" setup>
import {h, ref} from 'vue'
import {MenuProps} from "ant-design-vue";


const items = ref<MenuProps['items']>([
  {
    key: 'index',
    label: h('a', {href: '/ox/index'}, '社区'),
    title: '社区',
  },
  {
    key: 'alipay',
    label: h('a', {href: 'https://antdv.com', target: '_blank'}, '帖子'),
    title: '帖子',
  },
]);
const current = ref<string[]>(['index']);
const value = ref<string>('');

const onSearch = (searchValue: string) => {
  console.log('use value', searchValue);
  console.log('or use this.value', value.value);
};
</script>

<template>
  <div class="ox-header">
    <div class="ox-header-left">Ox!
      <svg width="150" height="39" fill="currentColor" focusable="false" aria-hidden="true" class="">
        <use xlink:href="#icon-logo-white"></use>
      </svg>
      <a-menu v-model:selectedKeys="current" mode="horizontal" :items="items"/>
    </div>
    <div class="ox-header-right">
      <a-input-search
          v-model:value="value"
          placeholder="input search text"
          style="width: 200px"
          @search="onSearch"
      />
      <a-button type="primary">登录/注册</a-button>
      <a-avatar src="https://xsgames.co/randomusers/avatar.php?g=pixel&key=1"/>
    </div>
  </div>
</template>

<style lang="less" scoped>
.ox-header {
  display: flex;
  flex-direction: row;
  width: 1280px;
  justify-content: space-between;

  .ox-header-left {
    display: flex;
    flex-direction: row;
    width: 80%;
  }

  .ox-header-right {
    display: flex;
    flex-direction: row;
    justify-content: space-between;
    align-items: center;
    width: 20%;
  }
}
</style>
