SUMMARY = "The official unofficial pip API"
DESCRIPTION = "The official unofficial pip API."
LICENSE = "Apache-2.0"

PV = "0.0.30"

RPM_NAME = "python311-pip-api-0.0.30-1.3.noarch.rpm"
RPM_HASH = "eacaaff28d84b606d0ac8c344902414fe70a70c2bf76d62f9fcc135944140cecb7a8f135afbe9f27baebb093ad9d9c512805be4a214d5743051fe8e44b18fe6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pip-api) python311-pip-api python3dist(pip-api)"
RDEPENDS:${PN} += "python(abi) python311-pip"

inherit rpm
