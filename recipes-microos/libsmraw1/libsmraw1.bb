SUMMARY = "Library and tools to access the (split) RAW image format"
DESCRIPTION = "libsmraw is a library to access the storage media RAW format. \
The library supports both RAW and split RAW."
LICENSE = "LGPL-3.0-or-later"

PV = "20230320"

RPM_NAME = "libsmraw1-20230320-1.3.aarch64.rpm"
RPM_HASH = "05126441372e1dcc80d7030ef520a93612121dc2b95604139b68e835c188656b8edb0e09b05ebc6bec064181a30fb85735d8a707e63833bc7d6b4813417061c1"

RPROVIDES:${PN} += "libsmraw.so.1()(64bit) libsmraw.so.1(V_20230320)(64bit) libsmraw1 libsmraw1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbfio.so.1()(64bit) libbfio.so.1(V_20221025)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcerror.so.1()(64bit) libcerror.so.1(V_20220101)(64bit) libclocale.so.1()(64bit) libclocale.so.1(V_20221218)(64bit) libcnotify.so.1()(64bit) libcnotify.so.1(V_20220108)(64bit) libcthreads.so.1()(64bit) libcthreads.so.1(V_20220102)(64bit) libfdata.so.1()(64bit) libfdata.so.1(V_20230319)(64bit) libfvalue.so.1()(64bit) libfvalue.so.1(V_20220120)(64bit) libuna.so.1()(64bit) libuna.so.1(V_20220611)(64bit)"

inherit rpm
