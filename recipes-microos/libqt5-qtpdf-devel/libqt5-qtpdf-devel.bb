SUMMARY = "Development files for the Qt5 PDF library"
DESCRIPTION = "You need this package if you want to compile programs with Qt PDF."
LICENSE = "LGPL-3.0-only | GPL-2.0-only | GPL-3.0-only"

PV = "5.15.13"

RPM_NAME = "libqt5-qtpdf-devel-5.15.13-3.2.aarch64.rpm"
RPM_HASH = "7ff3dbb344f96b54ffbd9be3c167dd7a38111a6d8bd76f8c19df22bbf75a5e8e235b320b81f6b0d82b09ec1340f8cee2c8091c94a91f59e2fccc521bc44c0141"

RPROVIDES:${PN} += "cmake(Qt5Pdf) cmake(Qt5PdfWidgets) libqt5-qtpdf-devel libqt5-qtpdf-devel(aarch-64) pkgconfig(Qt5Pdf) pkgconfig(Qt5PdfWidgets)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libQt5Pdf5 libQt5PdfWidgets5 pkgconfig(Qt5Core) pkgconfig(Qt5Gui) pkgconfig(Qt5Pdf) pkgconfig(Qt5Widgets)"

inherit rpm
