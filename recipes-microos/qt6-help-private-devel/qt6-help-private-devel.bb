SUMMARY = "Non-ABI stable API for the Qt 6 Help library"
DESCRIPTION = "This package provides private headers of libQt6Help that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "6.5.0"

RPM_NAME = "qt6-help-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "eedcb56e6473c01b34210afc2894a9d5c9ca6dd49e50186bf7b01e04fcf6c5c4b769f3578f4e5279af81dd1716a349549f6d3c2926ce85c108694da349032a0a"

RPROVIDES:${PN} += "qt6-help-private-devel qt6-help-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6Help) qt6-core-private-devel"

inherit rpm
