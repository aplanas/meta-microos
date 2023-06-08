SUMMARY = "Maven Native Components"
DESCRIPTION = "Maven Native Components."
LICENSE = "Apache-2.0 & MIT"

PV = "1.0~alpha11"

RPM_NAME = "maven-native-components-1.0~alpha11-4.8.noarch.rpm"
RPM_HASH = "681fcc7300362142020318eff84000cc0cd633dabc4765a30bd6254d4c14a88b01974be7b53829b9afd4a072c3da5273cdf6ccc770a6ef53ed362798f87e2355"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-native-components mvn(org.codehaus.mojo.natives:maven-native-bcc) mvn(org.codehaus.mojo.natives:maven-native-bcc:pom:) mvn(org.codehaus.mojo.natives:maven-native-components:pom:) mvn(org.codehaus.mojo.natives:maven-native-generic-c) mvn(org.codehaus.mojo.natives:maven-native-generic-c:pom:) mvn(org.codehaus.mojo.natives:maven-native-javah) mvn(org.codehaus.mojo.natives:maven-native-javah:pom:) mvn(org.codehaus.mojo.natives:maven-native-manager) mvn(org.codehaus.mojo.natives:maven-native-manager:pom:) mvn(org.codehaus.mojo.natives:maven-native-mingw) mvn(org.codehaus.mojo.natives:maven-native-mingw:pom:) mvn(org.codehaus.mojo.natives:maven-native-msvc) mvn(org.codehaus.mojo.natives:maven-native-msvc:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.codehaus.mojo.natives:maven-native-api) mvn(org.codehaus.plexus:plexus-container-default) mvn(org.codehaus.plexus:plexus-utils)"

inherit rpm
