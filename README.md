# hermes-javadoc

1. Build the update hermes2_src.zip
   - mvn pre-clean; mvn compile; mvn package -Dmaven.test.skip=true

2. Copy and unzip the hermes2_src.zip to javasrc\ folder

3. Create destination folder javadest\

4. Install javasphinx by following steps in https://sites.google.com/a/cecid.org/dev/devops/python/set-up-sphinx

5. Run javasphinx-apidoc to create JavaDoc in RST format
   - \rm -rf docs\source\hk
   - javasphinx-apidoc -o javadest docs\source

6. Update the docs\source\index.rst by the newly generated docs\source\package.rst

7. Rebuild the HTML
   - cd docs
   - make html
