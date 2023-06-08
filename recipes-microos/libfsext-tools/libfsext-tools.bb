SUMMARY = "Tools to access the Extended File System (ext)"
DESCRIPTION = "Tools to access the Extended File System.  See libfsext for additional details."
LICENSE = "LGPL-3.0-or-later"

PV = "20220829"

RPM_NAME = "libfsext-tools-20220829-3.9.aarch64.rpm"
RPM_HASH = "ae24f8ffb348b146b1433dfd4339e012c31555990ed086e53995abae57998ba77f0e02ff3cd97c6641b703d2a4ac23f03cf4a45fb6ee8e772882a0500837ae04"

RPROVIDES:${PN} += "libfsext-tools libfsext-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbfio.so.1()(64bit) libbfio.so.1(V_20221025)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcerror.so.1()(64bit) libcerror.so.1(V_20220101)(64bit) libclocale.so.1()(64bit) libclocale.so.1(V_20221218)(64bit) libcnotify.so.1()(64bit) libcnotify.so.1(V_20220108)(64bit) libfdatetime.so.1()(64bit) libfdatetime.so.1(V_20220112)(64bit) libfsext.so.1()(64bit) libfsext.so.1(V_20220829)(64bit) libfsext1 libhmac.so.1()(64bit) libhmac.so.1(V_20230407)(64bit) libuna.so.1()(64bit) libuna.so.1(V_20220611)(64bit)"

inherit rpm
