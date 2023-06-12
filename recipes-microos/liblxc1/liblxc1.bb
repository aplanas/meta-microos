SUMMARY = "LXC container runtime library"
DESCRIPTION = "This package provides the LXC container runtime library."
LICENSE = "LGPL-2.1-only"

PV = "5.0.2"

RPM_NAME = "liblxc1-5.0.2-1.1.aarch64.rpm"
RPM_HASH = "43f8dec5401cd8711b1bcdc70ca7cdd758d51833b988fd5c132b4c447ace9dce213ba2d2ba9b65a1cc7ea2e7f5c72f60da3e5cacf1f978b6d425a2d2864fdec4"

RPROVIDES:${PN} += "config(liblxc1) liblxc.so.1()(64bit) liblxc1 liblxc1(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /sbin/ldconfig findutils ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libapparmor.so.1()(64bit) libc.so.6(GLIBC_2.36)(64bit) libcap.so.2()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libseccomp.so.2()(64bit) libselinux.so.1()(64bit) libselinux.so.1(LIBSELINUX_1.0)(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_221)(64bit) libsystemd.so.0(LIBSYSTEMD_237)(64bit) permissions"

inherit rpm
