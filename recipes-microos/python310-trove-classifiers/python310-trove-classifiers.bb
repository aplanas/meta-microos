SUMMARY = "Canonical source for classifiers on PyPI"
DESCRIPTION = "Classifiers categorize projects per PEP 301. Use this package to validate classifiers in packages for PyPI upload or download."
LICENSE = "Apache-2.0"

PV = "2023.5.2"

RPM_NAME = "python310-trove-classifiers-2023.5.2-1.1.noarch.rpm"
RPM_HASH = "20b29fbd27c63d062ea0b1d560b9897e7868a455cc6738ec269e225c5e86620dcd4c18547d3822c25bf5b9e30af1ce849787cad0de4301aadef24dca3db1398f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-trove-classifiers \
python3.10dist(trove-classifiers) \
python310-trove-classifiers \
python3dist(trove-classifiers)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
