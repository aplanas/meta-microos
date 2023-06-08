SUMMARY = "The best way for reading your comics"
DESCRIPTION = "A cross platform comic reader and library manager."
LICENSE = "GPL-3.0-or-later"

PV = "9.11.0"

RPM_NAME = "yacreader-9.11.0-1.3.aarch64.rpm"
RPM_HASH = "2d1862a1407fd0669f18e2f47b00dbbe3cd2f3a5f062fbdf509ada186d7ed02cc5dd0a38f6886bbc68330e30268161c921f5f2df4cae9316d1ae657b8c0c8a38"

RPROVIDES:${PN} += "application() application(YACReader.desktop) application(YACReaderLibrary.desktop) mimehandler(application/vnd.comicbook+zip) mimehandler(application/vnd.comicbook-rar) mimehandler(application/x-7z) mimehandler(application/x-cb7) mimehandler(application/x-cbr) mimehandler(application/x-cbt) mimehandler(application/x-cbz) mimehandler(application/x-pdf) mimehandler(application/x-rar) mimehandler(application/x-zip) mimehandler(inode/directory) yacreader yacreader(aarch-64)"
RDEPENDS:${PN} += "hicolor-icon-theme libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Multimedia.so.5()(64bit) libQt5Multimedia.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libQt5QuickWidgets.so.5()(64bit) libQt5QuickWidgets.so.5(Qt_5)(64bit) libQt5Sql.so.5()(64bit) libQt5Sql.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libpoppler-qt5.so.1()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.11)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.2)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
