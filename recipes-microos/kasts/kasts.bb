SUMMARY = "Kirigami-based podcast player"
DESCRIPTION = "Kasts is a convergent podcast application. \
Its main features are: \
 \
- Episode management through play queue \
- Sync playback positions with other clients through gpodder.net or \
  gpodder-nextcloud \
- Variable playback speed \
- Search for podcasts \
- Full system integration: e.g. inhibit system suspend while listening"
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kasts-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "6b70e69ba38078cb82c2c7e55258324cf108e1ef2689e3d897f8cb2adea9a106927ea2bb6f6ebf77687498df0d70570f2f03021c656043fde4d829a37a440b50"

RPROVIDES:${PN} += "application() application(org.kde.kasts.desktop) kasts kasts(aarch-64) libKMediaSession.so()(64bit) libKastsSolidExtras.so()(64bit) libkasts-solidextrasqmlplugin.so()(64bit) libkmediasession-qmlplugin.so()(64bit) metainfo() metainfo(org.kde.kasts.appdata.xml) qt5qmlimport(org.kde.kasts.solidextras.1) qt5qmlimport(org.kde.kmediasession.1)"
RDEPENDS:${PN} += "kirigami-addons kirigami2 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5NetworkManagerQt.so.6()(64bit) libKF5Syndication.so.5()(64bit) libKF5ThreadWeaver.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Multimedia.so.5()(64bit) libQt5Multimedia.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5QuickControls2.so.5()(64bit) libQt5QuickControls2.so.5(Qt_5)(64bit) libQt5Sql.so.5()(64bit) libQt5Sql.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libqt5keychain.so.1()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libtag.so.1()(64bit)"

inherit rpm
