SUMMARY = "Collection of build features used by qt6-wayland libraries"
DESCRIPTION = "This package contains enabled features information shared by all the \
qt6-wayland libraries."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-waylandglobal-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "b16e79166a98c31e6b6c58064873813e3304a921aba0a2608c2499d4a4d81bb713ec40e0e07f4a5fc86b510902aa5e71240f7f044dd8bb7a49a8d11d9bcd5752"

RPROVIDES:${PN} += "cmake(Qt6WaylandGlobalPrivate) \
qt6-waylandglobal-private-devel \
qt6-waylandglobal-private-devel(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
