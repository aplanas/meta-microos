SUMMARY = "QML components for syntax-highlighting"
DESCRIPTION = "This package contains QML imports for syntax-highlighting."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & MIT & BSD-3-Clause & Artistic-1.0"

PV = "5.105.0"

RPM_NAME = "syntax-highlighting-imports-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "e57794f5a8242002cb8832f340e42a25d43c3c23cdbe4ab31f748b3694062b736b20565c5abd256764c7d8f65c01b383f21749bc0c971b93d59b2bba7c96e807"

RPROVIDES:${PN} += "libkquicksyntaxhighlightingplugin.so()(64bit) qt5qmlimport(org.kde.syntaxhighlighting.1) syntax-highlighting-imports syntax-highlighting-imports(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5SyntaxHighlighting.so.5()(64bit) libKF5SyntaxHighlighting5 libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
