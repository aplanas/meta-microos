SUMMARY = "Online Video Downloader"
DESCRIPTION = "This tool downloads online videos from various sources including \
archive.org and others."
LICENSE = "GPL-3.0-or-later"

PV = "2.3.0"

RPM_NAME = "vido-2.3.0-1.12.aarch64.rpm"
RPM_HASH = "db09d53abcea9e4b2a38b8aaedb0bd4b33b86b8f06ff720978f53db5a1185b2877494156e81b46f10068f09c2d208e62328bd289c8766bf6760af9acf3f9e18f"

RPROVIDES:${PN} += "application() application(com.github.bernardodsanderson.vido.desktop) metainfo() metainfo(com.github.bernardodsanderson.vido.appdata.xml) vido vido(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgdk-3.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgranite.so.6()(64bit) libgtk-3.so.0()(64bit) libhandy-1.so.0()(64bit) libhandy-1.so.0(LIBHANDY_1_0)(64bit) youtube-dl"

inherit rpm
