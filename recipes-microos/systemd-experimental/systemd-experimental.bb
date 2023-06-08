SUMMARY = "Experimental systemd features"
DESCRIPTION = "This package contains optional extra services that are considered as previews \
and are provided so users can do early experiments with the new features or \
technologies without waiting for them to be fully supported by both upstream \
and openSUSE. \
 \
Please note that all services should be considered in development phase and as \
such their behaviors details, unit files, option names, etc... are subject to \
change without the usual backwards-compatibility promises. \
 \
Components that turn out to be stable and considered as fully supported will be \
merged into the main package or moved into a dedicated package. \
 \
Currently this package contains: homed, repart, userdbd, oomd, measure, \
pcrphase and ukify. \
 \
In case you want to create a user with systemd-homed quickly, here are the steps \
you can follow: \
 \
 - Make sure the nss-systemd package is installed and added into \
   /etc/nsswitch.conf, see nss-systemd(8) man page for details \
 \
 - Integrate pam_systemd_home.so in your PAM stack. You can do that either by \
   following the instructions in pam_systemd_home(8) man page or by executing \
   `pam-config --add --systemd_home` command \
 \
 - Enable and start systemd-homed with `systemctl enable --now systemd-homed` \
 \
 - Create a user with `homectl create <username>` \
 \
 - Verify the previous steps with `getent passwd <username>` \
 \
Have fun (at your own risk)."
LICENSE = "LGPL-2.1-or-later"

PV = "253.4"

RPM_NAME = "systemd-experimental-253.4-1.2.aarch64.rpm"
RPM_HASH = "7475df9425a49065549087fc73524ca862419d8adebfb20d5b5fc39be4ce098a6ba903d7c6707040ad51a55e01f60bdb262f4384f119db73512b85cd49397c01"

RPROVIDES:${PN} += "config(systemd-experimental) systemd-experimental systemd-experimental(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/env ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libblkid.so.1()(64bit) libblkid.so.1(BLKID_2.15)(64bit) libblkid.so.1(BLKID_2.17)(64bit) libblkid.so.1(BLKID_2.18)(64bit) libblkid.so.1(BLKID_2.21)(64bit) libc.so.6(GLIBC_2.36)(64bit) libcap.so.2()(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libfdisk.so.1()(64bit) libfdisk.so.1(FDISK_2.26)(64bit) libfdisk.so.1(FDISK_2.31)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libp11-kit.so.0()(64bit) libp11-kit.so.0(LIBP11_KIT_1.0)(64bit) libpam.so.0()(64bit) libpam.so.0(LIBPAM_1.0)(64bit) libpam.so.0(LIBPAM_EXTENSION_1.0)(64bit) libpam.so.0(LIBPAM_EXTENSION_1.1.1)(64bit) libsystemd-shared-253.so()(64bit) libsystemd-shared-253.so(SD_SHARED)(64bit) python3-pefile systemd"

inherit rpm
