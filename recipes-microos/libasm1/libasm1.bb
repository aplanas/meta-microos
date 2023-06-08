SUMMARY = "A collection of utilities and DSOs to handle compiled objects"
DESCRIPTION = "libasm contains the 'asm' and 'disasm' functions to assemble and \
disassamble instructions. (There is only partial support for i686 and \
BPF instructions.) This is part of the elfutils package."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "libasm1-0.189-2.3.aarch64.rpm"
RPM_HASH = "4b295646179d6ca72bb3a9ee199aafc068094bd4c69e6992a2d13af3baf75d63aee6ed9af81a9b2cb324ea144746d52f241535c83dfad643fa9d5edfce7f3030"

RPROVIDES:${PN} += "libasm.so.1()(64bit) libasm.so.1(ELFUTILS_1.0)(64bit) libasm1 libasm1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libdw.so.1()(64bit) libdw.so.1(ELFUTILS_0.167)(64bit) libelf.so.1()(64bit) libelf.so.1(ELFUTILS_1.0)(64bit) libelf.so.1(ELFUTILS_1.4)(64bit)"

inherit rpm
