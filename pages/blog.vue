<template>
  <div><br>
    <h2 class="font">Blog</h2><br>
    <div style="padding-left: 20px; padding-right: 20px">
      <p class="font font-size">Coming Soon!</p>
      <br>
    </div>
    <AppFooter/>
  </div>
</template>

<script>
export default {
  head() {
    return {
      title: 'ImJustDoom - Blog',
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
