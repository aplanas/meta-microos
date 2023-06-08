SUMMARY = "Development headers for Boost.Graph library"
DESCRIPTION = "Development headers for Boost.Graph library. The BGL algorithms consist \
of a core set of algorithm patterns and a larger set of graph \
algorithms. The core algorithm patterns are Breadth First Search, Depth \
First Search, and Uniform Cost Search. \
 \
This package installs the default Boost version of the library."
LICENSE = "MIT"

PV = "1.82.0"

RPM_NAME = "libboost_graph-devel-1.82.0-1.1.noarch.rpm"
RPM_HASH = "b93aca0b3f21aebe3bcc6430b691e157f62c3aa8ce9a29c5169bb907ccf8da1b6bfb5c656d7c648df468c0cdf9ef9b527d42d426dbfd69453bb58c054a09b892"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libboost_graph-devel"
RDEPENDS:${PN} += "libboost_graph1_82_0-devel"

inherit rpm
