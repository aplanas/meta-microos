SUMMARY = "Extensible Archive Format Tools"
DESCRIPTION = "The XAR project aims to provide an easily extensible archive format. Important \
design decisions include an easily extensible XML table of contents for random \
access to archived files, storing the toc at the beginning of the archive to \
allow for efficient handling of streamed archives, the ability to handle files \
of arbitrarily large sizes, the ability to choose independent encodings for \
individual files in the archive, the ability to store checksums for individual \
files in both compressed and uncompressed form, and the ability to query the \
table of content's rich meta-data."
LICENSE = "BSD-3-Clause"

PV = "1.6.1"

RPM_NAME = "xar-1.6.1-6.21.aarch64.rpm"
RPM_HASH = "ff0bc05d98b80ec4b837e9ebcd81de50d87048fea5093c8aac1ed59f4ee40620c23c511e49f3ba350234dfe18f493a0c2b76e098b9d1cca3cc3fcb9eca8a380c"

RPROVIDES:${PN} += "xar \
xar(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libxar.so.1()(64bit)"

inherit rpm
