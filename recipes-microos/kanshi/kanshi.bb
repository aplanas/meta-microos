SUMMARY = "Dynamic display configuration"
DESCRIPTION = "kanshi allows you to define output profiles that are automatically enabled \
and disabled on hotplug."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "kanshi-1.3.1-1.2.aarch64.rpm"
RPM_HASH = "43622cb2d280c0446c73388e8d84e5b1429aabd047e76596caf09b5e3d7c2f22cf9c6f2e81c794f4baafabd409f3e7b66f578ad1ca9b5cbefe1f7d444bc60af6"

RPROVIDES:${PN} += "kanshi kanshi(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libwayland-client.so.0()(64bit)"

inherit rpm
