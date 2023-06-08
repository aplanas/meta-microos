SUMMARY = "Displays colors defined in rgb.txt"
DESCRIPTION = "Xcolorsel displays colors defined in rgb.txt. You can create an RGB \
file by redirecting the output of showrgb to a file."
LICENSE = "SUSE-Public-Domain"

PV = "91.10.4"

RPM_NAME = "xcolors-91.10.4-1243.9.aarch64.rpm"
RPM_HASH = "c9314c68221dd5da713d025c5077cd33b74c9cd6f8386f83cb40252ae634ab1fe08d94ceb19964026c4dba94b44ea6dce8d7c9316c3899ebf1e091cf0ffc1898"

RPROVIDES:${PN} += "config(xcolors) xcolors xcolors(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXaw.so.7()(64bit) libXt.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
