SUMMARY = "QML modules for KDE games"
DESCRIPTION = "This package contains QML modules for KDE games."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "libkdegames-qt5-imports-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "6fae56b08f497bf25cbfd86a8e7afd6389ca6e07c9b4eda373e944002efde15f36da2ed5678eeb7f1affb66ce00cb8a2f749ff407e063814e274e2df187a8ca2"

RPROVIDES:${PN} += "libcorebindingsplugin.so()(64bit) libkdegames-qt5-imports libkdegames-qt5-imports(aarch-64) qt5qmlimport(org.kde.games.core.0)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5KDEGames.so.7()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) qt5qmlimport(QtQuick.2)"

inherit rpm
