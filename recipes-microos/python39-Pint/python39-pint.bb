SUMMARY = "Physical quantities module"
DESCRIPTION = "Pint is Python module/package to define, operate and manipulate physical \
quantities, the product of a numerical value and a unit of measurement. \
It allows arithmetic operations between them and conversions from and \
to different units. \
 \
It is distributed with a comprehensive list of physical units, prefixes \
and constants. Due to it's modular design, you to extend (or even rewrite!) \
the complete list without changing the source code."
LICENSE = "BSD-3-Clause"

PV = "0.20.1"

RPM_NAME = "python39-Pint-0.20.1-1.4.noarch.rpm"
RPM_HASH = "38898b3f1bc0ae0e86a7ac0a5a0b1eb8bf99e7d522a3681ae5b7d0f4ed99c33d4e0fe565d22ce4ffba9656ece620cb7ab0a2f5154761b0828fbc442cf0051edd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pint) python39-Pint python3dist(pint)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/env /usr/bin/python3.9 python(abi) python39-importlib-metadata python39-importlib-resources python39-packaging python39-uncertainties"

inherit rpm
