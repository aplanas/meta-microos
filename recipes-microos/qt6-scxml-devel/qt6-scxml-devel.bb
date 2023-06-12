SUMMARY = "Qt 6 Scxml library - Development files"
DESCRIPTION = "Development files for the Qt 6 Scxml library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-scxml-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "b2c665286569d5abc940a0d15a45a3174875e42582eb74bafaeeee0f42cfbaa52187c4bc9e0ebd3ccaf5beae1f8a568a0641c298634dbbb83abb8a38c195e620"

RPROVIDES:${PN} += "cmake(Qt6Scxml) cmake(Qt6ScxmlTools) pkgconfig(Qt6Scxml) qt6-scxml-devel qt6-scxml-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Core) libQt6Scxml6 pkgconfig(Qt6Core) qt6-scxml"

inherit rpm
