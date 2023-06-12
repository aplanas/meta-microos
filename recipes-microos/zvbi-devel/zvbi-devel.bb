SUMMARY = "Development files for the VBI decoding library"
DESCRIPTION = "This package includes the development files for the zvbi library which \
provides routines to read from raw VBI sampling devices, to demodulate raw to \
sliced VBI data, and to interpret the data of several popular services."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.2.41"

RPM_NAME = "zvbi-devel-0.2.41-2.1.aarch64.rpm"
RPM_HASH = "478a28e0e2576847f0cd88ee8429afadf44865e90ccba9e35c2817bf17b82c6f1f83f51cb60c1c8b5eafd7e0c5a6cb681f0a1e3e93e0dd9202e4ae768480dd82"

RPROVIDES:${PN} += "pkgconfig(zvbi-0.2) \
zvbi-devel \
zvbi-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libzvbi-chains0 \
libzvbi0"

inherit rpm
