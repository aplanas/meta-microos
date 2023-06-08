SUMMARY = "Non-ABI stable API for the Qt 6 QuickDialogs2 library"
DESCRIPTION = "This package provides private headers of libQt6QuickDialogs2 that do not have \
any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-quickdialogs2-private-devel-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "c773e39da8965d349d866c6438d1562711db1384e7fa56745b8f3c255abdf085271490411cf9bdd394abc529f730e597a308e6ae7ab2260e7cfac57b124b9c62"

RPROVIDES:${PN} += "qt6-quickdialogs2-private-devel qt6-quickdialogs2-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6QuickDialogs2)"

inherit rpm
