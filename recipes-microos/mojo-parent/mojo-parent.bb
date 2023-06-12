SUMMARY = "Codehaus MOJO parent project pom file"
DESCRIPTION = "Codehaus MOJO parent project pom file"
LICENSE = "Apache-2.0"

PV = "70"

RPM_NAME = "mojo-parent-70-1.2.noarch.rpm"
RPM_HASH = "a43aaafca9d58ab807844d1889220f0bb39eca15ac1be973d8af89bf4e10cd695b124d36a6f474429cfaf0bfe9ac3c1eb17ad5b957f3f67af93b17120b54abd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mojo-parent \
mvn(org.codehaus.mojo:mojo-parent:pom:) \
mvn(org.codehaus.mojo:mojo:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.junit:junit-bom:pom:)"

inherit rpm
