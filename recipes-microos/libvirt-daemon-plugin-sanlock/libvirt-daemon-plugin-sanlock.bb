SUMMARY = "Sanlock lock manager plugin for QEMU driver"
DESCRIPTION = "Includes the Sanlock lock manager plugin for the QEMU driver"
LICENSE = "LGPL-2.1-or-later"

PV = "9.3.0"

RPM_NAME = "libvirt-daemon-plugin-sanlock-9.3.0-1.1.aarch64.rpm"
RPM_HASH = "867f9c2f38f66f79a2728665db285b7c296978e15f1fe10542af50bbb2c332d977f5d80ad233f0a2e0c030b1d92e6f49fee6adddb6bead56b3037c985234280a"

RPROVIDES:${PN} += "config(libvirt-daemon-plugin-sanlock) libvirt-daemon-plugin-sanlock libvirt-daemon-plugin-sanlock(aarch-64) libvirt-lock-sanlock"
RDEPENDS:${PN} += "/bin/sh augeas ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libglib-2.0.so.0()(64bit) libsanlock_client.so.1()(64bit) libvirt-libs libvirt.so.0()(64bit) libvirt.so.0(LIBVIRT_0.0.3)(64bit) libvirt.so.0(LIBVIRT_0.1.1)(64bit) libvirt.so.0(LIBVIRT_0.4.0)(64bit) libvirt.so.0(LIBVIRT_0.7.3)(64bit) libvirt.so.0(LIBVIRT_PRIVATE_9.3.0)(64bit) sanlock"

inherit rpm
