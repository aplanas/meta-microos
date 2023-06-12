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

PV = "23.04.1"

RPM_NAME = "kasts-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "0f0c30ee904c72141416db6fdd540c667660fb04e9d9e469d06cbdb6074fe129300ce1d5a134b1145881f71af8a565a250981eacba6da8c57df44041ed4ce2d0"

RPROVIDES:${PN} += "application() application(org.kde.kasts.desktop) kasts kasts(aarch-64) libKMediaSession.so()(64bit) libKastsSolidExtras.so()(64bit) libkasts-solidextrasqmlplugin.so()(64bit) libkmediasession-qmlplugin.so()(64bit) metainfo() metainfo(org.kde.kasts.appdata.xml) qt5qmlimport(org.kde.kasts.solidextras.1) qt5qmlimport(org.kde.kmediasession.1)"
RDEPENDS:${PN} += "kirigami-addons kirigami2 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5NetworkManagerQt.so.6()(64bit) libKF5Syndication.so.5()(64bit) libKF5ThreadWeaver.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Multimedia.so.5()(64bit) libQt5Multimedia.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5QuickControls2.so.5()(64bit) libQt5QuickControls2.so.5(Qt_5)(64bit) libQt5Sql.so.5()(64bit) libQt5Sql.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libqt5keychain.so.1()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libtag.so.1()(64bit)"

inherit rpm
