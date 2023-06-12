SUMMARY = "Development files for libopenmpt"
DESCRIPTION = "This package contains the development files required to compile programs \
using libopenmpt."
LICENSE = "BSD-3-Clause"

PV = "0.6.10"

RPM_NAME = "libopenmpt-devel-0.6.10-1.1.aarch64.rpm"
RPM_HASH = "2ea25d488f16f6794210210af45eb5ecab1777d6c0b3438c38915063ce2faa980cbeee1f2fb1a723d2e9615eb48d1da72416b2bcf7f4778b40a604433399c1eb"

RPROVIDES:${PN} += "libopenmpt-devel \
libopenmpt-devel(aarch-64) \
pkgconfig(libopenmpt)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libopenmpt0 \
pkgconfig(libmpg123) \
pkgconfig(ogg) \
pkgconfig(vorbis) \
pkgconfig(vorbisfile) \
pkgconfig(zlib)"

inherit rpm
