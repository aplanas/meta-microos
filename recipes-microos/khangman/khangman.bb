SUMMARY = "Hangman Game"
DESCRIPTION = "Classical hangman game by KDE."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "khangman-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "2f8d426047164804d9dd16bcfb78c73a13b811fc9777ad1d31c42325bc9113e646e2b8c72ab570337d698fbccddaf545940f1f86901991c8b15b585866277d68"

RPROVIDES:${PN} += "application() application(org.kde.khangman.desktop) config(khangman) khangman khangman(aarch-64) khangman5 metainfo() metainfo(org.kde.khangman.appdata.xml)"
RDEPENDS:${PN} += "kdeedu-data ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKEduVocDocument.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5NewStuff.so.5()(64bit) libKF5NewStuffCore.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5QuickWidgets.so.5()(64bit) libQt5QuickWidgets.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) qt5qmlimport(QtGraphicalEffects.1) qt5qmlimport(QtMultimedia.5) qt5qmlimport(QtQml.2) qt5qmlimport(QtQuick.2) qt5qmlimport(QtQuick.Controls.1) qt5qmlimport(QtQuick.Controls.Styles.1) qt5qmlimport(QtQuick.Dialogs.1) qt5qmlimport(QtQuick.Layouts.1) qt5qmlimport(QtQuick.Window.2) qt5qmlimport(org.kde.newstuff.1)"

inherit rpm
