SUMMARY = "Metis documentation"
DESCRIPTION = "METIS is a family of programs for partitioning unstructured graphs and hypergraph \
and computing fill-reducing orderings of sparse matrices. The underlying algorithms \
used by METIS are based on a multilevel paradigm that, at the time, had been \
shown to produce quality results and scale to large problems."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "metis-doc-5.1.0-9.11.noarch.rpm"
RPM_HASH = "708a8c030f3ef91c165bc54cb0ad9f9d5740e8bfc137216ecf0dd9439fe90be3bf3f272e1327d0e6c2e6ea674e8f0de5cb03f1b5cd12537089c58b6fca8e7cd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metis-doc"
RDEPENDS:${PN} += ""

inherit rpm
