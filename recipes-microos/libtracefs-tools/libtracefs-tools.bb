SUMMARY = "Tools for libtracefs"
DESCRIPTION = "This library provides C APIs to access the kernel trace file system. \
 \
This subpackage contains tools."
LICENSE = "LGPL-2.1-only"

PV = "1.6.4"

RPM_NAME = "libtracefs-tools-1.6.4-2.3.aarch64.rpm"
RPM_HASH = "31937665eb1bcc6f39966a1c73a16dc539c614de10c17a2b21acaa6fadfffac1fe883a590a623aa10149a10b970edbb69ec69c1d67ff51d4c92ec7ba2e460601"

RPROVIDES:${PN} += "libtracefs-tools libtracefs-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libtraceevent.so.1()(64bit) libtracefs.so.1()(64bit) libtracefs1"

inherit rpm
