SUMMARY = "XMvn Parent POM"
DESCRIPTION = "This package provides XMvn parent POM."
LICENSE = "Apache-2.0"

PV = "4.2.0"

RPM_NAME = "xmvn-parent-4.2.0-2.1.noarch.rpm"
RPM_HASH = "2fad9fd07641d5146e7df4e655e9493979bbca2d05f769dbf6216d63183d2bccd949eae0c44451fc584ab1ce1ddd186dd0d7a37a8b5c1c9ebbabcb5f86207a4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.fedoraproject.xmvn:xmvn-parent:pom:) \
xmvn-parent \
xmvn-parent-pom"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
