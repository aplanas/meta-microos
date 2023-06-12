SUMMARY = "Development files for the Qt 6 Pdf library"
DESCRIPTION = "Development files for the Qt 6 Pdf library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-pdf-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "86aac06e3addb4f4eb828aff0635fb8d7fcdf6c94cafba62a7b89b261a98cf810671cde5aa9a80921f6d39d4cc70044ff7654779d6356556c1d2819de00ec660"

RPROVIDES:${PN} += "cmake(Qt6Pdf) pkgconfig(Qt6Pdf) qt6-pdf-devel qt6-pdf-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Gui) cmake(Qt6Network) libQt6Pdf6 pkgconfig(Qt6Core) pkgconfig(Qt6Gui)"

inherit rpm
