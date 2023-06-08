SUMMARY = "GSM 06.10, 06.20, 06.60, 06.90 codec library"
DESCRIPTION = "The libosmocodec library contains an implementation of multiple \
GSM codecs: \
 \
* GSM 06.10 Full Rate (FR) codec \
* GSM 06.20 Half Rate (HR) codec \
* GSM 06.60 Enhanced Full Range (EFR) codec \
* GSM 06.90 Adaptive Multi-Rate (AMR) codec"
LICENSE = "GPL-2.0-or-later"

PV = "1.7.0"

RPM_NAME = "libosmocodec0-1.7.0-2.4.aarch64.rpm"
RPM_HASH = "4bd41f00f9b1c11deeb4da6a0902d1908a7eca56a6fa16f46c2d4084ea1f345bfb3305fe64fc17655de3d620e067907eb6ca8fb8d3db2eb201be53357f78dec7"

RPROVIDES:${PN} += "libosmocodec.so.0()(64bit) libosmocodec0 libosmocodec0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libosmocore.so.19()(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
