SUMMARY = "Qt6 DBus Addons library for Fcitx5"
DESCRIPTION = "This package provides Qt6 DBus Addons library for Fcitx5."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "5.0.16"

RPM_NAME = "libFcitx5Qt6DBusAddons1-5.0.16-1.7.aarch64.rpm"
RPM_HASH = "27a4204becf1e14ce2ee75cc0c212b9ccb4dd0b1e1554ba6ad3ddc4602ddb5c06967754cf6b6d6501da62dabea1d0407c75879b72af9585fa543ba544e278d10"

RPROVIDES:${PN} += "libFcitx5Qt6DBusAddons.so.1()(64bit) libFcitx5Qt6DBusAddons1 libFcitx5Qt6DBusAddons1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6DBus.so.6()(64bit) libQt6DBus.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
