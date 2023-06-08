SUMMARY = "A collection of cache libraries in the same API interface"
DESCRIPTION = "A collection of cache libraries in the same API interface."
LICENSE = "BSD-3-Clause"

PV = "0.10.2"

RPM_NAME = "python39-cachelib-0.10.2-1.3.noarch.rpm"
RPM_HASH = "555986ed97e988182516e98b8e1d87bce3f6dc7a42ffa55cecfc74c087fe2f5fa879558a67a0e5963ab523dd26f544fd44ea86d4c15b7ffea2c22e3c4cdbf460"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(cachelib) python39-cachelib python3dist(cachelib)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
