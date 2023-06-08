SUMMARY = "Manages partition tables on device-mapper devices"
DESCRIPTION = "The kpartx program maps linear devmaps to device partitions, which \
makes multipath maps partionable."
LICENSE = "GPL-2.0-only"

PV = "0.9.4+86+suse.4d8901e"

RPM_NAME = "kpartx-0.9.4+86+suse.4d8901e-1.1.aarch64.rpm"
RPM_HASH = "984bafff113dee722cea4831a41153e5c691d58b78140bb888a108d8cfa8b6e77ff99c2eada5e1601f38a198fa500cfd22ad12d3a513f4c249bddb2ff690043e"

RPROVIDES:${PN} += "kpartx kpartx(aarch-64)"
RDEPENDS:${PN} += "/bin/sh device-mapper ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libdevmapper.so.1.03()(64bit) libdevmapper.so.1.03(Base)(64bit) libdevmapper.so.1.03(DM_1_02_97)(64bit)"

inherit rpm
