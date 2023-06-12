SUMMARY = "Tools to access the Extended File System (ext)"
DESCRIPTION = "Tools to access the Extended File System.  See libfsext for additional details."
LICENSE = "LGPL-3.0-or-later"

PV = "20230603"

RPM_NAME = "libfsext-tools-20230603-1.1.aarch64.rpm"
RPM_HASH = "80b0b9db38d886074b1f1a9f03a613afade22d9524fc4686e2919358fb883e5007f73cdfb6a03fa5ba0d20284431ba6492b2387c873ac1a47effc6905128f881"

RPROVIDES:${PN} += "libfsext-tools libfsext-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbfio.so.1()(64bit) libbfio.so.1(V_20221025)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcerror.so.1()(64bit) libcerror.so.1(V_20220101)(64bit) libclocale.so.1()(64bit) libclocale.so.1(V_20221218)(64bit) libcnotify.so.1()(64bit) libcnotify.so.1(V_20220108)(64bit) libfdatetime.so.1()(64bit) libfdatetime.so.1(V_20220112)(64bit) libfsext.so.1()(64bit) libfsext.so.1(V_20230603)(64bit) libfsext1 libhmac.so.1()(64bit) libhmac.so.1(V_20230407)(64bit) libuna.so.1()(64bit) libuna.so.1(V_20220611)(64bit)"

inherit rpm
