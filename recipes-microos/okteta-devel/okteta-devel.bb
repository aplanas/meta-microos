SUMMARY = "Development files for the Okteta Hex Editor"
DESCRIPTION = "Contains the development files for the Okteta Hex Editor."
LICENSE = "GFDL-1.2-only & GPL-2.0-only"

PV = "0.26.10"

RPM_NAME = "okteta-devel-0.26.10-1.3.aarch64.rpm"
RPM_HASH = "674f6b655d2a8bafa917d2c8be345786f6b2ee475aceae9b10268b3ea64b236cd3d15615cff396250c195a03b1c86a18dce986e290a46e7cb11f0ea3b45694f0"

RPROVIDES:${PN} += "cmake(KastenControllers) cmake(KastenCore) cmake(KastenGui) cmake(OktetaCore) cmake(OktetaGui) cmake(OktetaKastenControllers) cmake(OktetaKastenCore) cmake(OktetaKastenGui) okteta-devel okteta-devel(aarch-64) pkgconfig(OktetaCore) pkgconfig(OktetaGui)"
RDEPENDS:${PN} += "/usr/bin/pkg-config ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKasten4 libOkteta3 libOkteta3Core.so.0()(64bit) libOkteta3Gui.so.0()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) pkgconfig(OktetaCore) pkgconfig(Qt5Core) pkgconfig(Qt5Widgets)"

inherit rpm
