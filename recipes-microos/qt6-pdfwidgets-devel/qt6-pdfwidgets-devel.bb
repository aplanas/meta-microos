SUMMARY = "Development files for the Qt 6 PdfWidgets library"
DESCRIPTION = "Development files for the Qt 6 PdfWidgets library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-pdfwidgets-devel-6.5.0-1.2.aarch64.rpm"
RPM_HASH = "54fa79054be0c8a4f2f3d4ac98780c8842aa911fb66fc6d1518f1952ed536354bb9cbbe1b6db3820f02f57af6d77036c2a87302290f7cb0395d5ddb5de9faf10"

RPROVIDES:${PN} += "cmake(Qt6PdfWidgets) pkgconfig(Qt6PdfWidgets) qt6-pdfwidgets-devel qt6-pdfwidgets-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Gui) cmake(Qt6Pdf) cmake(Qt6Widgets) libQt6PdfWidgets6 pkgconfig(Qt6Core) pkgconfig(Qt6Gui) pkgconfig(Qt6Pdf) pkgconfig(Qt6Widgets)"

inherit rpm
