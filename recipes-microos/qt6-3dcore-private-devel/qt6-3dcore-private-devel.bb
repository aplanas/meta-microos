SUMMARY = "Non-ABI stable API for the Qt 6 3DCore library"
DESCRIPTION = "This package provides private headers of libQt63DCore that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-3dcore-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "45faa2901354db59635ef0ffc7e405488a02dbc9769e34bdfcd43b186db0a1efd37cf5998056b4469aba326dffd86900cbc8ee77254cb79e5ee956b21032f26a"

RPROVIDES:${PN} += "qt6-3dcore-private-devel qt6-3dcore-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt63DCore)"

inherit rpm
