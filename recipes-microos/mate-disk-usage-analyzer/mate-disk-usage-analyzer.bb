SUMMARY = "MATE disk usage analyser"
DESCRIPTION = "This is the MATE Disk Usage Analyzer as shipped with the MATE utilities. \
mate-disk-usage-analyzer is able to scan either specific directories or \
the wholefilesystem, in order to give the user a graphical tree representation \
including each directory size or percentage in the branch. \
It also auto-detects in real-time any change made to your home \
directory as far as any mounted/unmounted device."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.0"

RPM_NAME = "mate-disk-usage-analyzer-1.26.0-1.11.aarch64.rpm"
RPM_HASH = "16c16f0ea1417ca1d4fdfd484a7c5d18d05fc2a7b9a9973974287be94136bd49dadec2941d0ce6efb913f0f1b7c7b799cbd2f87a6f682e68a0dbbfd5f010a12e"

RPROVIDES:${PN} += "application() application(mate-disk-usage-analyzer.desktop) mate-disk-usage-analyzer mate-disk-usage-analyzer(aarch-64) metainfo() metainfo(mate-disk-usage-analyzer.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libgtop-2.0.so.11()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit)"

inherit rpm
