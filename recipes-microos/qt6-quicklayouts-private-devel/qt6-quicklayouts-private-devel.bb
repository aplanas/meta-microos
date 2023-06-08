SUMMARY = "Non-ABI stable API for the Qt 6 QuickLayouts library"
DESCRIPTION = "This package provides private headers of libQt6QuickLayouts that do not have \
any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-quicklayouts-private-devel-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "d58e1c734e699aa40feb19d4f8df96e77830315715f7aa17a22c00bb8c51e16c8a05fa50a146d4bbb67154a83190a967988be599357f1bb7cb9f20d29fd675f7"

RPROVIDES:${PN} += "qt6-quicklayouts-private-devel qt6-quicklayouts-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6QuickLayouts)"

inherit rpm
