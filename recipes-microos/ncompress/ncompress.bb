SUMMARY = "LZW compression and decompression utilities"
DESCRIPTION = "The ncompress package contains the 'compress' and 'uncompress' \
utilities which are compatible with the original UNIX compress \
utility (.Z file extensions). \
 \
Install ncompress if you need compression/decompression utilities \
which are compatible with the original UNIX compress utility. gzip is \
also able to decompress .Z files, though ncompress will not recognize \
.gz files at all."
LICENSE = "SUSE-Public-Domain"

PV = "5.0"

RPM_NAME = "ncompress-5.0-1.8.aarch64.rpm"
RPM_HASH = "2ffc3ad70dbe1ca3e9b836b6183fe55af8010a004824938c4c94ba501d8c29f0d416dafee7349ee44173fd19f456703b6828f4e024b1b6aa3ef8dc31fca8d2a4"

RPROVIDES:${PN} += "ncompress ncompress(aarch-64)"
RDEPENDS:${PN} += "gzip ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
