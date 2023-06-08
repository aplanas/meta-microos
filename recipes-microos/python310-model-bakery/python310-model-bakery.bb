SUMMARY = "Smart object creation facility for Django"
DESCRIPTION = "Smart object creation facility for Django."
LICENSE = "Apache-2.0"

PV = "1.9.0"

RPM_NAME = "python310-model-bakery-1.9.0-1.3.noarch.rpm"
RPM_HASH = "62e964d635c9acdbf51cbb5e12b8c7bfe8cbe9315b9db16c04405fb0f45e4f2feef9d9c03714e8742740a3df0912c1d45a5d116cfd7d09efd241fa6a9342e5fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-model-bakery python3.10dist(model-bakery) python310-model-bakery python3dist(model-bakery)"
RDEPENDS:${PN} += "python(abi) python310-Django"

inherit rpm
