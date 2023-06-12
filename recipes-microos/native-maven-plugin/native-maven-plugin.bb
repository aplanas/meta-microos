SUMMARY = "Native Maven Plugin"
DESCRIPTION = "Native Maven Plugin."
LICENSE = "Apache-2.0 & MIT"

PV = "1.0~alpha11"

RPM_NAME = "native-maven-plugin-1.0~alpha11-4.8.noarch.rpm"
RPM_HASH = "065576db52135e8ab523d49f5e416b1415d112b6f4527219123742d9239e99bc905fdc6992c2086b80d0ad6bd909b9835570dfa06db841c39ce9f3295a04bc54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.codehaus.mojo:native-maven-plugin) \
mvn(org.codehaus.mojo:native-maven-plugin:pom:) \
native-maven-plugin"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.apache.bcel:bcel) \
mvn(org.apache.maven:maven-aether-provider) \
mvn(org.apache.maven:maven-artifact) \
mvn(org.apache.maven:maven-compat) \
mvn(org.apache.maven:maven-core) \
mvn(org.apache.maven:maven-model) \
mvn(org.apache.maven:maven-plugin-api) \
mvn(org.codehaus.mojo.natives:maven-native-api) \
mvn(org.codehaus.mojo.natives:maven-native-bcc) \
mvn(org.codehaus.mojo.natives:maven-native-generic-c) \
mvn(org.codehaus.mojo.natives:maven-native-javah) \
mvn(org.codehaus.mojo.natives:maven-native-manager) \
mvn(org.codehaus.mojo.natives:maven-native-mingw) \
mvn(org.codehaus.mojo.natives:maven-native-msvc) \
mvn(org.codehaus.plexus:plexus-archiver) \
mvn(org.codehaus.plexus:plexus-utils)"

inherit rpm
