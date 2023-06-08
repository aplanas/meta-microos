SUMMARY = "An AV1 decoder/encoder for video streams"
DESCRIPTION = "The Scalable Video Technology for AV1 (SVT-AV1 Encoder and Decoder) is an \
AV1-compliant encoder/decoder library core. The SVT-AV1 encoder development is \
a work-in-progress targeting performance levels applicable to both VOD and Live \
encoding / transcoding video applications. The SVT-AV1 decoder implementation \
is targeting future codec research activities."
LICENSE = "BSD-3-Clause-Clear"

PV = "1.4.1"

RPM_NAME = "libSvtAv1Enc1-1.4.1-2.1.aarch64.rpm"
RPM_HASH = "969dcdf72f33b0b879245c3afcb119cbff4336a70cd4bc2b862668782d8bc2a0e0d62bb70941fe0dc20d777542933e6ab8542ab922cd9ff7fb68f9a5cfe89742"

RPROVIDES:${PN} += "libSvtAv1Enc.so.1()(64bit) libSvtAv1Enc1 libSvtAv1Enc1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
