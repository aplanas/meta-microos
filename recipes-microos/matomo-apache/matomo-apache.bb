SUMMARY = "Apache configuration for matomo"
DESCRIPTION = "This subpackage contains the Apache configuration files"
LICENSE = "GPL-3.0-or-later"

PV = "4.14.2"

RPM_NAME = "matomo-apache-4.14.2-1.2.noarch.rpm"
RPM_HASH = "92f3f78ea1cd511887f812fa3901da60ad3a721724bae60df253eee84f8d0e0ddefd1fb756d00f922df467fea954245dc74c1f8fe233399de0480533dfbfa4ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(matomo-apache) matomo-apache"
RDEPENDS:${PN} += "apache2 mod_php_any"

inherit rpm
