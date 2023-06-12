SUMMARY = "Reports most recent login of users"
DESCRIPTION = "pam_lastlog2 and lastlog2 are Y2038 safe versions of the old lastlog utility. pam_lastlog2 collects all data in a sqlite3 database and lastlog2 formats and prints the contents. The username, port, and last login time will be printed."
LICENSE = "BSD-2-Clause"

PV = "1.1.0"

RPM_NAME = "lastlog2-1.1.0-2.1.aarch64.rpm"
RPM_HASH = "0a29662e32be204395f74fa9f6edd9ccaa7039b50728b2537cd8fefe054f0934ec8f251c5d0f87a735156b3f6a93cc4db2e37bf7c1ce9706cd8fc65e4fe2011b"

RPROVIDES:${PN} += "lastlog2 \
lastlog2(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
liblastlog2.so.1()(64bit) \
liblastlog2.so.1(LIBLASTLOG2_1.0)(64bit) \
libpam.so.0()(64bit) \
libpam.so.0(LIBPAM_1.0)(64bit) \
libpam.so.0(LIBPAM_EXTENSION_1.0)(64bit) \
libpam.so.0(LIBPAM_MODUTIL_1.0)(64bit) \
pam-config"

inherit rpm
