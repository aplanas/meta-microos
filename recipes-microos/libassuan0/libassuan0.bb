SUMMARY = "IPC library used by GnuPG version 2"
DESCRIPTION = "Libassuan is the IPC library used by gpg2 (GnuPG version 2)"
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "2.5.5"

RPM_NAME = "libassuan0-2.5.5-1.8.aarch64.rpm"
RPM_HASH = "8dbd7de49ce7d019be8001e4cb3f8c4cac968c3686abb5905c50e8fc1b44e068828837087b52359cdf05652bca931aa35839bf47c96eab3b541b78eec39fa7bd"

RPROVIDES:${PN} += "libassuan.so.0()(64bit) libassuan.so.0(LIBASSUAN_1.0)(64bit) libassuan0 libassuan0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libgpg-error.so.0()(64bit) libgpg-error.so.0(GPG_ERROR_1.0)(64bit)"

inherit rpm
