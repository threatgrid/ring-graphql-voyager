# Ring-Graphql-Voyager
Jar-packaged version of GraphQL Voyager for ring-based clojure web-apps (and other JVM apps).

## Usage

Add the dependency to your `project.clj` file
and you have full GraphiQL ready in `/graphql-voyager` on classpath.
You can override the `index.html`-page by putting a new page into your local `resources/graphql-voyager`-directory.
The default URI for the GraphQL endpoint is `/graphql` but this can be changed by copying `resources/graphql-voyager/conf.js` to your projects
resources dir and editing it.

## Packaging

### Initialize the submodule
```Shell
git submodule init
git submodule update
```

### New GraphQL Voyager version
```Shell
pushd ext/graphiql-voyager
git fetch
git checkout <new tag>
npm install
npm run build:release
popd
git add ext/graphql-voyager # Update submodule to point into new graphql-voyager
vim project.clj README.md # Edit version
git add project.clj README.md
git commit -m "New version"
git tag -a "v2.y.z" -m "v2.y.z"
git push --tags origin master # Push new tags and master
lein do clean, install
```
## Licence

### GraphQL Voyager

APIs-guru/graphql-voyager is licensed under the [MIT License](https://github.com/APIs-guru/graphql-voyager/blob/master/LICENSE)

### These scripts

Copyright © 2015-2016 Cisco Systems

Eclipse Public License v1.0
