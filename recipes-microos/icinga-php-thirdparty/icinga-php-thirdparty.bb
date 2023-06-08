SUMMARY = "Icinga PHP Thirdparty for Icinga Web 2"
DESCRIPTION = "This package bundles all 3rd party PHP libraries \
used by Icinga Web products into one piece, \
which can be integrated as library into Icinga Web 2."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "icinga-php-thirdparty-0.11.0-1.3.noarch.rpm"
RPM_HASH = "4ce6d1e9aa6f9def57773854853a38c18d13d4e8e6eadb7631874fefabf9e8ad0228880db9f2f0591e940216fa5d4987de6f2005b072d3f772789088b254b351"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icinga-php-thirdparty"
RDEPENDS:${PN} += "icinga-php-common php-curl php-json php-soap php-sockets"

inherit rpm
