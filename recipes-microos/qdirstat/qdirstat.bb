SUMMARY = "Directory Statistics"
DESCRIPTION = " \
QDirStat is a graphical application to show where your disk space \
has gone and to help you to clean it up. \
 \
This is a Qt-only port of the old Qt3/KDE3-based KDirStat, now \
based on the latest Qt 5. It does not need any KDE libs or \
infrastructure. It runs on every X11-based desktop on Linux, BSD \
and other Unix-like systems. \
 \
QDirStat has a number of new features compared to KDirStat. \
To name a few: \
 \
- Multi-selection in both the tree and the treemap. \
 \
- Unlimited number of user-defined cleanup actions. \
 \
- Properly show errors of cleanup actions \
  (and their output, if desired). \
 \
- Configurable file categories (MIME types), treemap colors, \
  exclude rules, tree columns. \
 \
- Package manager support: \
 \
  - Show what software package a system file belongs to. \
 \
  - Packages view showing disk usage of installed software \
    packages and their individual files. \
 \
  - Unpackaged files view showing what files in system directories \
    do not belong to any installed software package. \
 \
- New views: \
 \
  - Disk usage per file type (by filename extension). \
 \
  - File size histogram view. \
 \
  - File age view. \
 \
  - Free, used and reserved disk size for each mounted filesystem \
    (like df) \
 \
 \
For more details and screenshots, see \
 \
    https://github.com/shundhammer/qdirstat \
 \
and the local documentation in \
 \
    /usr/share/doc/packages/qdirstat/README.md"
LICENSE = "GPL-2.0-only"

PV = "1.8.1"

RPM_NAME = "qdirstat-1.8.1-1.4.aarch64.rpm"
RPM_HASH = "770a858e98ee1c135a96223ccb6cac502af5753a798bcc49dedba48d0c361086ca2f8954aee487851df68fcce8c833b372c49472e99d4c36d07835480db50bbb"

RPROVIDES:${PN} += "application() application(qdirstat.desktop) mimehandler(inode/directory) mimehandler(inode/mount-point) qdirstat qdirstat(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/perl libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libz.so.1()(64bit)"

inherit rpm
