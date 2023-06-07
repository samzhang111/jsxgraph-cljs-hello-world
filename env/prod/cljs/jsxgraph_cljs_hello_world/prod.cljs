(ns jsxgraph-cljs-hello-world.prod
  (:require [jsxgraph-cljs-hello-world.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
