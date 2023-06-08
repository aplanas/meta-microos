SUMMARY = "The official unofficial pip API"
DESCRIPTION = "The official unofficial pip API."
LICENSE = "Apache-2.0"

PV = "0.0.30"

RPM_NAME = "python39-pip-api-0.0.30-1.3.noarch.rpm"
RPM_HASH = "551d06c783a6e8eeb6e20f3a2cbb6d499d8d7105270d01d3861cc0853ae5caa055a87e76748d036cad8015fac95383a70a4fbbcbdfcce6f36e65ee02bc21206e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pip-api) python39-pip-api python3dist(pip-api)"
RDEPENDS:${PN} += "python(abi) python39-pip"

inherit rpm
