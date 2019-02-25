(ns basics.core
  (:use compojure.core)
  (:require [compojure.route :as route])
  (:gen-class))

(defn route_root [name] (str "Hola " name " !"))

(defroutes my_routes
  (GET "/" [] (route_root "Max"))
  (route/resources "/"))
