SUMMARY = "Disk manipulation and system setup tool"
DESCRIPTION = "growlight can manipulate both physical (NVMe, SATA, etc.) and virtual (mdadm, \
device-mapper, etc.) block devices, help identify bottlenecks in a storage \
topology, create and destroy filesystems, and prepare a machine for initial \
boot when run in an installer context. Both full-screen and REPL readline UIs \
are available."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.38"

RPM_NAME = "growlight-1.2.38-1.5.aarch64.rpm"
RPM_HASH = "0908abaca38181037235bbd36317ef216d5bbc5b4c59847f9d04b502323c5b9fdf937cb397f51b9a588138a3da42c8f22bdf8919f3902b072492cc3f9ac52720"

RPROVIDES:${PN} += "growlight growlight(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libatasmart.so.4()(64bit) libblkid.so.1()(64bit) libblkid.so.1(BLKID_1.0)(64bit) libblkid.so.1(BLKID_2.15)(64bit) libblkid.so.1(BLKID_2.17)(64bit) libblkid.so.1(BLKID_2.18)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcap.so.2()(64bit) libcryptsetup.so.12()(64bit) libcryptsetup.so.12(CRYPTSETUP_2.0)(64bit) libcryptsetup.so.12(CRYPTSETUP_2.4)(64bit) libdevmapper.so.1.03()(64bit) libdevmapper.so.1.03(Base)(64bit) libnettle.so.8()(64bit) libnettle.so.8(NETTLE_8)(64bit) libnotcurses-core.so.3()(64bit) libnotcurses.so.3()(64bit) libpci.so.3()(64bit) libpci.so.3(LIBPCI_3.0)(64bit) libpci.so.3(LIBPCI_3.1)(64bit) libpci.so.3(LIBPCI_3.5)(64bit) libpci.so.3(LIBPCI_3.8)(64bit) libpciaccess.so.0()(64bit) libudev.so.1()(64bit) libudev.so.1(LIBUDEV_183)(64bit) libz.so.1()(64bit)"

inherit rpm
