<template>
  <div><br>
    <h2 class="font">Hey, I'm JustDoom</h2><br>
    <div style="padding-left: 20px; padding-right: 20px">
      
    </div>
    <AppFooter/>
  </div>
</template>

<script>
import Vue from "vue";

export default {
  head() {
    return {
      title: 'ImJustDoom - Home',
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
