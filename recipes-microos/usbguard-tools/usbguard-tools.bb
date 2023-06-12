SUMMARY = "USBGuard Tools"
DESCRIPTION = "The usbguard-tools package contains optional tools from the USBGuard \
software framework."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.2"

RPM_NAME = "usbguard-tools-1.1.2-3.1.aarch64.rpm"
RPM_HASH = "c671098a45df58ea4286a5047d6f58745d29024206901621215152289107cf7fa16288472a3a1cbabe75ae1f9d1cc70f5e293cbc95bf5b5dea46463e4f4ecc6d"

RPROVIDES:${PN} += "usbguard-tools \
usbguard-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libusbguard.so.1()(64bit) \
usbguard"

inherit rpm
