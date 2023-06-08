SUMMARY = "Library to support Unicode and ASCII (byte string) conversions"
DESCRIPTION = "libuna is a library to support Unicode and ASCII (byte string) \
conversions."
LICENSE = "LGPL-3.0-or-later"

PV = "20220611"

RPM_NAME = "libuna1-20220611-4.5.aarch64.rpm"
RPM_HASH = "50f6e9f1679016c1ca3aae133deb53e0672b0fb90a44fbc3aad977a0d7eb5163a4903155ee0d64338f22f985653e2fecff05da2a4e9866ff408586780ee81bd4"

RPROVIDES:${PN} += "libuna.so.1()(64bit) libuna.so.1(V_20220611)(64bit) libuna1 libuna1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcerror.so.1()(64bit) libcerror.so.1(V_20220101)(64bit)"

inherit rpm
