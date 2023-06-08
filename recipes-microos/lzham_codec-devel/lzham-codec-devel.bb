SUMMARY = "Development libraries and headers for lzham_codec"
DESCRIPTION = "This package contains development libraries and headers for lzham_codec."
LICENSE = "MIT"

PV = "1_0_stable1"

RPM_NAME = "lzham_codec-devel-1_0_stable1-2.19.aarch64.rpm"
RPM_HASH = "edd4ea7174fa7f30cbfa63e63953921df08900166fdc47182626467d65475d42cb82bb4bf8d2f3890665a454182031d008becb1cb6ad4036ffb2685290452873"

RPROVIDES:${PN} += "lzham_codec-devel lzham_codec-devel(aarch-64) pkgconfig(lzham_codec)"
RDEPENDS:${PN} += "/usr/bin/pkg-config lzham_codec-libs"

inherit rpm
