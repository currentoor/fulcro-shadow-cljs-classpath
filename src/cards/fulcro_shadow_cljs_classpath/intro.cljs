(ns fulcro-shadow-cljs-classpath.intro
  (:require [devcards.core :as rc :refer-macros [defcard]]
            [fulcro-shadow-cljs-classpath.ui.components :as comp]))

(defcard SVGPlaceholder
  "# SVG Placeholder"
  (comp/ui-placeholder {:w 200 :h 200}))
