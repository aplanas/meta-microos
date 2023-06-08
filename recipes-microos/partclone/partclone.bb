SUMMARY = "File System Clone Utilities"
DESCRIPTION = "A set of file system clone utilities, including \
ext2/3, reiserfs, reiser4, xfs, hfs+ file systems"
LICENSE = "GPL-2.0-or-later"

PV = "0.3.23"

RPM_NAME = "partclone-0.3.23-1.4.aarch64.rpm"
RPM_HASH = "7a9a165b95b7e7d647bd4a69bdcf683d1533f4d2fd94efbbe8b977324c424f33de1821a852152d6ba7c1bfbc5ee7ea982dfbdef2884312e45baa36e36bb6e929"

RPROVIDES:${PN} += "partclone partclone(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libblkid.so.1()(64bit) libblkid.so.1(BLKID_1.0)(64bit) libblkid.so.1(BLKID_2.15)(64bit) libblkid.so.1(BLKID_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libext2fs.so.2()(64bit) libfuse.so.2()(64bit) libfuse.so.2(FUSE_2.6)(64bit) libncursesw.so.6()(64bit) libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) libnilfs.so.0()(64bit) libntfs-3g.so.89()(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) libuuid.so.1()(64bit) libuuid.so.1(UUID_1.0)(64bit)"

inherit rpm
