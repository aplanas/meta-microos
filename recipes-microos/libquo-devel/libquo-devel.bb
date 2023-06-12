SUMMARY = "Development headers and libraries for libquo"
DESCRIPTION = "QUO is an API tailored for MPI/MPI+X codes that may benefit from \
evolving process binding policies during their execution. QUO allows \
for arbitrary process binding policies to be enacted and reverted \
during the execution as different computational phases are entered \
and exited, respectively. \
 \
This package contains development headers and libraries for libquo."
LICENSE = "BSD-3-Clause"

PV = "1.3.1"

RPM_NAME = "libquo-devel-1.3.1-2.9.aarch64.rpm"
RPM_HASH = "a0cb251579c8203fa3f7eba035f120686cc892514e5d0b77d27f1d1b899cdf30dec79b8c8226afae46db331fc3e051f70bb94a531f5565328c05f37c477a4f23"

RPROVIDES:${PN} += "libquo-devel \
libquo-devel(aarch-64) \
pkgconfig(libquo)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libquo7"

inherit rpm
