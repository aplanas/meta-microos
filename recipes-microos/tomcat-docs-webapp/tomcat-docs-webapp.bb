SUMMARY = "The 'docs' web application for Apache Tomcat"
DESCRIPTION = "The documentation of web application for Apache Tomcat."
LICENSE = "Apache-2.0"

PV = "9.0.75"

RPM_NAME = "tomcat-docs-webapp-9.0.75-1.1.noarch.rpm"
RPM_HASH = "aa8756c79e0cd87e4cd82cd3e700e8abd2db39d29c434caedf36a3745b4edc0ca8280a928e8f8b633acff5527488089ccb6ff00da3846d58351d8a2affa3707e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tomcat-docs-webapp"
RDEPENDS:${PN} += "/bin/sh tomcat"

inherit rpm
