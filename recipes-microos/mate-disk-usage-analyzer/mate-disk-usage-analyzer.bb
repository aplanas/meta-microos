SUMMARY = "MATE disk usage analyser"
DESCRIPTION = "This is the MATE Disk Usage Analyzer as shipped with the MATE utilities. \
mate-disk-usage-analyzer is able to scan either specific directories or \
the wholefilesystem, in order to give the user a graphical tree representation \
including each directory size or percentage in the branch. \
It also auto-detects in real-time any change made to your home \
directory as far as any mounted/unmounted device."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "mate-disk-usage-analyzer-1.26.1-1.1.aarch64.rpm"
RPM_HASH = "ac73b730461a22cc4115a7bf6438b60565d53f869d26c31a34b1650ab18a99a74e2f6f9122dab4f95ba00afb5989808d26d68fc38850ca6cfcc90b7b837a0c23"

RPROVIDES:${PN} += "application() application(mate-disk-usage-analyzer.desktop) mate-disk-usage-analyzer mate-disk-usage-analyzer(aarch-64) metainfo() metainfo(mate-disk-usage-analyzer.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libgtop-2.0.so.11()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit)"

inherit rpm
