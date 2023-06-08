SUMMARY = "Development files for the Osmocom TRAU (E1/RTP) library"
DESCRIPTION = "This library implements the Transcoder and Rate Adaptation Unit \
(TRAU) for GSM systems. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmotrau."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.0"

RPM_NAME = "libosmotrau-devel-1.3.0-1.4.aarch64.rpm"
RPM_HASH = "43e28b6109188f791726aea5b9628b85bcfe484420da9e1fbbebc95cb9b2cea06b14ef296385ae7142b928b37e2d0f5669f41d6950dd257b780970cbfa7c2a0a"

RPROVIDES:${PN} += "libosmotrau-devel libosmotrau-devel(aarch-64) pkgconfig(libosmotrau)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libosmotrau2"

inherit rpm
