SUMMARY = "Library and tools to access the Volume Shadow Snapshot (VSS) format"
DESCRIPTION = "Library and tools to access the Volume Shadow Snapshot (VSS) format. \
The VSS format is used by Windows, as of Vista, to maintain copies of \
data on a storage media volume."
LICENSE = "LGPL-3.0-or-later"

PV = "20221030"

RPM_NAME = "libvshadow1-20221030-3.5.aarch64.rpm"
RPM_HASH = "6f3676fdfaa92cf014940f17895dacb67d63e4646a1f570bd284e60770e5b000b773ba464d86eb9004c262ad5ffa3fecbd276ec21784f394ca4ed24b24293d92"

RPROVIDES:${PN} += "libvshadow.so.1()(64bit) libvshadow.so.1(V_20221030)(64bit) libvshadow1 libvshadow1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbfio.so.1()(64bit) libbfio.so.1(V_20221025)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcdata.so.1()(64bit) libcdata.so.1(V_20230108)(64bit) libcerror.so.1()(64bit) libcerror.so.1(V_20220101)(64bit) libclocale.so.1()(64bit) libclocale.so.1(V_20221218)(64bit) libcnotify.so.1()(64bit) libcnotify.so.1(V_20220108)(64bit) libcthreads.so.1()(64bit) libcthreads.so.1(V_20220102)(64bit)"

inherit rpm
