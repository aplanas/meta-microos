SUMMARY = "Library for Decoding and Generation of MPEG TS and DVB PSI Tables"
DESCRIPTION = "libdvbpsi is a simple library designed for decoding and generation of \
MPEG TS and DVB PSI tables. \
 \
Current features: * Program Association Table (PAT), decoder and \
   generator. \
 \
* Program Map Table (PMT), decoder and generator. \
* All MPEG 2 descriptors, decoders and generators."
LICENSE = "LGPL-2.1+"

PV = "0.2.2"

RPM_NAME = "libdvbpsi-0-devel-0.2.2-6.26.aarch64.rpm"
RPM_HASH = "1738854a8ae3199aa10be81ef3708a4b55e1b6518dc0a6030a13b8561b239f8c6b92d3b80c448bbeabaf74f55f4d75d2aa54428b0ea41aa26fab6b2f9f05d3cf"

RPROVIDES:${PN} += "libdvbpsi-0-devel libdvbpsi-0-devel(aarch-64) libdvbpsi-devel pkgconfig(libdvbpsi)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libdvbpsi7"

inherit rpm
