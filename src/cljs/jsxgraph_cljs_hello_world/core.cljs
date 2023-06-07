(ns jsxgraph-cljs-hello-world.core
  (:require
   [reagent.core :as reagent :refer [atom]]
   [reagent.dom :as rdom]
   [reagent.session :as session]
   [reitit.frontend :as reitit]
   [clerk.core :as clerk]
   [accountant.core :as accountant]
   [jsxgraph.core :as jsx]))

;(cljs
; [jsx/JSXGraph {:boundingbox [-3 3 3 -3] :axis true}
;  [jsx/Point {:name "A" :size 1 :parents [-1 1]}]
;  [jsx/Point {:id "B" :name "BEE!" :size 1 :parents [2 -1]}]
;  [jsx/Arrow {:size 4
;              :parents ["A" "B"]}]])

(defn hello-world []
  (r/render
    [jsx/JSXGraph {:boundingbox [-3 3 3 -3] :axis true}
     [jsx/Point {:name "A" :size 1 :parents [-1 1]}]
     [jsx/Point {:id "B" :name "BEE!" :size 1 :parents [2 -1]}]
     [jsx/Arrow {:size 4
                 :parents ["A" "B"]}]]
    (js/document.getElementById "app")))

(defn init! []
  (hello-world))
