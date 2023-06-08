SUMMARY = "Osmocon ASN.1 decoder and encoder library"
DESCRIPTION = "Lev Walkins's asn1c runtime, as a shared library and with \
modifications for Osmocom. \
 \
Compiles ASN.1 data structures into C source structures that can be \
simply (un)marshalled from and to: BER, DER, CER, BASIC-XER, CXER, \
EXTENDED-XER, PER."
LICENSE = "BSD-2-Clause"

PV = "0.9.34"

RPM_NAME = "libasn1c1-0.9.34-1.4.aarch64.rpm"
RPM_HASH = "a7d4ca8fc8687fd36f9fe5cd7085f33d08f48368e788c21877d8e37db703069c2329e9e5d319ed223687a2d4eb1ba9b0ea16ccc6027a577712a2209817a8cdf7"

RPROVIDES:${PN} += "libasn1c.so.1()(64bit) libasn1c1 libasn1c1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
