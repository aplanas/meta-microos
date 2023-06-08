SUMMARY = "Libvirt application sandbox framework"
DESCRIPTION = "The virt-sandbox package provides an API for building application \
sandboxes using libvirt. Sandboxes can be based on either container \
or machine based virtualization technology. Also included is a simple \
command line tool for launching sandboxes for arbitrary commands."
LICENSE = "LGPL-2.0-or-later"

PV = "0.8.0"

RPM_NAME = "virt-sandbox-0.8.0-5.3.aarch64.rpm"
RPM_HASH = "e3a7d55f7bc15c974e7af2c40f2f7887d697453d0c65a5e9c9d0725f5c6cbfb8a637931ec8b7d553295626be63e6b40166d28b0468d75e190b3c1de6d5adab15"

RPROVIDES:${PN} += "virt-sandbox virt-sandbox(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libvirt-client libvirt-gobject-1.0.so.0()(64bit) libvirt-gobject-1.0.so.0(LIBVIRT_GOBJECT_0.0.8)(64bit) libvirt-sandbox-1.0.so.5()(64bit) libvirt-sandbox-1.0.so.5(LIBVIRT_SANDBOX_0.6.0)(64bit) libvirt-sandbox-1.0.so.5(LIBVIRT_SANDBOX_0.6.1)(64bit) libvirt-sandbox-1_0-5 python3-gobject"

inherit rpm
