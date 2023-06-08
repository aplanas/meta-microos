SUMMARY = "Development files for the Qt 6 Pdf library"
DESCRIPTION = "Development files for the Qt 6 Pdf library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-pdf-devel-6.5.0-1.2.aarch64.rpm"
RPM_HASH = "0b9a9744aecbcdf6a0a427b5067ef4c543e4b81f12fc717487550ff98f88e9b08456f2e128bdfb346672dfffd56bec710194fc86ab2c8f5368d05b63c0c6c2df"

RPROVIDES:${PN} += "cmake(Qt6Pdf) pkgconfig(Qt6Pdf) qt6-pdf-devel qt6-pdf-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Gui) cmake(Qt6Network) libQt6Pdf6 pkgconfig(Qt6Core) pkgconfig(Qt6Gui)"

inherit rpm
