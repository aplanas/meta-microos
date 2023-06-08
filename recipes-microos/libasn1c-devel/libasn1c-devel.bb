SUMMARY = "Development files for libasn1c, Osmocom's ASN.1 decoder and encoder library"
DESCRIPTION = "Compiles ASN.1 data structures into C source structures that can be \
simply (un)marshalled from and to: BER, DER, CER, BASIC-XER, CXER, \
EXTENDED-XER, PER. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libasn1c."
LICENSE = "BSD-2-Clause"

PV = "0.9.34"

RPM_NAME = "libasn1c-devel-0.9.34-1.4.aarch64.rpm"
RPM_HASH = "599f1ede7f01f7f9a5e02eccf23ddaa9803064477aeb8a8ee7bfc5db4ab31a373212e2f8d21180bde60b7adb67d934184e5eedb5c7eeafa14f521380ee41fd1f"

RPROVIDES:${PN} += "libasn1c-devel libasn1c-devel(aarch-64) pkgconfig(libasn1c)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libasn1c1 pkgconfig(talloc)"

inherit rpm
