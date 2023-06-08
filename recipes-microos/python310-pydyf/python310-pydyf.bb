SUMMARY = "A low-level PDF generator"
DESCRIPTION = "A low-level PDF generator written in Python and based on PDF specification 1.7."
LICENSE = "BSD-3-Clause"

PV = "0.6.0"

RPM_NAME = "python310-pydyf-0.6.0-1.1.noarch.rpm"
RPM_HASH = "fc9a46eca220be2f3cac64eebdcde26c9f7931affda475b54df09fc96bd6e5db6372fca94ff076e65b165e2e84022b94254db3589fa47ae270e8cde7369130c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pydyf python3.10dist(pydyf) python310-pydyf python3dist(pydyf)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
