SUMMARY = "QT Matrix client"
DESCRIPTION = "Quaternion is a desktop IM client for the Matrix protocol using QT."
LICENSE = "GPL-3.0-only"

PV = "0.0.95.1"

RPM_NAME = "matrix-quaternion-0.0.95.1-1.11.aarch64.rpm"
RPM_HASH = "ea182a4299340e0a2d48be82d114ec16e0aa8f1e1a55823604aaa53c264b30480e0e5477b130c43fa24ada861dbf3327cd20f29532ffc16f9bdb1822f1ba2178"

RPROVIDES:${PN} += "application() application(com.github.quaternion.desktop) matrix-quaternion matrix-quaternion(aarch-64) matrix-quaternion-git metainfo() metainfo(com.github.quaternion.appdata.xml) quaternion quaternion-git"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libQt5QuickControls2.so.5()(64bit) libQt5QuickControls2.so.5(Qt_5)(64bit) libQt5QuickWidgets.so.5()(64bit) libQt5QuickWidgets.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQuotient.so.0.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libqt5keychain.so.1()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) matrix-quaternion-lang"

inherit rpm
