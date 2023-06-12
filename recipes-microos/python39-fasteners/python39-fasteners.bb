SUMMARY = "A python package that provides useful locks"
DESCRIPTION = "A python package that provides useful locks \
It includes the following. \
 * Locking decorator \
 * Reader-writer locks \
 * Inter-process locks \
 * Generic helpers"
LICENSE = "Apache-2.0"

PV = "0.17.3"

RPM_NAME = "python39-fasteners-0.17.3-1.4.noarch.rpm"
RPM_HASH = "d6d7626457da383b83df96c219c4b537335ad78f606dd7e4f7a47c956a6acd31e65b941fde186f1684d790e47f5f7da39ac3e287c33e441afaaa9079a714e39c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(fasteners) \
python39-fasteners \
python3dist(fasteners)"
RDEPENDS:${PN} += "python(abi) \
python39-more-itertools \
python39-six"

inherit rpm
