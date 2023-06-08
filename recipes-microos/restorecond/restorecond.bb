SUMMARY = "Daemon to restore SELinux contexts"
DESCRIPTION = "Daemon that watches for file creation and then sets the default SELinux file context"
LICENSE = "GPL-2.0-or-later"

PV = "3.5"

RPM_NAME = "restorecond-3.5-1.2.aarch64.rpm"
RPM_HASH = "fd6fd545a263fd30e6e4ca87c6c266d7ba49f5d49e45d65b8a3dd095a9d11cacf8388e21ebedb2dc49516883fb4fee2966520ef3a5dfc2d5b194387c94c69387"

RPROVIDES:${PN} += "config(restorecond) restorecond restorecond(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libselinux.so.1()(64bit) libselinux.so.1(LIBSELINUX_1.0)(64bit) libselinux1 selinux-tools"

inherit rpm
