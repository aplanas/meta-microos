SUMMARY = "A library to import non-HTML reflowable e-book formats"
DESCRIPTION = "libe-book is a library to import non-HTML reflowable e-book formats. \
Currently supported are PalmDoc, TealDoc, Plucker eBook, eReader eBook, \
FictionBook v.2, TCR, zTXT."
LICENSE = "MPL-2.0"

PV = "0.1.3"

RPM_NAME = "libe-book-devel-0.1.3-2.20.aarch64.rpm"
RPM_HASH = "10a99603f13286376bd79d7c9a984ff368144c96124c3b9efe427a366c74b0d0ce6b06cd2c055a34866ac737022b8c06b40871bcd1b54a89a7b83b90df5d052e"

RPROVIDES:${PN} += "libe-book-devel libe-book-devel(aarch-64) pkgconfig(libe-book-0.1)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libe-book-0_1-1 libstdc++-devel pkgconfig(icu-uc) pkgconfig(liblangtag) pkgconfig(librevenge-0.0) pkgconfig(libxml-2.0) pkgconfig(zlib)"

inherit rpm
