SUMMARY = "Tool to Undelete Files"
DESCRIPTION = "PhotoRec is a file data recovery software designed to recover lost files \
including video, documents and archives from hard disks and CD Rom and lost \
pictures (Photo Recovery) from digital camera memory. PhotoRec ignores the \
filesystem and goes after the underlying data, so it works even if your media's \
filesystem is severely damaged or reformatted."
LICENSE = "GPL-2.0-only"

PV = "7.1"

RPM_NAME = "photorec-7.1-4.13.aarch64.rpm"
RPM_HASH = "472fb131ec6ac9eecb0539ab008fb990ab8aac602f5a0ac11e4b2544d104eb3fd73a8c06a8cb6c942e8864ebf760e97e8a106c3ec1c65d44412932b436591d0b"

RPROVIDES:${PN} += "photorec photorec(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libewf.so.3()(64bit) libewf.so.3(V_20230212)(64bit) libext2fs.so.2()(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) libncursesw.so.6()(64bit) libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) libntfs-3g.so.89()(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) libz.so.1()(64bit)"

inherit rpm
