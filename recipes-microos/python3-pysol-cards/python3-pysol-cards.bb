SUMMARY = "Python module for pysol-cards"
DESCRIPTION = "This module allows the python developer to generate the initial deals of some \
PySol FC games. It also supports PySol legacy deals and Microsoft FreeCell / \
Freecell Pro deals."
LICENSE = "Apache-2.0"

PV = "0.14.2"

RPM_NAME = "python3-pysol-cards-0.14.2-1.2.noarch.rpm"
RPM_HASH = "291f6652ba069bc9ad44095957b226ea61b2ef956c352d97d5e14056a8e80009e3fdd312e60ca8732e793838ff1d75cd571175bb1e6aeb8bdbdf12f37457797f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pysol-cards python3.10dist(pysol-cards) python3dist(pysol-cards)"
RDEPENDS:${PN} += "python(abi) python3-random2 python3-six"

inherit rpm
