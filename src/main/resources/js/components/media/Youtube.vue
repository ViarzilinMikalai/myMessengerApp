<template>
    <iframe
            width="560"
            height="315"
            :src="targetSrc"
            frameborder="0"
            allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture"
            allowfullscreen
    ></iframe>
</template>

<script>
    export default {
        name: "Youtube",
        props: ['src'],
        computed: {
            targetSrc(){
                let parts = this.src.split('/');
                // return 'https://www.youtube.com/embed/${parts[parts.length - 1]}';
                if (parts[parts.length - 1].indexOf("watch") > -1) {
                    return `https://www.youtube.com/embed/${parts[parts.length - 1].slice(8)}`
                } else
                    return `https://www.youtube.com/embed/${parts[parts.length - 1]}`;
            }

        }
    }
</script>

<style scoped>

</style>