(require 'cljs.build.api)

; let's watch the source file with this handy
; watch tool from clojure
(cljs.build.api/watch "src"
  {:main 'hello-world.core
   :output-to "out/main.js"})
