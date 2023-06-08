SUMMARY = "Development files for libieee1284"
DESCRIPTION = "Development files for libieee1284, a Library for Interfacing IEEE \
1284-Compatible Devices."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "0.2.11"

RPM_NAME = "libieee1284-devel-0.2.11-1.2.aarch64.rpm"
RPM_HASH = "6ecd3db5493659ba078d5ca75f37af91378a368f0a9b38018a7b25f4d886372e1bf7f7a115e9c9b4a12dc51405d12154daa670c3693baafd9dda7b1dfff586cd"

RPROVIDES:${PN} += "libieee1284-devel libieee1284-devel(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libieee1284.so.3()(64bit) libieee12843"

inherit rpm
