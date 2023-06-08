SUMMARY = "Apache configuration for matomo"
DESCRIPTION = "This subpackage contains the Apache configuration files"
LICENSE = "GPL-3.0-or-later"

PV = "4.14.2"

RPM_NAME = "matomo-apache-4.14.2-1.1.noarch.rpm"
RPM_HASH = "7ce1eed6be76fde3e6239a26441f469db13f1e8c35c446fc9df43ffbb3550e0cdde10f9b4613bd4a8e0451d701a677acbf758c2958cbe3298a7dbeacfd629e50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(matomo-apache) matomo-apache"
RDEPENDS:${PN} += "apache2 mod_php_any"

inherit rpm
