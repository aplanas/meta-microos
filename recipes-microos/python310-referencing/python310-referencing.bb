SUMMARY = "JSON Referencing + Python"
DESCRIPTION = "JSON Referencing + Python"
LICENSE = "MIT"

PV = "0.28.1"

RPM_NAME = "python310-referencing-0.28.1-2.1.noarch.rpm"
RPM_HASH = "65b3069f61906683f8fed0e7ef0f8c9301ebad4ed5c2f093ea532e3714aef030f134191dba7c875d261e4429fb72fe0e9cae476762e01824ee3aad8217ca0c6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-referencing python3.10dist(referencing) python310-referencing python3dist(referencing)"
RDEPENDS:${PN} += "python(abi) python310-attrs python310-rpds-py"

inherit rpm
