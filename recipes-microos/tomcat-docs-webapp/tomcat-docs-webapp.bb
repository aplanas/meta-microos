SUMMARY = "The 'docs' web application for Apache Tomcat"
DESCRIPTION = "The documentation of web application for Apache Tomcat."
LICENSE = "Apache-2.0"

PV = "9.0.43"

RPM_NAME = "tomcat-docs-webapp-9.0.43-16.1.noarch.rpm"
RPM_HASH = "cb96f502fd90481dff12c5a3396e79ca479e014288721c12f319a0cb840898ebcece441fd934d6059be5b52312ffb7b6a90f40bc7567d1f09d391ac1ff4fe14d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tomcat-docs-webapp"
RDEPENDS:${PN} += "/bin/sh tomcat"

inherit rpm
