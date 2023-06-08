SUMMARY = "Non-ABI stable API for the Qt 6 3DQuickScene2D library"
DESCRIPTION = "This package provides private headers of libQt63DQuickScene2D that do not have \
any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-3dquickscene2d-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "cf741f292cb99119e86013e7549e683802e5136c3b77d4c6242bf04a3c0d81cc74f9fd3e321c6bcb4043876321705c604152c4af000fb7ea96bf2030abc03c04"

RPROVIDES:${PN} += "qt6-3dquickscene2d-private-devel qt6-3dquickscene2d-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt63DQuickScene2D)"

inherit rpm
