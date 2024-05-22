import { createRouter, createWebHistory } from 'vue-router';

import Customer from "../pages/customer/index.vue";

import Index from "../pages/customer/index/index.vue";

const router = createRouter({
    history: createWebHistory(),
    routes: [
        {
            path: '/',
            component: Customer,
            children:[
                {
                    path: 'ox/index',
                    name: 'Index',
                    component: Index
                }
            ]
        }
    ],
    scrollBehavior() {
        return { top: 0 };
    },
});

export default router;
