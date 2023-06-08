SUMMARY = "Application for updating Flipper Zero firmware - protocol library"
DESCRIPTION = "Application for updating Flipper Zero firmware - protocol library"
LICENSE = "GPL-3.0-or-later"

PV = "1.2.2+git7.1672595968.84566a5"

RPM_NAME = "qFlipper-libflipperproto-1.2.2+git7.1672595968.84566a5-1.3.aarch64.rpm"
RPM_HASH = "0c64250e47f0c0690890ed70e675e7136c50c16cc99b18b4d2b206685b00af1faa1033837079b3413a9b7e9a1ee96dc171f37b0a36cc80dc09b1f49dffbc1a29"

RPROVIDES:${PN} += "libflipperproto0.so()(64bit) qFlipper-libflipperproto qFlipper-libflipperproto(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
