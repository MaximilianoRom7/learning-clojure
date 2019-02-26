(ns basics.views
  (:use hiccup.page hiccup.element)
  (:require [clojure.string :as str]))

(defn page-index []
  (html5
   [:html
    [:head
     (include-css "css/index.css")]
    [:body
     [:div {:class "red-box"}
      [:p "Hello World !"]]]]))
