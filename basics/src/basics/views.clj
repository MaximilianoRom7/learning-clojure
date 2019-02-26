(ns basics.views
  (:use hiccup.page hiccup.element)
  (:require [clojure.string :as str]))

(defn style-inline [s]
  (str/join ";" (map #(str (name %) ":" ((keyword %) s)) (keys s))))

(defn style [s]
  (str ".div1 {" (style-inline s) "}"))

(defn page-index []
  (html5
   [:html
    [:head
     [:style (style {:padding            "20px"
                     :background-color   "red"
                     :color              "black"
                     :font-size          "large"
                     :font-weight        "bold"})]]
    [:body
     [:div {:class "div1"}
      [:p "Hello World !"]]]]))
