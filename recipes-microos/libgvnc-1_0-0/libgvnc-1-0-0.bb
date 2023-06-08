SUMMARY = "GObject-based library to interact with the RFB protocol"
DESCRIPTION = "gtk-vnc is a VNC viewer widget for GTK+. It is built using coroutines \
allowing it to be completely asynchronous while remaining single \
threaded. \
 \
This package contains the GObject-based library to interact with the \
RFB protocol."
LICENSE = "LGPL-2.1-only & LGPL-2.1-or-later"

PV = "1.3.1"

RPM_NAME = "libgvnc-1_0-0-1.3.1-1.5.aarch64.rpm"
RPM_HASH = "0e62f817d3a5a1a5415e87607d1009f2e01475a2556a8b4b1140885231127efa3fbbbbbeed0b86e0020b7fae75f4dc88cd98f042bc3d434ecdb6f38a7adf9ca0"

RPROVIDES:${PN} += "libgvnc-1.0.so.0()(64bit) libgvnc-1_0-0 libgvnc-1_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libgcrypt.so.20()(64bit) libgcrypt.so.20(GCRYPT_1.6)(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgnutls.so.30()(64bit) libgnutls.so.30(GNUTLS_3_4)(64bit) libgobject-2.0.so.0()(64bit) libsasl2.so.3()(64bit) libz.so.1()(64bit)"

inherit rpm
