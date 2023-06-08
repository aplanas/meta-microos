SUMMARY = "Development files for kiten"
DESCRIPTION = "Kiten is a tool to learn Japanese. \
 \
This package contains files for developing applications using kiten."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kiten-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "1396611f211fae071ed09c670bf6587bc837943ea277d6fe0c33670debd8e5bf5e13bc96ad34bc32bddc17513de563d5e0d26fe9fa11d3feaecedaf8e937c259"

RPROVIDES:${PN} += "kiten-devel kiten-devel(aarch-64)"
RDEPENDS:${PN} += "kiten"

inherit rpm
