<html>
<head>
<style type="text/css">
#slideshow {
  margin: 50px auto;
  position: relative;
  width: 240px;
  height: 240px;
  padding: 10px;
  box-shadow: 0 0 20px rgba(0,0,0,0.4);
}
#slideshow > div {
  position: absolute;
  top: 10px;
  left: 10px;
  right: 10px;
  bottom: 10px;
}
</style>
<script type="text/javascript" src="/js/jquery.js"></script>
<script type="text/javascript">
$("#slideshow > div:gt(0)").hide();
setInterval(function() {
 $('#slideshow > div:first')
  .fadeOut(1000)
  .next()
  .fadeIn(1000)
  .end()
  .appendTo('#slideshow');
}, 3000);
</script>
</head>
<body>
<h2>Hello World! shome</h2>
<div id="slideshow">
  <div>
   <img src="/images/2.jpg">
  </div>
  <div>
   <img src="/images/1.png">
  </div>
  <div>
   Pretty cool eh? This slide is proof the content can be anything.
  </div>
</div>

</body>
</html>
