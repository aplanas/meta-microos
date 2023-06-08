SUMMARY = "A shared disk lock manager"
DESCRIPTION = "sanlock uses disk paxos to manage leases on shared storage. \
Hosts connected to a common SAN can use this to synchronize their \
access to the shared disks."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.8.5"

RPM_NAME = "sanlock-3.8.5-1.3.aarch64.rpm"
RPM_HASH = "e6a085e3aee2d286548bc021acdc161cc383184c35a4afe3f5f4b55bbf297969eb1d8415da33cab2b808ab4c7b95b054426aa0d442635a1aaf720afd15b3dafd"

RPROVIDES:${PN} += "config(sanlock) python2-sanlock sanlock sanlock(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/touch fillup group(disk) ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libaio.so.1()(64bit) libaio.so.1(LIBAIO_0.1)(64bit) libaio.so.1(LIBAIO_0.4)(64bit) libblkid.so.1()(64bit) libblkid.so.1(BLKID_2.15)(64bit) libblkid.so.1(BLKID_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libsanlock.so.1()(64bit) libuuid.so.1()(64bit) libuuid.so.1(UUID_1.0)(64bit) libwdmd.so.1()(64bit) shadow systemd"

inherit rpm
