SUMMARY = "Libyui - Header files for the Qt REST API plugin"
DESCRIPTION = "This provides a libyui REST API plugin for the Qt frontend. \
 \
This package contains the header files for the plugin. \
 \
This is not needed for using the REST API, only for developing \
extensions for it."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "4.5.2"

RPM_NAME = "libyui-qt-rest-api-devel-4.5.2-1.1.aarch64.rpm"
RPM_HASH = "8eb1616887279e5f3910c1327dbac969a39611ee3600e64d8c4349f580060a19e807a53297508e5b68f4f94e1bca4b6f50bce982c19718723766bbae66043504"

RPROVIDES:${PN} += "libyui-qt-rest-api-devel libyui-qt-rest-api-devel(aarch-64)"
RDEPENDS:${PN} += "glibc-devel libstdc++-devel libyui-qt-devel libyui-qt-rest-api16 libyui-rest-api-devel"

inherit rpm
