SUMMARY = "C API for multipath-tools"
DESCRIPTION = "This library enables the use of libmultipath commands from C code."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.4+86+suse.4d8901e"

RPM_NAME = "libdmmp0_2_0-0.9.4+86+suse.4d8901e-1.1.aarch64.rpm"
RPM_HASH = "d1cec3bc41f6fead7a9d99ffe344d88c486ff6f4f0adfa5953b1a42772aebc02806f9f66162aa1b615a63b15797140241faf10f263cda87c1dda6b2548e1122a"

RPROVIDES:${PN} += "libdmmp.so.0.2.0()(64bit) libdmmp0_2_0 libdmmp0_2_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libjson-c.so.5()(64bit) libjson-c.so.5(JSONC_0.14)(64bit) libmpathcmd.so.0()(64bit) libmpathcmd.so.0(LIBMPATHCMD_1.0.0)(64bit) multipath-tools"

inherit rpm
