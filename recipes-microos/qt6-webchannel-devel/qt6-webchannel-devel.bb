SUMMARY = "Qt 6 WebChannel library - Development files"
DESCRIPTION = "Development files for the Qt 6 WebChannel library"
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-webchannel-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "2eb239f63560bf2d6f5a329c9967c9f4113c538d059dda0aae9f7cff6f456a0cb305bfa56923e2a362c045cdf2bc08ffd2152ff8d8c28c48d857916366973143"

RPROVIDES:${PN} += "cmake(Qt6WebChannel) pkgconfig(Qt6WebChannel) qt6-webchannel-devel qt6-webchannel-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Qml) libQt6WebChannel6 pkgconfig(Qt6Core) pkgconfig(Qt6Qml)"

inherit rpm
