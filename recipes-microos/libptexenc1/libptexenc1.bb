SUMMARY = "Libraries of Kanji code convert library for pTeX"
DESCRIPTION = "The ptexenc is a useful library for Japanese pTeX \
(which stands for publishing TeX, and is an extension of \
TeX by ASCII Co.) and its surrounding tools."
LICENSE = "BSD-3-Clause"

PV = "1.4.3"

RPM_NAME = "libptexenc1-1.4.3-89.1.aarch64.rpm"
RPM_HASH = "557f82de4cf3e8fa92570be1cb79babb631b0179a18eee18794c1e1ae479f865358f999450336e237c30122287fc535f6a682e265e42582ddf093ead1400d61e"

RPROVIDES:${PN} += "libptexenc.so.1()(64bit) libptexenc1 libptexenc1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libkpathsea.so.6()(64bit)"

inherit rpm
