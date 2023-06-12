SUMMARY = "Unicode line-breaking library"
DESCRIPTION = "liblinebreak is an implementation of the line breaking algorithm as \
described in Unicode 6.0.0 Standard Annex 14, Revision 26, available \
at http://www.unicode.org/reports/tr14/tr14-26.html"
LICENSE = "Zlib"

PV = "2.1"

RPM_NAME = "liblinebreak2-2.1-16.25.aarch64.rpm"
RPM_HASH = "ef905c9bce2fa81c523a1d01acd919fd1579d8408c07de1de849ed193ddf9bf0a8d0da46500585ce137ef84f9a7dca2eb73f8a245c19daa2486aab0ad24675bd"

RPROVIDES:${PN} += "liblinebreak \
liblinebreak.so.2()(64bit) \
liblinebreak2 \
liblinebreak2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
