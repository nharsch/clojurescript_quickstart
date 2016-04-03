
# Notes

clojure transpiles clojurescript to javascript

google closure library managers JS dependencies

clojure comes with watch tool that will watch for file changes to kick off new builds

## Classpaths

When building, to extend classpath: 

    java -cp cljs.jar:src:react-0.12.2-8.jar clojure.main build.clj

lib --> clojure --> build

## Browser REPL

defonce ensures the connection is constructed only one time

:reload keyword relaods source

## Compiling for Node

npm install source-map-support

optimization not really needed for node

## Node repl

Super easy

## Dependencies

CLJSJS has nice set of curated JS libs

you can put dependencies in a `lib` dir and declare like this:

    java -cp 'cljs.jar:lib/*:src' clojure.main build.clj

### Leiningen

With Lein, you don't need to specify the classpath (Huzzah!)

