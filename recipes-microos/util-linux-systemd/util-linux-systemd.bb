SUMMARY = "A collection of basic system utilities (systemd dependent part)"
DESCRIPTION = "This package contains a large variety of low-level system utilities \
that are necessary for a Linux system to function. It contains the \
mount program, the fdisk configuration tool, and more."
LICENSE = "GPL-2.0-or-later"

PV = "2.38.1"

RPM_NAME = "util-linux-systemd-2.38.1-12.1.aarch64.rpm"
RPM_HASH = "adecd3b4d68fdce511a83784e554c593c0d0153653796325677d0a47b89c59d3bfc74029441bad4be484015ce54d7f65b17c23ab3cb6d45fb5451bdcb4c580a2"

RPROVIDES:${PN} += "/bin/logger util-linux-systemd util-linux-systemd(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libblkid.so.1()(64bit) libblkid.so.1(BLKID_1.0)(64bit) libblkid.so.1(BLKID_2.15)(64bit) libblkid.so.1(BLKID_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libeconf.so.0()(64bit) libeconf.so.0(LIBECONF_0.2)(64bit) libmount.so.1()(64bit) libmount.so.1(MOUNT_2.19)(64bit) libmount.so.1(MOUNT_2.20)(64bit) libmount.so.1(MOUNT_2.21)(64bit) libmount.so.1(MOUNT_2.22)(64bit) libmount.so.1(MOUNT_2.23)(64bit) libmount.so.1(MOUNT_2.24)(64bit) libmount.so.1(MOUNT_2.25)(64bit) libmount.so.1(MOUNT_2.34)(64bit) libmount.so.1(MOUNT_2_37)(64bit) libselinux.so.1()(64bit) libselinux.so.1(LIBSELINUX_1.0)(64bit) libsmartcols.so.1()(64bit) libsmartcols.so.1(SMARTCOLS_2.25)(64bit) libsmartcols.so.1(SMARTCOLS_2.27)(64bit) libsmartcols.so.1(SMARTCOLS_2.28)(64bit) libsmartcols.so.1(SMARTCOLS_2.29)(64bit) libsmartcols.so.1(SMARTCOLS_2.30)(64bit) libsmartcols.so.1(SMARTCOLS_2.33)(64bit) libsmartcols.so.1(SMARTCOLS_2.34)(64bit) libsmartcols.so.1(SMARTCOLS_2.38)(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_209)(64bit) libudev.so.1()(64bit) libudev.so.1(LIBUDEV_183)(64bit) permissions systemd"

inherit rpm
