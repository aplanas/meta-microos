SUMMARY = "Python bindings for QScintilla for PyQt6"
DESCRIPTION = "QScintilla is a Qt port of Neil Hodgson's Scintilla C++ editor class. \
 \
This is a Qt port from the original Scintilla class \
(http://www.scintilla.org/). \
 \
This package provides the Python bindings for QScintilla for PyQt6."
LICENSE = "GPL-3.0-only"

PV = "2.13.4"

RPM_NAME = "python310-PyQt6-QScintilla-2.13.4-1.5.aarch64.rpm"
RPM_HASH = "46fb1e6073601aee3641ffeb4f4a33423023673d3249cf2163df250aa0d5e47b412627aa78c3fa1094c729acbcbb3adca9a1dc7e6e7745a4a7b974ccc5906e04"

RPROVIDES:${PN} += "python3-PyQt6-QScintilla \
python3-qscintilla-qt6 \
python3.10dist(pyqt6-qscintilla) \
python310-PyQt6-QScintilla \
python310-PyQt6-QScintilla(aarch-64) \
python310-qscintilla-qt6 \
python3dist(pyqt6-qscintilla)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.4)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6PrintSupport.so.6()(64bit) \
libQt6PrintSupport.so.6(Qt_6)(64bit) \
libQt6Widgets.so.6()(64bit) \
libQt6Widgets.so.6(Qt_6)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libqscintilla2_qt6.so.15()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
python(abi) \
python310-PyQt6"

inherit rpm
