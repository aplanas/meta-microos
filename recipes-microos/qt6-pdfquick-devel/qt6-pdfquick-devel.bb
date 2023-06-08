SUMMARY = "Development files for the Qt 6 PdfQuick library"
DESCRIPTION = "Development files for the Qt 6 PdfQuick library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-pdfquick-devel-6.5.0-1.2.aarch64.rpm"
RPM_HASH = "1bf39164e44bdd8bf069be2a23757b81c34b886a6ad57c8ef63254b758d8292ada88a6474f0ec6c8923f1692e7b1a64355d494f159efadb5cb66ab0568a15486"

RPROVIDES:${PN} += "cmake(Qt6PdfQuick) pkgconfig(Qt6PdfQuick) qt6-pdfquick-devel qt6-pdfquick-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Gui) cmake(Qt6Qml) libQt6PdfQuick6 pkgconfig(Qt6Core) pkgconfig(Qt6Gui) pkgconfig(Qt6Pdf) pkgconfig(Qt6Qml) pkgconfig(Qt6Quick) qt6-pdf-private-devel qt6-quick-private-devel"

inherit rpm
