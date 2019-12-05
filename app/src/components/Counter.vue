<template>
    <div class="counter">

        <h1>
            Welcome to this simple kubernetes deployment.
        </h1>

        <p>
            When you click the button, a request will be sent to an API.
            The API request has logic to generate high cpu load on the API pods.
        </p>

       <!-- <button v-on:click="">Bring the pain!</button>-->

        <h3>I've received {{ count }} clicks.</h3>

    </div>
</template>

<script>
    export default {
        name: 'Counter',
        data: function () {
            return {
                count: 0
            }
        },
        mounted () {
            this.$http.get('http://localhost:32010/api/clicker/count').then((response) => {
                // eslint-disable-next-line no-console
              console.log(response);
                this.count = response.body.count;
            });
        }
    }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
    h3 {
        margin: 40px 0 0;
    }
</style>
