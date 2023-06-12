SUMMARY = "Apache HTTPD configuration for Pagure"
DESCRIPTION = "This package provides the configuration files for deploying \
a Pagure server using the Apache HTTPD server."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.13.3"

RPM_NAME = "pagure-web-apache-httpd-5.13.3-1.4.noarch.rpm"
RPM_HASH = "a673bfbf109bf8cabeb60e1f4ce2c5b2b418956c7e1094edf2e479ae3fdb0a6bde571c50098721d74a54577eb25af330779d00c85a1d4ef92830222392380f46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(pagure-web-apache-httpd) \
pagure-web-apache-httpd"
RDEPENDS:${PN} += "apache2-mod_wsgi-python3 \
pagure"

inherit rpm
