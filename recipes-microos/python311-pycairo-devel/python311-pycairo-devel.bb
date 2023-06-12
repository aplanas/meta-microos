SUMMARY = "Development files for the Cairo Python bindings"
DESCRIPTION = "Pycairo is a Python module providing bindings for the cairo graphics library. \
 \
This package provides the development files needed to build \
packages that depend on Pycairo."
LICENSE = "LGPL-2.1-or-later | MPL-1.1"

PV = "1.23.0"

RPM_NAME = "python311-pycairo-devel-1.23.0-2.1.aarch64.rpm"
RPM_HASH = "1562b53c3ad339b6f8b247869fe5e848d5399582975a832ccf15de28eed296fb8c3152c675e6c2089e6d017ea882c68a99f5cc0440ac0af11ab32352891bd740"

RPROVIDES:${PN} += "python311-cairo-devel \
python311-pycairo-devel \
python311-pycairo-devel(aarch-64)"
RDEPENDS:${PN} += "python311-devel \
python311-pycairo \
python311-pycairo-common-devel"

inherit rpm
