SUMMARY = "VNC module for X server"
DESCRIPTION = "This module allows to share content of X server's screen over VNC. \
It is loaded into X server as a module if enable in X server's \
configuration."
LICENSE = "GPL-2.0-only & MIT"

PV = "1.13.1"

RPM_NAME = "xorg-x11-Xvnc-module-1.13.1-3.1.aarch64.rpm"
RPM_HASH = "b9a80a46caca7b3f60198bb331ae6fe96918035d8afae0b8bae806d5bc7a8916e34e7032f385ff05f31a011824a30c40da58bbf5d1196fc0fb6dca8eb6aaefa7"

RPROVIDES:${PN} += "libvnc.so()(64bit) xorg-x11-Xvnc-module xorg-x11-Xvnc-module(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgmp.so.10()(64bit) libgnutls.so.30()(64bit) libgnutls.so.30(GNUTLS_3_4)(64bit) libgnutls.so.30(GNUTLS_3_6_3)(64bit) libhogweed.so.6()(64bit) libhogweed.so.6(HOGWEED_6)(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) libnettle.so.8()(64bit) libnettle.so.8(NETTLE_8)(64bit) libpam.so.0()(64bit) libpam.so.0(LIBPAM_1.0)(64bit) libpixman-1.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libz.so.1()(64bit) xorg-x11-Xvnc"

inherit rpm
