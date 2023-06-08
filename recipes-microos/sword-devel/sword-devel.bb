SUMMARY = "Include files and static libraries for developing sword applications"
DESCRIPTION = "Include files and static libraries for developing sword applications. This package \
is required to compile Sword frontends, too."
LICENSE = "GPL-2.0-only & Apache-2.0"

PV = "1.8.1"

RPM_NAME = "sword-devel-1.8.1-1.32.aarch64.rpm"
RPM_HASH = "1b4d896aeb5612ed75deb69d52a09975bd64695ec27b52b7dc9a98bd1559d5d9e1cc5d3b7e26b2a4c155fa0d14897accca583a6230911f3bbef1262e241b3dca"

RPROVIDES:${PN} += "pkgconfig(sword) sword-devel sword-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libsword-1_8_1 pkgconfig(libcurl)"

inherit rpm
