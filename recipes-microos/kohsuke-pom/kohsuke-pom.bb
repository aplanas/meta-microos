SUMMARY = "Kohsuke parent POM"
DESCRIPTION = "This package contains Kohsuke parent POM file."
LICENSE = "MIT"

PV = "14"

RPM_NAME = "kohsuke-pom-14-1.11.noarch.rpm"
RPM_HASH = "47ebd13879cf0538756a6369e6a3c17709a0671bb72c7de29b72f6e487debcbf7f3380ba4caec2cf48b700ab5f34c01454d4e508fddaca8d1c57296554684eb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kohsuke-pom mvn(org.kohsuke:pom:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem"

inherit rpm
