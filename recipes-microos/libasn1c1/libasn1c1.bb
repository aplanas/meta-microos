SUMMARY = "Osmocon ASN.1 decoder and encoder library"
DESCRIPTION = "Lev Walkins's asn1c runtime, as a shared library and with \
modifications for Osmocom. \
 \
Compiles ASN.1 data structures into C source structures that can be \
simply (un)marshalled from and to: BER, DER, CER, BASIC-XER, CXER, \
EXTENDED-XER, PER."
LICENSE = "BSD-2-Clause"

PV = "0.9.35"

RPM_NAME = "libasn1c1-0.9.35-1.1.aarch64.rpm"
RPM_HASH = "38fa49a3e381d9cac33fea1b63f2c8bd83485cfdf6759c4def253dbd93874eaa4061c49560cca54f32c5d67c210ddf0fd2cc64f7e2d01c6eaf670d07050ff92c"

RPROVIDES:${PN} += "libasn1c.so.1()(64bit) libasn1c1 libasn1c1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
