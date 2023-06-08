SUMMARY = "Userspace tools for Linux kernel containers"
DESCRIPTION = "LXC is the well-known and heavily tested low-level Linux container runtime."
LICENSE = "LGPL-2.1-or-later"

PV = "5.0.1"

RPM_NAME = "lxc-5.0.1-2.3.aarch64.rpm"
RPM_HASH = "6bfb7eee1952bba3039e37c9375a05bd3d00e584160bc0591d69b5ebbe8aed41ffff32bbee62d9bb4063855fb2bcfb6e0e55ab81eff232466cfcc51182f19ea3"

RPROVIDES:${PN} += "config(lxc) lxc lxc(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.36)(64bit) libcap-progs libcap.so.2()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libseccomp.so.2()(64bit) libselinux.so.1()(64bit) libselinux.so.1(LIBSELINUX_1.0)(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_221)(64bit) libsystemd.so.0(LIBSYSTEMD_237)(64bit) lxcfs lxcfs-hooks-lxc rsync"

inherit rpm
