SUMMARY = "GSM 06.10, 06.20, 06.60, 06.90 codec library"
DESCRIPTION = "The libosmocodec library contains an implementation of multiple \
GSM codecs: \
 \
* GSM 06.10 Full Rate (FR) codec \
* GSM 06.20 Half Rate (HR) codec \
* GSM 06.60 Enhanced Full Range (EFR) codec \
* GSM 06.90 Adaptive Multi-Rate (AMR) codec"
LICENSE = "GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "libosmocodec0-1.8.0-1.1.aarch64.rpm"
RPM_HASH = "07c89afc71695074935ee0c287e75975c77ced9fd306644b144188f6c0eaec1be732af29b23f978077aaec13a6e40c83c3d5c668bb307021be0420d2573bd61a"

RPROVIDES:${PN} += "libosmocodec.so.0()(64bit) \
libosmocodec0 \
libosmocodec0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libosmocore.so.20()(64bit) \
libtalloc.so.2()(64bit) \
libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
