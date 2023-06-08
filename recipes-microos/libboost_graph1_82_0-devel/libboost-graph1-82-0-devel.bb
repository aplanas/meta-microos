SUMMARY = "Development headers for Boost.Graph library"
DESCRIPTION = "Development headers for Boost.Graph library. The BGL algorithms consist \
of a core set of algorithm patterns and a larger set of graph \
algorithms. The core algorithm patterns are Breadth First Search, Depth \
First Search, and Uniform Cost Search."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_graph1_82_0-devel-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "c14b80c8b147a35fca330de0d68a08d1fc34e812f73d322695bd41ac8326fdd16b69eff12b1c6bf7261819cbfc0426b96ac594be1b98727d8f58de50d7e7ab13"

RPROVIDES:${PN} += "libboost_graph-devel-impl libboost_graph1_82_0-devel libboost_graph1_82_0-devel(aarch-64)"
RDEPENDS:${PN} += "libboost_graph1_82_0 libboost_headers1_82_0-devel libboost_regex1_82_0-devel libstdc++-devel"

inherit rpm
