SUMMARY = "A library to manage subordinate uid and gid ranges"
DESCRIPTION = "Utility library that provides a way to manage subid ranges."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "4.13"

RPM_NAME = "libsubid4-4.13-6.1.aarch64.rpm"
RPM_HASH = "2eb137d137e016fda13bbe65a018a8fbe081da79d7a81e52c5f333ea1ab531655f5050b6a9a116bdb9c614ef40888751e8ab865e79385381e0fbd2a801ddd9dd"

RPROVIDES:${PN} += "libsubid.so.4()(64bit) libsubid4 libsubid4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libaudit.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libselinux.so.1()(64bit) libselinux.so.1(LIBSELINUX_1.0)(64bit)"

inherit rpm
