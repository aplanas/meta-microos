SUMMARY = "Non-ABI stable API for the Qt 6 3DQuickScene2D library"
DESCRIPTION = "This package provides private headers of libQt63DQuickScene2D that do not have \
any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-3dquickscene2d-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "b2f60ce26eb3c15ed0905cece94dd17430a60270556ec47c2ede7934553837080e0efd3a421266a9ae7ebcea35261a51322319def7e49ddd951fddf2c93fc878"

RPROVIDES:${PN} += "qt6-3dquickscene2d-private-devel \
qt6-3dquickscene2d-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt63DQuickScene2D)"

inherit rpm
