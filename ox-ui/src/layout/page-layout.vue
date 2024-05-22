<script lang="ts">
import type {CSSProperties} from 'vue';
import {defineComponent} from 'vue'
import OxHeader from "../components/ox-header.vue";

const headerStyle: CSSProperties = {
  display: 'flex',
  justifyContent:'center',
  margin: '0 auto',
  textAlign: 'center',
  color: '#fff',
  height: 64,
  paddingInline: 50,
  lineHeight: '64px',
  backgroundColor: '#ffffff',
  width: '100%'
};

const contentStyle: CSSProperties = {
  textAlign: 'center',
  minHeight: 120,
  lineHeight: '120px',
  color: '#fff',
};


const footerStyle: CSSProperties = {
  textAlign: 'center',
  color: '#fff'
};
export default defineComponent({
  name: "page-layout.vue",
  components: {OxHeader},
  setup() {
      return {
        headerStyle,
        contentStyle,
        footerStyle
      }
  },
})
</script>

<template>
  <a-layout :style ="{width:'100%',height:'100%'}">
    <a-layout-header :style="headerStyle">
      <ox-header/>
    </a-layout-header>
    <a-layout-content :style="contentStyle">
      <router-view/>
    </a-layout-content>
    <a-layout-footer :style="footerStyle">Footer</a-layout-footer>
  </a-layout>
</template>

<style scoped>

</style>
