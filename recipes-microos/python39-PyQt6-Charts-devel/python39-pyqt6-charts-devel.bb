SUMMARY = "Devel files for python39-PyQt6-Charts"
DESCRIPTION = "This package provides Qt6 API files for the Eric IDE and the SIP files \
used to generate the Python bindings for python39-PyQt6-Charts"
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python39-PyQt6-Charts-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "6a841fd309410094a327eab8b0f89932955fb77691ffa67b7b957f35390002aaa1eba81c48a8004cf85c3cbfc97bc9606726bb6c96ca6a116cc562040891df55"

RPROVIDES:${PN} += "python39-PyQt6-Charts-devel python39-PyQt6-Charts-devel(aarch-64)"
RDEPENDS:${PN} += "python(abi) python39-PyQt6-devel"

inherit rpm
