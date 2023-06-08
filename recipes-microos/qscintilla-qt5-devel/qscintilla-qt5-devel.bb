SUMMARY = "C++ Editor Class Library Development Files"
DESCRIPTION = "QScintilla is a Qt port of Neil Hodgson's Scintilla C++ editor class. \
 \
This is a Qt port from the original Scintilla class \
(http://www.scintilla.org/). \
 \
This package contains the development files for qscintilla-qt5-qt5."
LICENSE = "GPL-3.0-only"

PV = "2.13.4"

RPM_NAME = "qscintilla-qt5-devel-2.13.4-1.5.aarch64.rpm"
RPM_HASH = "4de8244de3ac838a641c3c7e16160c30ffc7d8cc456823f5171dc447b17d717c0a10825df60bb8d4fce09ecbe0f969c20bcfd2c549c13f4df1ed6435855483f0"

RPROVIDES:${PN} += "libqscintilla-qt5-devel libqscintilla2_qt5-devel libqscintilla_qt5-devel qscintilla-qt5-devel qscintilla-qt5-devel(aarch-64)"
RDEPENDS:${PN} += "libqscintilla2-qt5-15 pkgconfig(Qt5Core) pkgconfig(Qt5PrintSupport) pkgconfig(Qt5Widgets)"

inherit rpm
