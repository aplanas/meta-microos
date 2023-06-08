SUMMARY = "Qt5 DBus Addons library for Fcitx5"
DESCRIPTION = "This package provides Qt5 DBus Addons library for Fcitx5."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "5.0.16"

RPM_NAME = "libFcitx5Qt5DBusAddons1-5.0.16-1.7.aarch64.rpm"
RPM_HASH = "0ed8ebb68d230009fdc04986c7246199735207ff844196906dcb608ffd8ebc0ba106403daba552b935ad8eac4df509fffb47a203733f503c8caddbfe0a9f75b5"

RPROVIDES:${PN} += "libFcitx5Qt5DBusAddons.so.1()(64bit) libFcitx5Qt5DBusAddons1 libFcitx5Qt5DBusAddons1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
