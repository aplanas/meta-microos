SUMMARY = "A make-like build tool using Go"
DESCRIPTION = " \
Mage is a make-like build tool using Go. You write plain-old go functions, and Mage automatically uses them as Makefile-like runnable targets."
LICENSE = "Apache-2.0"

PV = "v1.11.0~git0.07afc7d"

RPM_NAME = "mage-v1.11.0~git0.07afc7d-1.9.aarch64.rpm"
RPM_HASH = "f79a1cec0cd68afe0aac1056775cb15b3e0a06db912390aa3de342bce1e5d3223f5f8c231ee156cf1520fab3455ea01a8a6382602257a1e635221f63d9c4bff6"

RPROVIDES:${PN} += "mage mage(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
