SUMMARY = "GSM/GPRS/EDGE transcoding routines library"
DESCRIPTION = "libosmocoding is a library which provides GSM, GPRS and EDGE \
transcoding routines. \
 \
The following data types are currently supported: xCCH, PDTCH (CS 1-4 \
and MCS 1-9), TCH/FR, TCH/HR, TCH/AFS, RCH/AHS, RACH and SCH."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.0"

RPM_NAME = "libosmocoding0-1.7.0-2.4.aarch64.rpm"
RPM_HASH = "b8c6fca03cf8718f1789b8ee86131854a312af8b8721eb810491369cfcf6ccf3d65866e49828bf240f95a08b3cb4b6ff232a1cbe5fa976215b71e578f7e87272"

RPROVIDES:${PN} += "libosmocoding.so.0()(64bit) libosmocoding.so.0(LIBOSMOCODING_1.0)(64bit) libosmocoding0 libosmocoding0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libosmocodec.so.0()(64bit) libosmocore.so.19()(64bit) libosmogsm.so.18()(64bit) libosmogsm.so.18(LIBOSMOGSM_1.0)(64bit)"

inherit rpm
