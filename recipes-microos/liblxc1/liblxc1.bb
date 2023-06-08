SUMMARY = "LXC container runtime library"
DESCRIPTION = "This package provides the LXC container runtime library."
LICENSE = "LGPL-2.1-only"

PV = "5.0.1"

RPM_NAME = "liblxc1-5.0.1-2.3.aarch64.rpm"
RPM_HASH = "976dcbf745eb038e125bc199c884add64efc4f6b669bb40823ab172949f6164e5f9183894da1c7440bff083f88b0b0fe9c47ca438046e80393f572353e20b78e"

RPROVIDES:${PN} += "config(liblxc1) liblxc.so.1()(64bit) liblxc1 liblxc1(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /sbin/ldconfig findutils ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.36)(64bit) libcap.so.2()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libseccomp.so.2()(64bit) libselinux.so.1()(64bit) libselinux.so.1(LIBSELINUX_1.0)(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_221)(64bit) libsystemd.so.0(LIBSYSTEMD_237)(64bit) permissions"

inherit rpm
