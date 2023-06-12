SUMMARY = "Anagram Game"
DESCRIPTION = "Kanagram is a letter order game."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kanagram-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "7c3fce58a49c5d2e0bbe35aa1d45332ea7762ee5501324bd624ad675cc6bffb6b9f004c2d6724109f0aa3cdbd05d02b365c0b6efebf60bc099b70597cc72130e"

RPROVIDES:${PN} += "application() \
application(org.kde.kanagram.desktop) \
kanagram \
kanagram(aarch-64) \
kanagram5 \
metainfo() \
metainfo(org.kde.kanagram.appdata.xml)"
RDEPENDS:${PN} += "kdeedu-data \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKEduVocDocument.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Crash.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5NewStuffCore.so.5()(64bit) \
libKF5NewStuffWidgets.so.5()(64bit) \
libKF5SonnetCore.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5TextToSpeech.so.5()(64bit) \
libQt5TextToSpeech.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
qt5qmlimport(QtMultimedia.5) \
qt5qmlimport(QtQuick.2) \
qt5qmlimport(QtQuick.Controls.1) \
qt5qmlimport(QtQuick.Controls.Styles.1)"

inherit rpm
