<template>
    <span></span>
</template>

<script>
    import { mapActions } from 'vuex'
    export default {
        methods: mapActions(['loadPageAction']),
        name: "LazyLoader",
        mounted() {
            window.onscroll = () => {
                const el = document.documentElement
                const isBottomOfScreen = el.scrollTop + window.innerHeight === el.offsetHeight

                if (isBottomOfScreen) {
                    this.loadPageAction()
                }
            }
        },
        beforeDestroy() {
            window.onscroll = null
        }
    }
</script>

<style scoped>

</style>