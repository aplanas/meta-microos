SUMMARY = "Library implementing a VNC client"
DESCRIPTION = "LibVNCServer/LibVNCClient are cross-platform C libraries that allow \
implementing VNC server or client functionality in your program."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.13"

RPM_NAME = "libvncclient1-0.9.13-4.4.aarch64.rpm"
RPM_HASH = "6f585fd5a08cb038610c761063ed09d63e99419032d33d8c075dd24cc1cf7d6908a30c21f0f39f2b12ea7c791271f4c4501f86088c35a82837d2d5d8a7e0bc98"

RPROVIDES:${PN} += "libvncclient.so.1()(64bit) libvncclient1 libvncclient1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libgcrypt.so.20()(64bit) libgcrypt.so.20(GCRYPT_1.6)(64bit) libgnutls.so.30()(64bit) libgnutls.so.30(GNUTLS_3_4)(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) liblzo2.so.2()(64bit) libz.so.1()(64bit)"

inherit rpm
