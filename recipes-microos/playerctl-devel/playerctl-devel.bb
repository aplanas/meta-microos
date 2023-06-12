SUMMARY = "Development files for libplayerctl"
DESCRIPTION = "This package provides libraries and headers for developing applications that \
use libplayerctl."
LICENSE = "LGPL-3.0-or-later"

PV = "2.4.1"

RPM_NAME = "playerctl-devel-2.4.1-1.8.aarch64.rpm"
RPM_HASH = "1966bd8eaa5a13d0b380ffc9397910b6b7b0c1879d2af96f168b03efd58ba73b7b7306d731c682aaa047518001f14e6484da107e16b1d0ea4512928e9d296026"

RPROVIDES:${PN} += "pkgconfig(playerctl) \
playerctl-devel \
playerctl-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libplayerctl2 \
pkgconfig(gio-2.0) \
pkgconfig(gio-unix-2.0) \
pkgconfig(gobject-2.0)"

inherit rpm
