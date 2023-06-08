SUMMARY = "A python library adding a json log formatter"
DESCRIPTION = "A python library adding a json log formatter."
LICENSE = "BSD-2-Clause"

PV = "2.0.7"

RPM_NAME = "python39-python-json-logger-2.0.7-1.1.noarch.rpm"
RPM_HASH = "c7147bbf39ccc25e7fdcaa36aae81513c34a466d901766eda7176de75b0bc30db7f4e40eae27ae772a974bf4425d30aa57809f7e5169940b41309ddb932eac55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(python-json-logger) python39-python-json-logger python3dist(python-json-logger)"
RDEPENDS:${PN} += "python(abi) python39-setuptools"

inherit rpm
