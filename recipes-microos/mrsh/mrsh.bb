SUMMARY = "Remote shell program that uses munge authentication"
DESCRIPTION = "Remote shell programs that use munge authentication rather than \
reserved ports for security."
LICENSE = "GPL-2.0-or-later"

PV = "2.12"

RPM_NAME = "mrsh-2.12-13.3.aarch64.rpm"
RPM_HASH = "db09251525e0939a9053661a32c67b8dd48f0e80bc3d388ef85fe284e975aa8e18fa2210e1a94e1e1cac4e2982e1d3bf9507db930531faed1395d6ac5689580b"

RPROVIDES:${PN} += "mrsh mrsh(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libmunge.so.2()(64bit)"

inherit rpm
