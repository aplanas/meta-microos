SUMMARY = "Documentation for python-networkx"
DESCRIPTION = "Documentation and examples for python-networkx."
LICENSE = "BSD-3-Clause"

PV = "2.8.8"

RPM_NAME = "python-networkx-doc-2.8.8-1.3.noarch.rpm"
RPM_HASH = "9071c425089278c8f09e5c9ab3d18bd86445742148a4e8b03832af9f7986d7937ca5da24da0dd52660e98dae2f24d25512fa0b5f7e91077eb8adeecccd7bd981"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-networkx-doc python310-networkx-doc python311-networkx-doc python39-networkx-doc"
RDEPENDS:${PN} += ""

inherit rpm
