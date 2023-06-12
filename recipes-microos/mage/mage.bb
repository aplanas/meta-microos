SUMMARY = "A make-like build tool using Go"
DESCRIPTION = " \
Mage is a make-like build tool using Go. You write plain-old go functions, and Mage automatically uses them as Makefile-like runnable targets."
LICENSE = "Apache-2.0"

PV = "v1.11.0~git0.07afc7d"

RPM_NAME = "mage-v1.11.0~git0.07afc7d-1.10.aarch64.rpm"
RPM_HASH = "b72ef546d32e9ad021e24221c8a1bdadaccfe7db3854cba9fd0168cc84b99c0ee03157fbba0623bfaa0ed0bbd468d8a58c18f9db6fae625943e682edabfc3c59"

RPROVIDES:${PN} += "mage \
mage(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
