SUMMARY = "Non-ABI stable experimental API for the Qt5 SVG library"
DESCRIPTION = "This package provides private headers of libqt5-qtsvg that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde8"

RPM_NAME = "libqt5-qtsvg-private-headers-devel-5.15.9+kde8-1.1.noarch.rpm"
RPM_HASH = "3f1cb968e49d63cfdad1bc9e43cb6edf6372121619f5968c552492d8b0a98911ac4e75c4fd4681e4d8d20ab3f496e438d64b028f70c52931307148d12e32bdc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5Svg-private-headers-devel \
libqt5-qtsvg-private-headers-devel"
RDEPENDS:${PN} += "libqt5-qtsvg-devel"

inherit rpm
