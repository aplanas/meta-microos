SUMMARY = "Tool to Recover and Fix Partitions"
DESCRIPTION = "TestDisk is a data recovery software primarily designed to help recover lost \
partitions and/or make non-booting disks bootable again."
LICENSE = "GPL-2.0-only"

PV = "7.1"

RPM_NAME = "testdisk-7.1-4.13.aarch64.rpm"
RPM_HASH = "bd957bf52e51d02877babea245e3d43234a008b145cfcf1c5110ff9008bbd6f4445dc14bafa50d9eca2299c06beeebf1761a60b3d33c86bb51cd6bcab18a6f98"

RPROVIDES:${PN} += "testdisk \
testdisk(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libewf.so.3()(64bit) \
libewf.so.3(V_20230212)(64bit) \
libext2fs.so.2()(64bit) \
libncursesw.so.6()(64bit) \
libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) \
libntfs-3g.so.89()(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) \
libuuid.so.1()(64bit) \
libuuid.so.1(UUID_1.0)(64bit)"

inherit rpm
