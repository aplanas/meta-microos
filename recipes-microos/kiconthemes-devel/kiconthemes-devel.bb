SUMMARY = "Icon GUI utilities: Build Environment"
DESCRIPTION = "This library contains classes to improve the handling of icons \
in applications using the KDE Frameworks. Development files."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "5.105.0"

RPM_NAME = "kiconthemes-devel-5.105.0-1.2.aarch64.rpm"
RPM_HASH = "141871a062735522251119c74e4d1bcf799f547358062b701060d0f35868290faca6300eac4a6a6d3e08162115a6f67b23016011dcade1d8cc0f0823125e5f2f"

RPROVIDES:${PN} += "cmake(KF5IconThemes) kiconthemes-devel kiconthemes-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt5Widgets) extra-cmake-modules ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5IconThemes.so.5()(64bit) libKF5IconThemes5 libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
