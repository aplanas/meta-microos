SUMMARY = "ROOT and examples web applications for Apache Tomcat"
DESCRIPTION = "The ROOT and examples web applications for Apache Tomcat"
LICENSE = "Apache-2.0"

PV = "9.0.43"

RPM_NAME = "tomcat-webapps-9.0.43-16.1.noarch.rpm"
RPM_HASH = "baf8dded78150c8e162dd7a856a374151d1e2a0f5bf71727db2b9980b789789a74cdc631a87f21f7af1dbc4a92e5b6a724cc06fd5c7952a54c79c85ca833479a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(tomcat-webapps) tomcat-webapps"
RDEPENDS:${PN} += "/bin/sh jakarta-taglibs-standard tomcat"

inherit rpm
