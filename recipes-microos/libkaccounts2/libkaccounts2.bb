SUMMARY = "KDE Accounts Providers - System Library"
DESCRIPTION = "Small system to administer web accounts for the sites \
and services across the KDE desktop, including: Google, \
Facebook, Owncloud, IMAP, Jabber and others."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "libkaccounts2-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "76af6e9e44b79c5a886306fab9527448e11d61343608f8cc0baa1134999b875c0b0f26bbed73c56cb7609d0c6ce7039df7f2a2d928adadd0a4c73deae303c168"

RPROVIDES:${PN} += "libkaccounts.so.2()(64bit) libkaccounts2 libkaccounts2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libaccounts-qt5.so.1()(64bit) libc.so.6(GLIBC_2.17)(64bit) libsignon-qt5.so.1()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
