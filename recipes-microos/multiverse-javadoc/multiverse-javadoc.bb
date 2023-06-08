SUMMARY = "JavaDoc for multiverse"
DESCRIPTION = "JavaDoc for multiverse."
LICENSE = "Apache-2.0"

PV = "0.7.0"

RPM_NAME = "multiverse-javadoc-0.7.0-3.10.noarch.rpm"
RPM_HASH = "52298965c604969764b168df7123c8cfcf8ac01ebe2e96e5406062be103345c27395a4e0fdd620cc5c1e3f5559d71640871f6972c1236f525b09888369c0eca7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "multiverse-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
