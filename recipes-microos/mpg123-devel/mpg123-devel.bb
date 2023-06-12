SUMMARY = "Files to develop against libmpg123"
DESCRIPTION = "The mpg123 distribution contains an MPEG 1.0/2.0/2.5 audio player/decoder for \
layers 1, 2 and 3 (most commonly MPEG 1.0 Layer 3 aka MP3), as well as re-usable decoding \
and output libraries."
LICENSE = "LGPL-2.1-only"

PV = "1.31.3"

RPM_NAME = "mpg123-devel-1.31.3-1.2.aarch64.rpm"
RPM_HASH = "a1df71d1d4775e5ed81e4edac2b34c11f9285d220e53918d396a609a4b604870e6b9407016b23a7168d91c95e0d8af62ddc15b5bbefe2d1d55d0b9bf0d8dd2e0"

RPROVIDES:${PN} += "mpg123-devel \
mpg123-devel(aarch-64) \
pkgconfig(libmpg123) \
pkgconfig(libout123) \
pkgconfig(libsyn123)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmpg123-0 \
libout123-0 \
libsyn123-0"

inherit rpm
