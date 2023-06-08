SUMMARY = "Library for plist formats"
DESCRIPTION = "libfplist is a library for plist formats. \
 \
Part of the libyal family of libraries. \
 \
Read-only supported formats: \
 \
  * XML plist format \
 \
Unsupported formats: \
 \
  * ASCII plist format \
  * Binary plist format"
LICENSE = "LGPL-3.0-or-later"

PV = "20220116"

RPM_NAME = "libfplist1-20220116-3.4.aarch64.rpm"
RPM_HASH = "02777735e804927519f62fc8355cd165f252daba455826d06efe2cdc1c638d617ebfc706fa324f32562119dcd5ddb1ff05e2a4a0c257495149d3acaafa44fa69"

RPROVIDES:${PN} += "libfplist.so.1()(64bit) libfplist.so.1(V_20220116)(64bit) libfplist1 libfplist1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcdata.so.1()(64bit) libcdata.so.1(V_20230108)(64bit) libcerror.so.1()(64bit) libcerror.so.1(V_20220101)(64bit) libfguid.so.1()(64bit) libfguid.so.1(V_20220113)(64bit) libfvalue.so.1()(64bit) libfvalue.so.1(V_20220120)(64bit) libuna.so.1()(64bit) libuna.so.1(V_20220611)(64bit)"

inherit rpm
