SUMMARY = "Wrappers to build Python packages using PEP 517 hooks"
DESCRIPTION = "Wrappers to build Python packages using PEP 517 hooks."
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "python39-pep517-0.13.0-3.1.noarch.rpm"
RPM_HASH = "194c3283b97af07c920f055ff8a89fd5efb1eef4e85852d0f7cd945869521199dfc3eb8731169dd427a2abe584c45741c12753f9eef0a363add6fc92e33ffbac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pep517) python39-pep517 python3dist(pep517)"
RDEPENDS:${PN} += "python(abi) python39-tomli"

inherit rpm
