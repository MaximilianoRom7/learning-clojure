(ns basics.core
  (:use compojure.core)
  (:require [compojure.route :as route])
  (:gen-class))

(defroutes my_routes
  (GET "/" [] (route_root "Max"))
  (route/resources "/"))
