SUMMARY = "GSM/GPRS/EDGE transcoding routines library"
DESCRIPTION = "libosmocoding is a library which provides GSM, GPRS and EDGE \
transcoding routines. \
 \
The following data types are currently supported: xCCH, PDTCH (CS 1-4 \
and MCS 1-9), TCH/FR, TCH/HR, TCH/AFS, RCH/AHS, RACH and SCH."
LICENSE = "GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "libosmocoding0-1.8.0-1.1.aarch64.rpm"
RPM_HASH = "980487f43257497214e689023ee82c1236914aa115a15ac36764d9d18eaae23c840fa3fd3509d0a9ceca73c62b2f5646971263bb76f3fabd9e11e2f08dba801c"

RPROVIDES:${PN} += "libosmocoding.so.0()(64bit) libosmocoding.so.0(LIBOSMOCODING_1.0)(64bit) libosmocoding0 libosmocoding0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libosmocodec.so.0()(64bit) libosmocore.so.20()(64bit) libosmogsm.so.18()(64bit) libosmogsm.so.18(LIBOSMOGSM_1.0)(64bit)"

inherit rpm
