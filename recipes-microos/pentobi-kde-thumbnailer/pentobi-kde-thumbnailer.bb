SUMMARY = "KDE thumbnailer for Pentobi game files"
DESCRIPTION = "This package contains a KDE plugin to display thumbnails of \
Pentobi game files."
LICENSE = "GPL-3.0-only"

PV = "23.0"

RPM_NAME = "pentobi-kde-thumbnailer-23.0-1.3.aarch64.rpm"
RPM_HASH = "e9581a7de6e91916430104dd5ce660f7d6aad5a55de69a5013643c6242774971f09ec189a6d49318a77eee1d9e2735c34f2eff16892bad04ce0f606d7bea6b17"

RPROVIDES:${PN} += "pentobi-kde-thumbnailer pentobi-kde-thumbnailer(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.4)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.31)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
