SUMMARY = "Command-Line Program to Extract WinZix Archives"
DESCRIPTION = "Unzix is a small command-line program for extracting files from the new WinZix \
archive format."
LICENSE = "BSD-3-Clause"

PV = "0.4.0"

RPM_NAME = "unzix-0.4.0-2.14.aarch64.rpm"
RPM_HASH = "6aa69a82a30b484a840a2811758058b170e381a890b6bf40c0d7c5b3f5f4ec766a96eeca1404ac5ed83ecddab837b36d606a267187b2858fd40b5f50ffb6ee73"

RPROVIDES:${PN} += "unzix \
unzix(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libz.so.1()(64bit)"

inherit rpm
