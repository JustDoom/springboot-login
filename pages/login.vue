<template>
  <div><br>
    <h2 class="font">Login</h2><br>
    <div style="padding-left: 20px; padding-right: 20px">
      <p class="font font-size">Username: <input type="text" placeholder="Username" id="username"></p>
      <p class="font font-size">Password: <input type="password" placeholder="Password" id="password"></p>
      <button v-on:click="login" id="submit">Submit</button>
      <br>
    </div>
    <AppFooter/>
  </div>
</template>

<script>
import axios from "axios";

export default {
  methods: {
    login: async function () {
      try {
        const res = await axios.post("http://localhost:8080/login", {
          "name": document.getElementById("username").value,
          "password": document.getElementById("password").value
        }, {
          withCredentials: true,
          headers: {
            //"Access-Control-Allow-Origin": 'http://localhost:3000',
          },
        });

        //if (res.data.cookie !== undefined) document.cookie = res.data.cookie;

      } catch (e) {
        console.log(e);
      }
    }
  },
  head() {
    return {
      title: 'ImJustDoom - Login',
      meta: [
        {
          hid: "description",
          name: "description",
          content: "Home"
        }
      ]
    }
  }
}
</script>

<style>
.font {
  font-family: "Helvetica Neue", sans-serif;
}

.font-size {
  font-size: 14px;
  line-height: 1.4;
}
</style>
