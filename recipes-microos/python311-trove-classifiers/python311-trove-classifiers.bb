SUMMARY = "Canonical source for classifiers on PyPI"
DESCRIPTION = "Classifiers categorize projects per PEP 301. Use this package to validate classifiers in packages for PyPI upload or download."
LICENSE = "Apache-2.0"

PV = "2023.5.2"

RPM_NAME = "python311-trove-classifiers-2023.5.2-1.1.noarch.rpm"
RPM_HASH = "26aad898981be790480f56b606293a7ce03def25ed7daf54ac0c3bf92057a241588dc2be0e5284ab5c90393f6a76602b78ba6123772d16a3b7a3e127186056cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(trove-classifiers) python311-trove-classifiers python3dist(trove-classifiers)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
