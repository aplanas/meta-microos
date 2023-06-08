SUMMARY = "JSON Referencing + Python"
DESCRIPTION = "JSON Referencing + Python"
LICENSE = "MIT"

PV = "0.28.1"

RPM_NAME = "python39-referencing-0.28.1-2.1.noarch.rpm"
RPM_HASH = "f2b5030d9e061a7cfe94359df61da267273b629e43a9c62cce59565671a319fd572fb4e667fa90815500f5bee8e5175d59b510e95bc2c5db4bf958e169752c49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(referencing) python39-referencing python3dist(referencing)"
RDEPENDS:${PN} += "python(abi) python39-attrs python39-rpds-py"

inherit rpm
