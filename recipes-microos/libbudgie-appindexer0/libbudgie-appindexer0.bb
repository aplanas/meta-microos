SUMMARY = "Private library for Budgie Menu"
DESCRIPTION = "Private library for Budgie menu to link against."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.7.1+20"

RPM_NAME = "libbudgie-appindexer0-10.7.1+20-1.1.aarch64.rpm"
RPM_HASH = "303086c3bde16916e232d2d85aa3613776dc9f3a34ede0099b33896cf941b6b966fee86b40c43e699ddf961a39437d3cdeedeed1ac6596aad4fe4ae4dfe7feb5"

RPROVIDES:${PN} += "libbudgie-appindexer.so.0()(64bit) libbudgie-appindexer0 libbudgie-appindexer0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgee-0.8.so.2()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit)"

inherit rpm
