SUMMARY = "Qt 6 WebChannel library - Development files"
DESCRIPTION = "Development files for the Qt 6 WebChannel library"
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-webchannel-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "80d67647078745334b320043c39f6b4d2b6df861c39334bfb0a8957e7d27831efae50301cdbe037f9f12d7ab077e62bb76a9865194a1fa477b64617e57c253f5"

RPROVIDES:${PN} += "cmake(Qt6WebChannel) pkgconfig(Qt6WebChannel) qt6-webchannel-devel qt6-webchannel-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Qml) libQt6WebChannel6 pkgconfig(Qt6Core) pkgconfig(Qt6Qml)"

inherit rpm
