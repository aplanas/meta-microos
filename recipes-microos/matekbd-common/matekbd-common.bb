SUMMARY = "MATE Desktop keyboard configuration common files"
DESCRIPTION = "This package provides libmatekdb, an API to manage the keyboard in \
MATE Desktop applications."
LICENSE = "LGPL-2.1-or-later"

PV = "1.26.1"

RPM_NAME = "matekbd-common-1.26.1-1.1.aarch64.rpm"
RPM_HASH = "b87380d2cad586048292834105a8eb127fc6e44ff87d04321da625228ea2259575b3085562fa720401e993ee21b757ec846cc6d725b555e75b09b69a0dc6c099"

RPROVIDES:${PN} += "matekbd-common \
matekbd-common(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
