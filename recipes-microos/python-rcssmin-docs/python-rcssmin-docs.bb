SUMMARY = "Documentation files for python-rcssmin"
DESCRIPTION = "HTML Documentation and examples for python-rcssmin."
LICENSE = "Apache-2.0"

PV = "1.1.1"

RPM_NAME = "python-rcssmin-docs-1.1.1-1.4.aarch64.rpm"
RPM_HASH = "60cfb43266caa3b19f2e8ce38f9b5693f6d3726a5e9bbbbb2852058ddb24cbf2d667e36b7d0b863942ef869cc21cedac11440b14a68b696e36a5da3a0907ada7"

RPROVIDES:${PN} += "python-rcssmin-docs \
python-rcssmin-docs(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
