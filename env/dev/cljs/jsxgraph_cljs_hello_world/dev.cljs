(ns ^:figwheel-no-load jsxgraph-cljs-hello-world.dev
  (:require
    [jsxgraph-cljs-hello-world.core :as core]
    [devtools.core :as devtools]))

(extend-protocol IPrintWithWriter
  js/Symbol
  (-pr-writer [sym writer _]
    (-write writer (str "\"" (.toString sym) "\""))))

(devtools/install!)

(enable-console-print!)

(core/init!)
