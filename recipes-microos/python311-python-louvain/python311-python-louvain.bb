SUMMARY = "Louvain algorithm for community detection"
DESCRIPTION = "This module implements community detection. \
 \
It uses the louvain method described in Fast unfolding of \
communities in large networks, Vincent D Blondel, Jean-Loup \
Guillaume, Renaud Lambiotte, Renaud Lefebvre, Journal of \
Statistical Mechanics: Theory and Experiment 2008(10), P10008 (12pp)"
LICENSE = "BSD-3-Clause"

PV = "0.16"

RPM_NAME = "python311-python-louvain-0.16-1.5.noarch.rpm"
RPM_HASH = "c2e3a78ef79697b251542b66de608d53518520df1a3029d7c552359d8212525b6ce61b2459f1d016ca4c4cb7681ade7b8abfc4cfbb256611231956876942d2a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(python-louvain) python311-python-louvain python3dist(python-louvain)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-networkx python311-numpy update-alternatives"

inherit rpm
