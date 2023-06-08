SUMMARY = "Apache configuration for nextcloud"
DESCRIPTION = "This subpackage contains the Apache configuration files"
LICENSE = "AGPL-3.0-only"

PV = "25.0.6"

RPM_NAME = "nextcloud-apache-25.0.6-1.1.noarch.rpm"
RPM_HASH = "796451695f08ee8729cc0bcf7f8ebdd33497863ba3afeff0ca62a49dd43ffc331cfdf93d7cd6055baef2692b126ac40da5cc708dd9d02d1685670977d0e88ba3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(nextcloud-apache) nextcloud-apache"
RDEPENDS:${PN} += "apache2 mod_php_any nextcloud"

inherit rpm
