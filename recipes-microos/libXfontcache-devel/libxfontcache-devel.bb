SUMMARY = "Development files for the X TrueType font cache library"
DESCRIPTION = "FontCache is an extension that is used by X TrueType to cache \
information about fonts. \
 \
This package contains the development headers for the library found \
in libXfontcache1."
LICENSE = "MIT"

PV = "1.0.5"

RPM_NAME = "libXfontcache-devel-1.0.5-13.1.aarch64.rpm"
RPM_HASH = "7540099020e066fc3e56313bc5ba51ffcbc7e5015c48202be15d1f560e82d4c18e485a90b241af2f69e0cf8f322012a9c65c631c71897fbdafd2afba01836c6c"

RPROVIDES:${PN} += "libXfontcache-devel libXfontcache-devel(aarch-64) pkgconfig(xfontcache)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libXfontcache1 pkgconfig(fontcacheproto) pkgconfig(x11) pkgconfig(xext)"

inherit rpm
