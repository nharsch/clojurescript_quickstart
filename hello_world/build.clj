; import what we need from clojure to transpile cljs to js
(require 'cljs.build.api)

; and transpile
(cljs.build.api/build "src" 
    ; create an entry point
    {:main 'hello-world.core
     :output-to "out/main.js"})


