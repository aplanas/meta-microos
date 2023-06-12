SUMMARY = "Documentation for siproxd"
DESCRIPTION = "HTML and PDF documentation for siproxd"
LICENSE = "GPL-2.0-or-later"

PV = "0.8.3"

RPM_NAME = "siproxd-doc-0.8.3-3.10.aarch64.rpm"
RPM_HASH = "53dbcb8cfd9f54b039b05c207d879e18497f1ef91ec0243a7170a03e02a2560b146c48501c4a620fe09ca1d9918d893fd39850ad51fd4ebb20281fab83ef8a18"

RPROVIDES:${PN} += "siproxd-doc \
siproxd-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
