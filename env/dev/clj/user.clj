(ns user
 (:require [figwheel-sidecar.repl-api :as ra]))

(defn start-fw []
 (ra/start-figwheel!))

(defn stop-fw []
 (ra/stop-figwheel!))

(defn cljs []
 (ra/cljs-repl))

(mentat.clerk-utils.css/set-css!
 "https://cdn.jsdelivr.net/npm/jsxgraph@1.5.0/distrib/jsxgraph.css")
