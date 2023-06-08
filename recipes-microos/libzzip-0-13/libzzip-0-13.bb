SUMMARY = "ZIP compression library"
DESCRIPTION = "ZZipLib is a library for dealing with ZIP and ZIP-like archives by \
using algorithms of zlib."
LICENSE = "LGPL-2.1-or-later"

PV = "0.13.72"

RPM_NAME = "libzzip-0-13-0.13.72-1.9.aarch64.rpm"
RPM_HASH = "5d6404fa1dbbc2a7ff6d4987d59be895098a37ec73a9c06b25f03cde7d0b7637ecb3cdadfbeebc047379757695f5b5de0a04659f93bd0a4b7d49f7d2db4bc6f6"

RPROVIDES:${PN} += "libzzip-0-13 libzzip-0-13(aarch-64) libzzip.so.13()(64bit) libzzipfseeko.so.13()(64bit) libzzipmmapped.so.13()(64bit) libzzipwrap.so.13()(64bit) zziplib"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libz.so.1()(64bit)"

inherit rpm
