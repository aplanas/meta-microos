SUMMARY = "Online Video Downloader"
DESCRIPTION = "This tool downloads online videos from various sources including \
archive.org and others."
LICENSE = "GPL-3.0-or-later"

PV = "2.3.0"

RPM_NAME = "vido-2.3.0-1.13.aarch64.rpm"
RPM_HASH = "19b6da09b06bc8b5cdf7ecca32d0bd2e1569d55c08d621ad878412bbf71a468ae4793894634ac32956bfede9bd960f5544ab4e832a36b31b2fbf92ad09dbd5cf"

RPROVIDES:${PN} += "application() application(com.github.bernardodsanderson.vido.desktop) metainfo() metainfo(com.github.bernardodsanderson.vido.appdata.xml) vido vido(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgdk-3.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgranite.so.6()(64bit) libgtk-3.so.0()(64bit) libhandy-1.so.0()(64bit) libhandy-1.so.0(LIBHANDY_1_0)(64bit) youtube-dl"

inherit rpm
