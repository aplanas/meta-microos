SUMMARY = "Extensive Archive Format Library"
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

RPM_NAME = "libxar1-1.6.1-6.21.aarch64.rpm"
RPM_HASH = "f348ef2bf24ce966b3ecd4ae0679e713215fe1273bfce9f1a9b1e7e4a291769f62256344665a1fb542d55420755dd93000cc3a93f49695607942ad14dd9bf9f6"

RPROVIDES:${PN} += "libxar.so.1()(64bit) libxar1 libxar1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libacl.so.1()(64bit) libacl.so.1(ACL_1.0)(64bit) libbz2.so.1()(64bit) libc.so.6(GLIBC_2.33)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) liblzma.so.5()(64bit) liblzma.so.5(XZ_5.0)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.5.0)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libxml2.so.2(LIBXML2_2.6.18)(64bit) libxml2.so.2(LIBXML2_2.6.5)(64bit) libz.so.1()(64bit)"

inherit rpm
