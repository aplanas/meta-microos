SUMMARY = "Non-ABI stable API for the Qt 6 QuickDialogs2Utils library"
DESCRIPTION = "This package provides private headers of libQt6QuickDialogs2Utils that do not have \
any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quickdialogs2utils-private-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "f51c3c26fe5f12644549d31221ece2987bd2ecadc1c2db2a842e8b7f8b98417b2eaeb7ebb92335efe9a056d8244dcfe6e09b11de733821ed6f95193f628ab5d2"

RPROVIDES:${PN} += "qt6-quickdialogs2utils-private-devel qt6-quickdialogs2utils-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6QuickDialogs2Utils)"

inherit rpm
