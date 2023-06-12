SUMMARY = "JFree Base Services"
DESCRIPTION = "LibBase is a library developed to provide base services like logging, \
configuration and initialization to other libraries and applications. The \
library is the root library for all Pentaho-Reporting projects."
LICENSE = "LGPL-2.0-only"

PV = "1.1.6"

RPM_NAME = "libbase-1.1.6-1.4.noarch.rpm"
RPM_HASH = "93d51e2fe5c04d2f94a16ac6cd7e2880fb3fd3a5ff3d7bc9e7922b8e8c453f3300990bf07c3f39ebd9739bcb713ce49043a1be4b07c1e16acb95bca62017640b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libbase"
RDEPENDS:${PN} += "apache-commons-logging \
java \
jpackage-utils"

inherit rpm
