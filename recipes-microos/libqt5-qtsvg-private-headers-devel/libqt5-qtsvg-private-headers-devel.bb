SUMMARY = "Non-ABI stable experimental API for the Qt5 SVG library"
DESCRIPTION = "This package provides private headers of libqt5-qtsvg that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde7"

RPM_NAME = "libqt5-qtsvg-private-headers-devel-5.15.9+kde7-1.1.noarch.rpm"
RPM_HASH = "6b9e70ba8255ae612ebeac39ad921bea557116cadcefdf51390f45ab2c35f006645b1d1f9177c462797bd02546f5e59c1376531405feddf1f7fca0a7ca9bc697"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5Svg-private-headers-devel libqt5-qtsvg-private-headers-devel"
RDEPENDS:${PN} += "libqt5-qtsvg-devel"

inherit rpm
