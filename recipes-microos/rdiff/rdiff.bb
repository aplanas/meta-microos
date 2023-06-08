SUMMARY = "Frontend to rsync's delta algorithm"
DESCRIPTION = "rdiff computes and applies signature-based file differences."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.4"

RPM_NAME = "rdiff-2.3.4-1.2.aarch64.rpm"
RPM_HASH = "f9e669d1707a375741fd53db2999e85ee9ab81fc6f26f8290706ec978c9f0d925e912f75bcc72cd4fe72ffd9c0351ae8c68cc9c762822668408e377bba2494b4"

RPROVIDES:${PN} += "rdiff rdiff(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libpopt.so.0()(64bit) libpopt.so.0(LIBPOPT_0)(64bit) librsync.so.2()(64bit)"

inherit rpm
