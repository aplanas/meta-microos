SUMMARY = "A pure Python implementation of the Cassowary constraint solving algorithm"
DESCRIPTION = "A pure Python implementation of the Cassowary constraint-solving algorithm. \
Cassowary is the algorithm that forms the core of the OS X and iOS visual \
layout mechanism."
LICENSE = "BSD-3-Clause"

PV = "0.5.2"

RPM_NAME = "python310-cassowary-0.5.2-2.8.noarch.rpm"
RPM_HASH = "39ec29ce35594e3878f8869809db5e8e1e63e34c2e7b41c6378d298745789a2a040eeafd7fa4da25662701fd72f33589782453acf316ffb7f73bc4c04569364e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cassowary \
python3.10dist(cassowary) \
python310-cassowary \
python3dist(cassowary)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
