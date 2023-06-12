SUMMARY = "Development files for the Qt 5 3D Extras libary"
DESCRIPTION = "Development files for the Qt 5 3D Extras library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde0"

RPM_NAME = "libQt53DExtras-devel-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "c354a7c359c67ddd8dbb426a5c1b8c39b31341a985a47320fb98c0dd32fc034615efc78475435e2fb8e0726a504dfbf1789c9be98466746d8aa60dbcfe7baa1d"

RPROVIDES:${PN} += "cmake(Qt53DExtras) \
libQt53DExtras-devel \
libQt53DExtras-devel(aarch-64) \
pkgconfig(Qt53DExtras)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt53DExtras5 \
pkgconfig(Qt53DCore) \
pkgconfig(Qt53DInput) \
pkgconfig(Qt53DLogic) \
pkgconfig(Qt53DRender) \
pkgconfig(Qt5Core) \
pkgconfig(Qt5Gui)"

inherit rpm
