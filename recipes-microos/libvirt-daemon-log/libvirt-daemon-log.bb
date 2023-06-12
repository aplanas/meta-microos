SUMMARY = "Server side daemon for managing logs"
DESCRIPTION = "Server side daemon used to manage logs from virtual machine consoles"
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "libvirt-daemon-log-9.4.0-1.1.aarch64.rpm"
RPM_HASH = "30ac46ba5ec84d50317755db622a39d78fbbb5a511348c0fc6b21585bffb823c7b42f1aa8e87a4050bced285c555a0b8c4ae501746aa40d517c156318c7c3128"

RPROVIDES:${PN} += "config(libvirt-daemon-log) libvirt-daemon-log libvirt-daemon-log(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libtirpc.so.3()(64bit) libtirpc.so.3(TIRPC_0.3.0)(64bit) libvirt-libs libvirt.so.0()(64bit) libvirt.so.0(LIBVIRT_0.1.0)(64bit) libvirt.so.0(LIBVIRT_0.6.1)(64bit) libvirt.so.0(LIBVIRT_0.9.3)(64bit) libvirt.so.0(LIBVIRT_1.0.2)(64bit) libvirt.so.0(LIBVIRT_1.0.6)(64bit) libvirt.so.0(LIBVIRT_PRIVATE_9.4.0)(64bit)"

inherit rpm
