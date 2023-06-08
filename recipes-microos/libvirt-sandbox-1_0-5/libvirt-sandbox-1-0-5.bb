SUMMARY = "Libvirt application sandbox framework libraries"
DESCRIPTION = "This package provides a framework for building application sandboxes \
using libvirt."
LICENSE = "LGPL-2.0-or-later"

PV = "0.8.0"

RPM_NAME = "libvirt-sandbox-1_0-5-0.8.0-5.3.aarch64.rpm"
RPM_HASH = "1da0944b187db239820e973c9fa44cd1b38c65f474c4fc82ee587a527ae3ef5b76e6d44fdfec0800c263b7632b577d4c4610be709b95f74320c6c71981414ac8"

RPROVIDES:${PN} += "config(libvirt-sandbox-1_0-5) libvirt-sandbox-1.0.so.5()(64bit) libvirt-sandbox-1.0.so.5(LIBVIRT_SANDBOX_0.6.0)(64bit) libvirt-sandbox-1.0.so.5(LIBVIRT_SANDBOX_0.6.1)(64bit) libvirt-sandbox-1_0-5 libvirt-sandbox-1_0-5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) liblzma.so.5()(64bit) liblzma.so.5(XZ_5.0)(64bit) libselinux.so.1()(64bit) libselinux.so.1(LIBSELINUX_1.0)(64bit) libtirpc.so.3()(64bit) libtirpc.so.3(TIRPC_0.3.0)(64bit) libvirt-daemon-lxc libvirt-daemon-qemu libvirt-gconfig-1.0.so.0()(64bit) libvirt-gconfig-1.0.so.0(LIBVIRT_GCONFIG_0.0.8)(64bit) libvirt-gconfig-1.0.so.0(LIBVIRT_GCONFIG_0.0.9)(64bit) libvirt-gconfig-1.0.so.0(LIBVIRT_GCONFIG_0.1.7)(64bit) libvirt-gconfig-1.0.so.0(LIBVIRT_GCONFIG_0.1.8)(64bit) libvirt-gconfig-1.0.so.0(LIBVIRT_GCONFIG_0.1.9)(64bit) libvirt-gconfig-1.0.so.0(LIBVIRT_GCONFIG_0.2.1)(64bit) libvirt-gobject-1.0.so.0()(64bit) libvirt-gobject-1.0.so.0(LIBVIRT_GOBJECT_0.0.8)(64bit) libvirt-gobject-1.0.so.0(LIBVIRT_GOBJECT_0.0.9)(64bit) libz.so.1()(64bit)"

inherit rpm
