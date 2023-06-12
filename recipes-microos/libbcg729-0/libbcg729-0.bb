SUMMARY = "Encoder and decoder of the ITU G.729 Annex A/B speech codec"
DESCRIPTION = "Bcg729 is an implementation of both encoder and decoder of the ITU \
G.729 Annex A/B speech codec. It supports concurrent channels \
encoding/decoding for multi call application such as conferencing."
LICENSE = "GPL-3.0-only"

PV = "1.1.1"

RPM_NAME = "libbcg729-0-1.1.1-2.7.aarch64.rpm"
RPM_HASH = "d1f05aa7399d0812afa92129d369b6d950f36df278a7b152e2ee4b52c0f8d4004b1242257c5e319c2f12c2899795e816cd43e5f5699840bff563f24ad34bbb29"

RPROVIDES:${PN} += "libbcg729-0 \
libbcg729-0(aarch-64) \
libbcg729.so.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
