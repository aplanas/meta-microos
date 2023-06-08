SUMMARY = "C++ Editor Class Library Development Files"
DESCRIPTION = "QScintilla is a Qt port of Neil Hodgson's Scintilla C++ editor class. \
 \
This is a Qt port from the original Scintilla class \
(http://www.scintilla.org/). \
 \
This package contains the development files for qscintilla-qt6."
LICENSE = "GPL-3.0-only"

PV = "2.13.4"

RPM_NAME = "qscintilla-qt6-devel-2.13.4-1.5.aarch64.rpm"
RPM_HASH = "65a1bee792ca167fc27be7f0418fcdfa4971d9a0f9b00e32c73655ca1b59e6fc3c05e97250a2c497e83484ee7780260f78df452e4624882dd6c9dc3c41ed42c3"

RPROVIDES:${PN} += "libqscintilla-qt6-devel libqscintilla2_qt6-devel libqscintilla_qt6-devel qscintilla-qt6-devel qscintilla-qt6-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6Core) cmake(Qt6PrintSupport) cmake(Qt6Widgets) libqscintilla2-qt6-15"

inherit rpm
