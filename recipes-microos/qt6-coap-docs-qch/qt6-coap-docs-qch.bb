SUMMARY = "Documentation for qt6-coap in QCH format"
DESCRIPTION = "This package contains documentation for qt6-coap in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-coap-docs-qch-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "0e793ccfa5257d3b70373f56482695a9df46c66d3c7266eadb9b6b061afd1d487ae05b5260622b525940cf49fe93a6f59ff828b6df8bda2eda1c88423cfc5b6e"

RPROVIDES:${PN} += "qt6-coap-docs-qch qt6-coap-docs-qch(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
