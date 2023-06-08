SUMMARY = "Library for wireshark utilities"
DESCRIPTION = "The libwsutil library provides utility functions for libwireshark."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "4.0.5"

RPM_NAME = "libwsutil14-4.0.5-1.1.aarch64.rpm"
RPM_HASH = "347413df5d0dfa9b204e96c36a4f8b48cfaada4f3a36c3b6966d8b5a52b85a39a765d2ba70bbe794cbb2d965738cf83a921d4237d52633483f0de59ac78d9fd4"

RPROVIDES:${PN} += "libwsutil.so.14()(64bit) libwsutil14 libwsutil14(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libgcrypt.so.20()(64bit) libgcrypt.so.20(GCRYPT_1.6)(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libgnutls.so.30()(64bit) libgnutls.so.30(GNUTLS_3_4)(64bit) libpcre2-8.so.0()(64bit)"

inherit rpm
