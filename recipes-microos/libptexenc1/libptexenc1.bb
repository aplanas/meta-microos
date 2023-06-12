SUMMARY = "Libraries of Kanji code convert library for pTeX"
DESCRIPTION = "The ptexenc is a useful library for Japanese pTeX \
(which stands for publishing TeX, and is an extension of \
TeX by ASCII Co.) and its surrounding tools."
LICENSE = "BSD-3-Clause"

PV = "1.4.3"

RPM_NAME = "libptexenc1-1.4.3-91.1.aarch64.rpm"
RPM_HASH = "bae31bc5f448a2fdc7c6c1c68510cad2556c1964ec8bb61deaf5e6c43f3d9a91a8eafa6fc9b4c8094f50dc55e58dfa7a5999f76583c1a1e31e1a4a0a684e50ff"

RPROVIDES:${PN} += "libptexenc.so.1()(64bit) libptexenc1 libptexenc1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libkpathsea.so.6()(64bit)"

inherit rpm
