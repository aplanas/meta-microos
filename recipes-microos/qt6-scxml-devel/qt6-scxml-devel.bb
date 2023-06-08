SUMMARY = "Qt 6 Scxml library - Development files"
DESCRIPTION = "Development files for the Qt 6 Scxml library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-scxml-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "68b6f51ffe37463fc5f6639e105a0ac13998533831ab34cd89dd11f64cc3c09f77c6f2d20221089f90a48a1988926911d0efc31f35c9bba0a6de62057133b9ef"

RPROVIDES:${PN} += "cmake(Qt6Scxml) cmake(Qt6ScxmlTools) pkgconfig(Qt6Scxml) qt6-scxml-devel qt6-scxml-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Core) libQt6Scxml6 pkgconfig(Qt6Core) qt6-scxml"

inherit rpm
