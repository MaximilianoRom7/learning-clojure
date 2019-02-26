(ns basics.core
  (:use compojure.core)
  (:require [compojure.route :as route]
            [basics.views :as views])
  (:gen-class))

(defroutes app-routes
  (GET "/" [] (views/page-index))
  (route/resources "/"))
