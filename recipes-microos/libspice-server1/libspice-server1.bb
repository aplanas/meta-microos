SUMMARY = "Library for SPICE-server"
DESCRIPTION = "Library for SPICE-server \
The SPICE server is used to expose a remote machine's display \
and devices."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "0.15.1"

RPM_NAME = "libspice-server1-0.15.1-1.4.aarch64.rpm"
RPM_HASH = "1d14af5543f67ea7c76b79258a1d4ec78dd9790302b68f63032a92e96798a924180f163c0a4158548b5d539f6bde2ea60f9fa49061def6ae4d182058d7f810a8"

RPROVIDES:${PN} += "libspice-server.so.1()(64bit) libspice-server.so.1(SPICE_SERVER_0.10.0)(64bit) libspice-server.so.1(SPICE_SERVER_0.10.1)(64bit) libspice-server.so.1(SPICE_SERVER_0.10.2)(64bit) libspice-server.so.1(SPICE_SERVER_0.10.3)(64bit) libspice-server.so.1(SPICE_SERVER_0.10.4)(64bit) libspice-server.so.1(SPICE_SERVER_0.11.2)(64bit) libspice-server.so.1(SPICE_SERVER_0.11.4)(64bit) libspice-server.so.1(SPICE_SERVER_0.12.2)(64bit) libspice-server.so.1(SPICE_SERVER_0.12.3)(64bit) libspice-server.so.1(SPICE_SERVER_0.12.4)(64bit) libspice-server.so.1(SPICE_SERVER_0.12.5)(64bit) libspice-server.so.1(SPICE_SERVER_0.12.6)(64bit) libspice-server.so.1(SPICE_SERVER_0.13.1)(64bit) libspice-server.so.1(SPICE_SERVER_0.13.2)(64bit) libspice-server.so.1(SPICE_SERVER_0.14.2)(64bit) libspice-server.so.1(SPICE_SERVER_0.14.3)(64bit) libspice-server.so.1(SPICE_SERVER_0.6.0)(64bit) libspice-server.so.1(SPICE_SERVER_0.6.1)(64bit) libspice-server.so.1(SPICE_SERVER_0.8.0)(64bit) libspice-server.so.1(SPICE_SERVER_0.8.1)(64bit) libspice-server.so.1(SPICE_SERVER_0.8.2)(64bit) libspice-server.so.1(SPICE_SERVER_0.8.3)(64bit) libspice-server1 libspice-server1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstapp-1.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) liblz4.so.1()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.35)(64bit) libopus.so.0()(64bit) liborc-0.4.so.0()(64bit) libpixman-1.so.0()(64bit) libsasl2.so.3()(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libz.so.1()(64bit)"

inherit rpm
