SUMMARY = "KDE spell checking library: QML files"
DESCRIPTION = " \
Sonnet is a plugin-based spell checking library for Qt-based \
applications. It supports several different plugins, including \
HSpell, Enchant, ASpell and HUNSPELL. \
This package contains files that allow use of sonnet with \
QtQuick based applications."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "sonnet-imports-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "8df0f83fa234625ef71268b5950de926e035f7e0acbaffef4af9a129c948d163ddd6f6c3c289d1a5fa5c82a6db3f4c56aaa94c1a75cd18168a5f17f7fa84c814"

RPROVIDES:${PN} += "libsonnetquickplugin.so()(64bit) qt5qmlimport(org.kde.sonnet.1) sonnet-imports sonnet-imports(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5SonnetCore.so.5()(64bit) libKF5SonnetCore5 libKF5SonnetUi5 libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
