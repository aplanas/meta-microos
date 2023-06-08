SUMMARY = "KDE spell checking library: Build Environment"
DESCRIPTION = "Sonnet is a plugin-based spell checking library for Qt-based \
applications. It supports several different plugins, including \
HSpell, Enchant, ASpell and HUNSPELL. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "sonnet-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "2b976fe6a7eeb545f9782f07459befc404cacee0d8913671214c115d56f6363a9c4b09bf1a069c72a08a0a62513caaa796679857e46bf9ed0da64abc1d1efb9a"

RPROVIDES:${PN} += "cmake(KF5Sonnet) sonnet-devel sonnet-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt5Core) extra-cmake-modules ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5SonnetCore5 libKF5SonnetUi.so.5()(64bit) libKF5SonnetUi5 libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
