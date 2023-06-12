SUMMARY = "Apache configuration for nextcloud"
DESCRIPTION = "This subpackage contains the Apache configuration files"
LICENSE = "AGPL-3.0-only"

PV = "25.0.7"

RPM_NAME = "nextcloud-apache-25.0.7-1.1.noarch.rpm"
RPM_HASH = "129c8a96b85dcd6f3912c7ae33d930f5b8716b7bc821cc1af6d9c3017379ce77f9f27d363c045e856543faccff43bb9222d91bec0e3571871176ff7a4e210d42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(nextcloud-apache) \
nextcloud-apache"
RDEPENDS:${PN} += "apache2 \
mod_php_any \
nextcloud"

inherit rpm
