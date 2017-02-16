(ns learndatatable.views
    (:require [reagent.core :as reagent]
              [re-frame.core :as re-frame]))


(defn home-render []
  [:table.display
   {:cell-spacing "0" :width "100%"}

   [:thead>tr
    [:th "Name"]
    [:th "Age"]]

   [:tbody
    [:tr
     [:td "Matthew"]
     [:td "26"]]

    [:tr
     [:td "Anna"]
     [:td "24"]]

    [:tr
     [:td "Michelle"]
     [:td "42"]]

    [:tr
     [:td "Frank"]
     [:td "46"]]
    [:tr
     [:td "Matthew"]
     [:td "26"]]

    [:tr
     [:td "Anna"]
     [:td "24"]]

    [:tr
     [:td "Michelle"]
     [:td "42"]]

    [:tr
     [:td "Frank"]
     [:td "46"]]

    [:tr
     [:td "Matthew"]
     [:td "26"]]

    [:tr
     [:td "Anna"]
     [:td "24"]]

    [:tr
     [:td "Michelle"]
     [:td "42"]]

    [:tr
     [:td "Frank"]
     [:td "46"]]
    ]])


(defn home-did-mount [this]
  (.DataTable (js/$ (reagent/dom-node this))))


(defn home []
  (reagent/create-class {:reagent-render home-render
                         :component-did-mount home-did-mount}))

(defn main-panel []
  (let [name (re-frame/subscribe [:name])]
    (fn []
      [:div "Hello from " @name
       [home]])))
