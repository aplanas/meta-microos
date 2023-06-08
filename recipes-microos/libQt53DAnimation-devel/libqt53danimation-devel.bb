SUMMARY = "Development files for the Qt 5 3D Animation library"
DESCRIPTION = "Development files for the Qt 5 3D Animation library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde0"

RPM_NAME = "libQt53DAnimation-devel-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "8b800077fecf960014512c301669aa04b1fdf03a5da2f265712a9fe170ebffa3450441642f3ee7b798167a5e10168e6275b5cd134f5e4d6af8943a8756ae43d7"

RPROVIDES:${PN} += "cmake(Qt53DAnimation) libQt53DAnimation-devel libQt53DAnimation-devel(aarch-64) pkgconfig(Qt53DAnimation)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libQt53DAnimation5 pkgconfig(Qt53DCore) pkgconfig(Qt53DRender) pkgconfig(Qt5Core) pkgconfig(Qt5Gui)"

inherit rpm
