SUMMARY = "A chat client for Matrix, the decentralized communication protocol"
DESCRIPTION = "Neochat is a client for Matrix, the decentralized communication protocol for instant \
messaging."
LICENSE = "GPL-3.0-or-later & GPL-3.0-only & BSD-2-Clause"

PV = "23.04.0"

RPM_NAME = "neochat-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "7af828dfd1e615c8ca818515d4036e38235b6cba8d30f04425070553161134a084d39b068262c105b34decd25092cd377908aaf8978f6a4054d24ca0d9672dbb"

RPROVIDES:${PN} += "application() application(org.kde.neochat.desktop) metainfo() metainfo(org.kde.neochat.appdata.xml) mimehandler(x-scheme-handler/matrix) neochat neochat(aarch-64)"
RDEPENDS:${PN} += "kirigami-addons kirigami2 kitemmodels-imports kquickimageeditor-imports ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5KIOGui.so.5()(64bit) libKF5KIOWidgets.so.5()(64bit) libKF5Notifications.so.5()(64bit) libKF5SonnetCore.so.5()(64bit) libKF5WindowSystem.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Multimedia.so.5()(64bit) libQt5Multimedia.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libQt5QuickControls2.so.5()(64bit) libQt5QuickControls2.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQuotient.so.0.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcmark.so.0.30.3()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libqt5keychain.so.1()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) syntax-highlighting-imports"

inherit rpm
