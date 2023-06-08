SUMMARY = "JBIG2 Decoder Utility"
DESCRIPTION = "jbig2dec is a decoder utility implementing the JBIG2 bi-level image compression \
spec. Also known as ITU T.88 and ISO IEC 14492, and included by reference in \
Adobe's PDF version 1.4 and later."
LICENSE = "AGPL-3.0-or-later"

PV = "0.19"

RPM_NAME = "jbig2dec-0.19-1.11.aarch64.rpm"
RPM_HASH = "7435d5d9dd569e4de415800972064c5c46eab6910740b42c88ea2888e616d3b3be9849c241462d6f907f24466e98f2e6d1921d41289fbd687ee9467cc9faa596"

RPROVIDES:${PN} += "jbig2dec jbig2dec(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libjbig2dec.so.0()(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit)"

inherit rpm
