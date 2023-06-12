SUMMARY = "Server side daemon for managing locks"
DESCRIPTION = "Server side daemon used to manage locks held against virtual machine \
resources"
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "libvirt-daemon-lock-9.4.0-1.1.aarch64.rpm"
RPM_HASH = "30fbcd57c8425e26dc5aefe4e30e80fd432394b4ffa38e4ca03371b7cde71004e25df65ca0368567982de47373e903cf72e409b5dd25ff6102b6b55d61bc8aab"

RPROVIDES:${PN} += "config(libvirt-daemon-lock) libvirt-daemon-lock libvirt-daemon-lock(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libtirpc.so.3()(64bit) libtirpc.so.3(TIRPC_0.3.0)(64bit) libvirt-libs libvirt.so.0()(64bit) libvirt.so.0(LIBVIRT_0.1.0)(64bit) libvirt.so.0(LIBVIRT_1.0.2)(64bit) libvirt.so.0(LIBVIRT_1.0.6)(64bit) libvirt.so.0(LIBVIRT_PRIVATE_9.4.0)(64bit)"

inherit rpm
