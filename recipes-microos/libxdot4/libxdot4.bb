SUMMARY = "Library for parsing and deparsing of xdot operations"
DESCRIPTION = "The libxdot library provides support for parsing and deparsing graphical \
operations specified by the xdot language."
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "libxdot4-2.49.3-6.3.aarch64.rpm"
RPM_HASH = "730050b4d85fc1bbee350ad73704919404cc9136e55af38658d053628ef845bf467ca259f8a732ffea9d83734cc3aee81c05227366af693b4900fe55ca411c65"

RPROVIDES:${PN} += "libgraphviz6:/usr/lib64/libxdot.so.4 libxdot.so.4()(64bit) libxdot4 libxdot4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
