SUMMARY = "Qt5 multimedia examples"
DESCRIPTION = "Examples for the libqt5-qtmultimedia module."
LICENSE = "BSD-3-Clause"

PV = "5.15.9+kde3"

RPM_NAME = "libqt5-qtmultimedia-examples-5.15.9+kde3-1.1.aarch64.rpm"
RPM_HASH = "63568b302ffdd953afc46d0a238de02ef9f5c4e139ffe0d67358e6f36fe5aee06233558d21519e1eaa4f76ae5b864448226689f3be70b81a37a68c61e77fcd49"

RPROVIDES:${PN} += "libqt5-qtmultimedia-examples \
libqt5-qtmultimedia-examples(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Multimedia.so.5()(64bit) \
libQt5Multimedia.so.5(Qt_5)(64bit) \
libQt5MultimediaWidgets.so.5()(64bit) \
libQt5MultimediaWidgets.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
qt5qmlimport(Qt.labs.folderlistmodel.2) \
qt5qmlimport(QtAudioEngine.1) \
qt5qmlimport(QtMultimedia.5) \
qt5qmlimport(QtQuick.2) \
qt5qmlimport(QtQuick.Window.2)"

inherit rpm
