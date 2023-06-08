SUMMARY = "Disk Manager"
DESCRIPTION = "The Udisks project provides a daemon, tools and libraries to access and \
manipulate disks, storage devices and technologies."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "2.9.4"

RPM_NAME = "udisks2-2.9.4-6.3.aarch64.rpm"
RPM_HASH = "3ae789f4f4969fa6794a051a3d453c9b19a7f40aca85ad527797ff7a90d23ad478489e728365ff33e5493269258b40b4ba5c1f3c0551dc49ab5d8455e7cc6067"

RPROVIDES:${PN} += "config(udisks2) udisks2 udisks2(aarch-64)"
RDEPENDS:${PN} += "/bin/sh cryptsetup dbus-1 dosfstools e2fsprogs eject gptfdisk ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libacl.so.1()(64bit) libacl.so.1(ACL_1.0)(64bit) libatasmart-utils libatasmart.so.4()(64bit) libbd_utils.so.2()(64bit) libblockdev libblockdev-crypto libblockdev-fs libblockdev-loop libblockdev-mdraid libblockdev-part libblockdev-swap libblockdev.so.2()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgudev-1.0.so.0()(64bit) libmount.so.1()(64bit) libmount.so.1(MOUNT_2.19)(64bit) libmount.so.1(MOUNT_2.20)(64bit) libmount.so.1(MOUNT_2.24)(64bit) libmount.so.1(MOUNT_2.26)(64bit) libpolkit-agent-1.so.0()(64bit) libpolkit-gobject-1.so.0()(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_209)(64bit) libudisks2-0 libudisks2.so.0()(64bit) libuuid.so.1()(64bit) libuuid.so.1(UUID_1.0)(64bit) systemd udev util-linux xfsprogs"

inherit rpm
