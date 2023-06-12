SUMMARY = "Python bindings for the Qt5 Data Visualization library"
DESCRIPTION = "PyQtDataVisualization is a set of Python bindings for the Qt5 Data \
Visualization library."
LICENSE = "GPL-3.0-only"

PV = "5.15.5"

RPM_NAME = "python39-qtdatavis3d-qt5-5.15.5-1.5.aarch64.rpm"
RPM_HASH = "a8c956bad5b18436742dcf3fce5ccbe3d69ddc3591239bc8088dd01150cff7035a492fa81389cb0c730fb5352c1c75658b3edc799022306b122e79f142fcf66b"

RPROVIDES:${PN} += "python3.9dist(pyqtdatavisualization) \
python39-PyQtDataVisualization \
python39-qtdatavis3d-qt5 \
python39-qtdatavis3d-qt5(aarch-64) \
python3dist(pyqtdatavisualization)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DataVisualization.so.5()(64bit) \
libQt5DataVisualization.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
python(abi) \
python39-qt5 \
python39-qt5-sip"

inherit rpm
