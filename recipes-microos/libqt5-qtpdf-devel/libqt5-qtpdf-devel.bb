SUMMARY = "Development files for the Qt5 PDF library"
DESCRIPTION = "You need this package if you want to compile programs with Qt PDF."
LICENSE = "LGPL-3.0-only | GPL-2.0-only | GPL-3.0-only"

PV = "5.15.14"

RPM_NAME = "libqt5-qtpdf-devel-5.15.14-1.1.aarch64.rpm"
RPM_HASH = "b922c62750bdad101b5ccd58a0f6239c890ad96c692cb30c6c4a392c776e1db47c8bbaf47fca63ab4a7a99226d295156d166d224531ef175becfa78d521f3fc1"

RPROVIDES:${PN} += "cmake(Qt5Pdf) cmake(Qt5PdfWidgets) libqt5-qtpdf-devel libqt5-qtpdf-devel(aarch-64) pkgconfig(Qt5Pdf) pkgconfig(Qt5PdfWidgets)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libQt5Pdf5 libQt5PdfWidgets5 pkgconfig(Qt5Core) pkgconfig(Qt5Gui) pkgconfig(Qt5Pdf) pkgconfig(Qt5Widgets)"

inherit rpm
