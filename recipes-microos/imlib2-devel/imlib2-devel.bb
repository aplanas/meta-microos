SUMMARY = "Imlib 2 - development libraries"
DESCRIPTION = "These are the development headers and library for imlib2."
LICENSE = "BSD-3-Clause"

PV = "1.11.1"

RPM_NAME = "imlib2-devel-1.11.1-1.1.aarch64.rpm"
RPM_HASH = "15ba6c875389352a6d3c6ff5cc12c002f3fe624780750e2dddf2775a8b6510b5a67536459b00689d79df3d8a4992535d12824541994f9068db546100090578ae"

RPROVIDES:${PN} += "imlib2-devel imlib2-devel(aarch-64) pkgconfig(imlib2)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libImlib2-1 xorg-x11-libX11-devel"

inherit rpm
