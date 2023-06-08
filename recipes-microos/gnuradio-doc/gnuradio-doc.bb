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

RPM_NAME = "gnuradio-doc-3.10.6.0-4.1.noarch.rpm"
RPM_HASH = "d64d239c163cae78e067fb0565923f156e020a80886a8dadcf0844d1934bf6c5ee41c9551162b81ba9c3f0f580aacd3e4fbc7a6f5018d16fb103bceb2db2adb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnuradio-doc"
RDEPENDS:${PN} += "gnuradio"

inherit rpm
