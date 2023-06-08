SUMMARY = "Runtime libraries for tolua++"
DESCRIPTION = "This package provides shared libraries for tolua++."
LICENSE = "MIT"

PV = "1.0.93"

RPM_NAME = "libtolua++-5_1-1-1.0.93-10.3.aarch64.rpm"
RPM_HASH = "05f424ddf7c35632903423235a7c4a5c2665f8eb54840a859e53191638799a4ebce2d9dc3d9736a841f4fdd8eae5b4003e7717e5d5eef11e1295743a020a9ea8"

RPROVIDES:${PN} += "libtolua++-5.1.so.1()(64bit) libtolua++-5_1-1 libtolua++-5_1-1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) liblua5.1.so.5()(64bit) libm.so.6()(64bit)"

inherit rpm
