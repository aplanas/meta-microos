SUMMARY = "DANE support for the GNU Transport Layer Security Library"
DESCRIPTION = "The GnuTLS project aims to develop a library that provides a secure \
layer over a reliable transport layer. \
This package contains the 'DANE' part of gnutls."
LICENSE = "LGPL-2.1-or-later"

PV = "3.8.0"

RPM_NAME = "libgnutls-dane0-3.8.0-4.1.aarch64.rpm"
RPM_HASH = "70769451a8cea32030f1f0eaa8f3cbedc2f8c0b1fda949828ee9a278c3920475cb548dc51bbb94a7348d8f9d0edf5748811c596294ee293aedf0b86ce2e4bcbe"

RPROVIDES:${PN} += "libgnutls-dane.so.0()(64bit) \
libgnutls-dane.so.0(DANE_0_0)(64bit) \
libgnutls-dane0 \
libgnutls-dane0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libgnutls.so.30(GNUTLS_PRIVATE_3_4)(64bit) \
libunbound.so.8()(64bit)"

inherit rpm
