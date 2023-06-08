SUMMARY = "Python bindings for QScintilla for PyQt5"
DESCRIPTION = "QScintilla is a Qt port of Neil Hodgson's Scintilla C++ editor class. \
 \
This is a Qt port from the original Scintilla class \
(http://www.scintilla.org/). \
 \
This package provides the Python bindings for QScintilla for PyQt5."
LICENSE = "GPL-3.0-only"

PV = "2.13.4"

RPM_NAME = "python39-qscintilla-qt5-2.13.4-1.5.aarch64.rpm"
RPM_HASH = "52eb1c9d0a1ae3cb9b698452d80e32c74b6e08311b05b77feb25696686c4b9d8110b5bc8ae5f3c8b62c47c53d438ded3b082d0de525e50a0ea43fd8a50132083"

RPROVIDES:${PN} += "python3.9dist(qscintilla) python39-qscintilla-qt5 python39-qscintilla-qt5(aarch-64) python39-qscintilla-qt5-sip python3dist(qscintilla)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5PrintSupport.so.5()(64bit) libQt5PrintSupport.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libqscintilla2_qt5.so.15()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) python(abi) python39-PyQt5"

inherit rpm
