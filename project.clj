(defproject threatgrid/ring-graphql-voyager "0.1.1-SNAPSHOT"
  :description "GraphQL Voyager for Ring apps"
  :url "https://github.com/threatgrid/ring-graphql-voyager"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo}
  :resource {:resource-paths ["ext/graphql-voyager" "resources/graphql-voyager"]
             :target-path "target/resources/graphql-voyager"
             :skip-stencil [ #".*" ]
             :includes [#"ext/graphql-voyager/dist/.*"
                        #".*react/umd/react\.production\.min\.js"
                        #".*react-dom/umd/react-dom\.production\.min\.js"
                        #"resources/graphql-voyager/index\.html"]}
  :resource-paths ["target/resources"]
  :hooks [leiningen.resource]
  :profiles {:dev {:plugins [[lein-resource "16.9.1"]]}})
