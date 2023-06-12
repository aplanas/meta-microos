SUMMARY = "Nextcloud desktop synchronisation client"
DESCRIPTION = "The Nextcloud Desktop Client is a tool to synchronise files from \
the Nextcloud Server with your computer. \
 \
Nextcloud Desktop enables you to connect to your private \
Nextcloud Server. With it you can create directories in your home \
directory, and keep the contents of those directories synced with \
the server. Simply copy a file into the directory and the desktop \
synchronisation client does the rest."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "3.8.2"

RPM_NAME = "nextcloud-desktop-3.8.2-1.1.aarch64.rpm"
RPM_HASH = "3e9188a7d17478c56e2892f4a832b585ec7b31df912005a8d2119280b476939c586c1b55e07650b2a65ecaa84b6797694c79edc66c796502ba90fd29aae6c4c7"

RPROVIDES:${PN} += "application() application(com.nextcloud.desktopclient.nextcloud.desktop) config(nextcloud-desktop) mimehandler(application/vnd.nextcloud) mimehandler(x-scheme-handler/nc) nextcloud-client nextcloud-client-lang nextcloud-desktop nextcloud-desktop(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Archive.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libQt5QuickControls2.so.5()(64bit) libQt5QuickControls2.so.5(Qt_5)(64bit) libQt5Svg.so.5()(64bit) libQt5Svg.so.5(Qt_5)(64bit) libQt5WebEngineCore.so.5()(64bit) libQt5WebEngineCore.so.5(Qt_5)(64bit) libQt5WebEngineWidgets.so.5()(64bit) libQt5WebEngineWidgets.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcloudproviders.so.0()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libnextcloud_csync.so.0()(64bit) libnextcloudsync.so.0()(64bit) libnextcloudsync0 libqt5-qtgraphicaleffects libqt5-qtquickcontrols2 libqt5keychain.so.1()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
