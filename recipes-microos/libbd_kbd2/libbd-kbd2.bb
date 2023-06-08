SUMMARY = "The KBD plugin for the LibBlockDev library"
DESCRIPTION = "This LibBlockDev library plugin (and, at the same time, a standalone library) \
provides functionality related to kernel block devices, namely zRAM and \
Bcache."
LICENSE = "LGPL-2.1-only"

PV = "2.28"

RPM_NAME = "libbd_kbd2-2.28-1.4.aarch64.rpm"
RPM_HASH = "c3db1817cd134727d68e556005fe5af1370301f395e91ee56360de4a3288164ae10f9cf1cee1a6aaca3b4fb7277a06e3e7aa9912ad9c905134f714e171e43cb8"

RPROVIDES:${PN} += "libbd_kbd.so.2()(64bit) libbd_kbd2 libbd_kbd2(aarch-64) libblockdev-kbd"
RDEPENDS:${PN} += "/sbin/ldconfig bcache-tools ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbd_utils.so.2()(64bit) libbd_utils2 libbytesize.so.1()(64bit) libc.so.6(GLIBC_2.27)(64bit) libglib-2.0.so.0()(64bit)"

inherit rpm
