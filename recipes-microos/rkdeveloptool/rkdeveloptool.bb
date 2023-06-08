SUMMARY = "Utility for Rockchip SoCs"
DESCRIPTION = "rkdeveloptool provides ways to read/write rockusb devices."
LICENSE = "GPL-2.0-or-later"

PV = "1.32~git.20210408.46bb4c0"

RPM_NAME = "rkdeveloptool-1.32~git.20210408.46bb4c0-2.8.aarch64.rpm"
RPM_HASH = "1b1ca63264cd411775001ae6b1b45a1879e426638b1238d334213b0cb25eded78eab36edea4758c8cedd35a528b3074803481a765b614502e029ba38fdd9feef"

RPROVIDES:${PN} += "rkdeveloptool rkdeveloptool(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libusb-1.0.so.0()(64bit) udev"

inherit rpm
