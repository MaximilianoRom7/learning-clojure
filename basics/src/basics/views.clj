(ns basics.views
  (:use hiccup.page hiccup.element))

(defn page-index []
  (html5
   [:html
    [:head]
    [:body
     [:p "Hello World !"]]]))
