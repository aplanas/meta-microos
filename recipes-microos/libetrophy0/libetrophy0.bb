SUMMARY = "Etrophy Dynamic Libraries"
DESCRIPTION = "Etrophy is core EFL (Enlightenment Foundation Libraries) library to handle various data types."
LICENSE = "BSD-2-Clause"

PV = "0.5.1"

RPM_NAME = "libetrophy0-0.5.1-8.30.aarch64.rpm"
RPM_HASH = "af9ef5a1263bee24c46f79a55c964df69d4d138e1098da6ef285cfe353c7bed0ccd8d20ce2c03a0d13a3718939f3d22d583d6cf036e268ce4ba621067ea7ed4b"

RPROVIDES:${PN} += "libetrophy.so.0()(64bit) libetrophy0 libetrophy0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libecore.so.1()(64bit) libecore_file.so.1()(64bit) libeet.so.1()(64bit) libeina.so.1()(64bit) libelementary.so.1()(64bit) libevas.so.1()(64bit)"

inherit rpm
