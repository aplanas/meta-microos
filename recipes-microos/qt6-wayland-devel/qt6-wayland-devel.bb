SUMMARY = "Qt6 Wayland development meta package"
DESCRIPTION = "This meta-package requires all the qt6-wayland development packages."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-wayland-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "8c403288c57d014477412972b225562e8d2166f125b2f22118124415481a7baf8c482b328fb67feabff1aedd1d08189ad65655eec93834d2f1f4f80954811ba7"

RPROVIDES:${PN} += "qt6-wayland-devel \
qt6-wayland-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6WaylandClient) \
cmake(Qt6WaylandCompositor) \
cmake(Qt6WaylandGlobalPrivate)"

inherit rpm
