SUMMARY = "Qt 6 Configuration Tool"
DESCRIPTION = "This program allows users to configure Qt6 settings (theme, font, icons, \
etc.) under DE/WM without Qt integration."
LICENSE = "BSD-2-Clause"

PV = "0.8"

RPM_NAME = "qt6ct-0.8-1.1.aarch64.rpm"
RPM_HASH = "73d0199bcd3ce706bfdccc4d2cead0508a624c0a646c5ece578ee7c0f02c9765687a4bca94502afe711490ae5ebcfbf5039fbfaad71326f83a3e71a0ab7afeb7"

RPROVIDES:${PN} += "application() application(qt6ct.desktop) libqt6ct-common.so.0.8()(64bit) libqt6ct-style.so()(64bit) libqt6ct.so()(64bit) qt6ct qt6ct(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Gui.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Svg6 libQt6Widgets.so.6()(64bit) libQt6Widgets.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.2)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
