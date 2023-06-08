SUMMARY = "Deepin File Manager libraries"
DESCRIPTION = "This package contains the libraries for deepin-file-manager"
LICENSE = "GPL-3.0-or-later & MIT"

PV = "5.6.4"

RPM_NAME = "libdde-file-manager5-5.6.4-3.7.aarch64.rpm"
RPM_HASH = "03f861abb08e4cda9eeb16545f6122652a6876db89245307faed5dd0e4a093b2ff77a0d10d664c62b67e94f56dff5ce89406d9edcb5539883a90909252ba8cea"

RPROVIDES:${PN} += "libdde-file-manager.so.5()(64bit) libdde-file-manager5 libdde-file-manager5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libKF5Codecs.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Core.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Gui.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Sql.so.5()(64bit) libQt5Sql.so.5(Qt_5)(64bit) libQt5Svg.so.5()(64bit) libQt5Svg.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Widgets.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5X11Extras.so.5()(64bit) libQt5X11Extras.so.5(Qt_5)(64bit) libQt5Xdg.so.3()(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libdfm-extension.so.5()(64bit) libdframeworkdbus.so.2()(64bit) libdisomaster.so.1()(64bit) libdocparser.so.1()(64bit) libdtkcore.so.5()(64bit) libdtkgui.so.5()(64bit) libdtkwidget.so.5()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgio-2.0.so.0()(64bit) libgio-qt.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libjemalloc.so.2()(64bit) liblucene++-contrib.so.0()(64bit) liblucene++.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libmediainfo.so.0()(64bit) libpolkit-qt5-core-1.so.1()(64bit) libpoppler-cpp.so.0()(64bit) libsecret-1.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.7)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libudisks2-qt5.so.0()(64bit) libz.so.1()(64bit)"

inherit rpm
