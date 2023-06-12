SUMMARY = "GNU Radio documentation"
DESCRIPTION = "GNU Radio is a collection of software that when combined with minimal \
hardware, allows the construction of radios where the actual waveforms \
transmitted and received are defined by software. What this means is \
that it turns the digital modulation schemes used in today's high \
performance wireless devices into software problems. \
 \
This package contains documentation for GNU Radio."
LICENSE = "GPL-3.0-or-later"

PV = "3.10.6.0"

RPM_NAME = "gnuradio-doc-3.10.6.0-4.2.noarch.rpm"
RPM_HASH = "83b64646ba89922552914a7d4d3c22f9839f1d17efcbdfe0c158b1009a4101f1d128faad745ed3b5a75a8682d53e60898e698a8c065330cf949546bf928173fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnuradio-doc"
RDEPENDS:${PN} += "gnuradio"

inherit rpm
