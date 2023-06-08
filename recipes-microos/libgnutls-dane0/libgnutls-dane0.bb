SUMMARY = "DANE support for the GNU Transport Layer Security Library"
DESCRIPTION = "The GnuTLS project aims to develop a library that provides a secure \
layer over a reliable transport layer. \
This package contains the 'DANE' part of gnutls."
LICENSE = "LGPL-2.1-or-later"

PV = "3.8.0"

RPM_NAME = "libgnutls-dane0-3.8.0-1.1.aarch64.rpm"
RPM_HASH = "c0e199e0fdc265d06067d5391276627a66235686d32de0171cb7933e66dc21836db9f08ee22661621ef53616a97a6146f23a8dd4620d6200157f69dac9803f13"

RPROVIDES:${PN} += "libgnutls-dane.so.0()(64bit) libgnutls-dane.so.0(DANE_0_0)(64bit) libgnutls-dane0 libgnutls-dane0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgnutls.so.30()(64bit) libgnutls.so.30(GNUTLS_3_4)(64bit) libgnutls.so.30(GNUTLS_PRIVATE_3_4)(64bit) libunbound.so.8()(64bit)"

inherit rpm
