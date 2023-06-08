SUMMARY = "Libraries for applications using PowerMan"
DESCRIPTION = "A shared library for applications using PowerMan."
LICENSE = "GPL-2.0-or-later"

PV = "2.3.26"

RPM_NAME = "libpowerman0-2.3.26-4.3.aarch64.rpm"
RPM_HASH = "adca5750063ffdef521a3d7b7b3d3109084a610e4c8a9057eb367cab491335bf350ac7333eec00512e613de910e7f85dbaf1fd77a258d4aad465fbdd6047ae23"

RPROVIDES:${PN} += "libpowerman.so.0()(64bit) libpowerman0 libpowerman0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
