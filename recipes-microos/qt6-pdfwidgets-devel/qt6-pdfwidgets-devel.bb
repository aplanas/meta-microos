SUMMARY = "Development files for the Qt 6 PdfWidgets library"
DESCRIPTION = "Development files for the Qt 6 PdfWidgets library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-pdfwidgets-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "1bcfd98beb008f6f15220d907102cbccd6fa8cabf7bde1493bcbfbddbfc49f07f90600451d7b1196f04337b301fec5cd01be5aee37b99f41299e6bfc81885189"

RPROVIDES:${PN} += "cmake(Qt6PdfWidgets) \
pkgconfig(Qt6PdfWidgets) \
qt6-pdfwidgets-devel \
qt6-pdfwidgets-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake(Qt6Gui) \
cmake(Qt6Pdf) \
cmake(Qt6Widgets) \
libQt6PdfWidgets6 \
pkgconfig(Qt6Core) \
pkgconfig(Qt6Gui) \
pkgconfig(Qt6Pdf) \
pkgconfig(Qt6Widgets)"

inherit rpm
