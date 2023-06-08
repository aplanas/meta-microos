SUMMARY = "Development files for libwpe"
DESCRIPTION = "The libwpe-devel package contains libraries, build data, and \
header files for developing applications that use libwpe."
LICENSE = "BSD-2-Clause"

PV = "1.14.0"

RPM_NAME = "libwpe-devel-1.14.0-1.2.aarch64.rpm"
RPM_HASH = "665f93f31b23c05ac2c436b3435ddfdcbe10f54c24193dc173f47597f83324668e21be9e88d604ff625c1d6bb9439f14b788f27270b1070ffa86c81ee6b6dd26"

RPROVIDES:${PN} += "libwpe-devel libwpe-devel(aarch-64) pkgconfig(wpe-1.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libwpe-1_0-1 pkgconfig(egl) pkgconfig(xkbcommon)"

inherit rpm
