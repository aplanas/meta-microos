SUMMARY = "Non-ABI stable API for the Qt 6 3DRender library"
DESCRIPTION = "This package provides private headers of libQt63DRender that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-3drender-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "2297f7f802998872d28fd74d8517810ff1b153edd436ab94adab31339bbcbea9fdea8f59569428c5b5cde25a38e899ceadfe16369d9100925c4c5dc725f784e1"

RPROVIDES:${PN} += "qt6-3drender-private-devel qt6-3drender-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt63DRender)"

inherit rpm
