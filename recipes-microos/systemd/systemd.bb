SUMMARY = "A System and Session Manager"
DESCRIPTION = "Systemd is a system and service manager, compatible with SysV and LSB \
init scripts for Linux. systemd provides aggressive parallelization \
capabilities, uses socket and D-Bus activation for starting services, \
offers on-demand starting of daemons, keeps track of processes using \
Linux cgroups, supports snapshotting and restoring of the system state, \
maintains mount and automount points and implements an elaborate \
transactional dependency-based service control logic. It can work as a \
drop-in replacement for sysvinit."
LICENSE = "LGPL-2.1-or-later"

PV = "253.4"

RPM_NAME = "systemd-253.4-2.1.aarch64.rpm"
RPM_HASH = "1e6a7249a6ee856ac17a3d9512bdbf9f994bf345f8a907da628bcc7733cc143b7e540fe8206a0e12cf26203dcd49683655aae4a43ba41996ba0fe49cca22f14c"

RPROVIDES:${PN} += "/sbin/shutdown config(systemd) libnss_myhostname.so.2()(64bit) libnss_systemd.so.2()(64bit) libsystemd-core-253.so()(64bit) libsystemd-core-253.so(SD_SHARED)(64bit) libsystemd-shared-253.so()(64bit) libsystemd-shared-253.so(SD_SHARED)(64bit) nss-myhostname nss-systemd pkgconfig(systemd) sbin_init systemd systemd(aarch-64) systemd-analyze systemd-logger systemd-sysvinit sysvinit:/sbin/init"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/env /usr/bin/pkg-config aaa_base coreutils dbus-1 findutils group(lock) kbd ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libacl.so.1()(64bit) libacl.so.1(ACL_1.0)(64bit) libapparmor.so.1()(64bit) libapparmor.so.1(APPARMOR_1.1)(64bit) libapparmor.so.1(APPARMOR_2.10)(64bit) libapparmor.so.1(APPARMOR_2.13)(64bit) libaudit.so.1()(64bit) libblkid.so.1()(64bit) libblkid.so.1(BLKID_2.15)(64bit) libblkid.so.1(BLKID_2.17)(64bit) libblkid.so.1(BLKID_2.18)(64bit) libblkid.so.1(BLKID_2.30)(64bit) libc.so.6(GLIBC_2.36)(64bit) libcap.so.2()(64bit) libcrypt.so.1()(64bit) libcrypt.so.1(XCRYPT_2.0)(64bit) libcrypt.so.1(XCRYPT_4.4)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libgcrypt.so.20()(64bit) libgcrypt.so.20(GCRYPT_1.6)(64bit) libip4tc.so.2()(64bit) libkmod.so.2()(64bit) libkmod.so.2(LIBKMOD_5)(64bit) liblz4.so.1()(64bit) liblzma.so.5()(64bit) liblzma.so.5(XZ_5.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libmount.so.1()(64bit) libmount.so.1(MOUNT_2.19)(64bit) libmount.so.1(MOUNT_2.20)(64bit) libmount.so.1(MOUNT_2.22)(64bit) libmount.so.1(MOUNT_2.23)(64bit) libmount.so.1(MOUNT_2.26)(64bit) libnss_usrfiles2 libpam.so.0()(64bit) libpam.so.0(LIBPAM_1.0)(64bit) libpam.so.0(LIBPAM_EXTENSION_1.0)(64bit) libpam_misc.so.0()(64bit) libpam_misc.so.0(LIBPAM_MISC_1.0)(64bit) libseccomp.so.2()(64bit) libselinux.so.1()(64bit) libselinux.so.1(LIBSELINUX_1.0)(64bit) libzstd.so.1()(64bit) netcfg pam-config systemd-default-settings-branding systemd-presets-branding util-linux"

inherit rpm
