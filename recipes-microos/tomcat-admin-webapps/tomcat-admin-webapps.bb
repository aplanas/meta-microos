SUMMARY = "The host manager and manager web applications for Apache Tomcat"
DESCRIPTION = "The host manager and manager web-based applications for Apache Tomcat."
LICENSE = "Apache-2.0"

PV = "9.0.43"

RPM_NAME = "tomcat-admin-webapps-9.0.43-16.1.noarch.rpm"
RPM_HASH = "1942b887a0c741355b57f0f257f4f1e0dc2d48e4d9fa278aee70b998c2ff1c6fa0912e22b2b51d15e304549c2b14c7a2855ee65fd9dada004ce2eeae7d238434"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(tomcat-admin-webapps) tomcat-admin-webapps"
RDEPENDS:${PN} += "/bin/sh tomcat"

inherit rpm
