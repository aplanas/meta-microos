SUMMARY = "Metis examples"
DESCRIPTION = "METIS library provides to partitioning unstructured graphs and hypergraph \
and computing fill-reducing orderings of sparse matrices. This package provides \
graph files you can use to test Metis."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "metis_5_1_0-gnu-hpc-examples-5.1.0-9.11.noarch.rpm"
RPM_HASH = "2d2add0dadee55c722054af78b9f26a033f9567a2b64f5d4ecd2652bf2c2ea8a94774f917ca07dca9739d7040dfd521205c31b704d48da52bf0d660dfa34008d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metis_5_1_0-gnu-hpc-examples"
RDEPENDS:${PN} += ""

inherit rpm
