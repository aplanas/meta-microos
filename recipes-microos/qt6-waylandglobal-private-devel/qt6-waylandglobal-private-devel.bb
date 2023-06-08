SUMMARY = "Collection of build features used by qt6-wayland libraries"
DESCRIPTION = "This package contains enabled features information shared by all the \
qt6-wayland libraries."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-waylandglobal-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "5fbb511ff0dc89d6a13a5c7acaeb4c079db66f712479990c5548f3ba32fe6b6789c0ded23472b8bc62f610cc70e805683e7822c183c3eab6fa70a0ca3e209b96"

RPROVIDES:${PN} += "cmake(Qt6WaylandGlobalPrivate) qt6-waylandglobal-private-devel qt6-waylandglobal-private-devel(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
