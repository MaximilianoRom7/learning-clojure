(ns basics.views
  (:use hiccup.page hiccup.element)
  (:require [clojure.string :as str]))

(defn style-inline [s]
  (str/join ";" (map #(str (name %) ":" ((keyword %) s)) (keys s))))



(defn page-index []
  (html5
   [:html
    [:head
     [:style]]
    [:body
     [:div {:style (style-inline {:padding            "20px"
                                  :background-color   "red"
                                  :color              "black"
                                  :font-size          "large"
                                  :font-weight        "bold"})}
      [:p "Hello World !"]]]]))