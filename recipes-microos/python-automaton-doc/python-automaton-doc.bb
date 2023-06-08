SUMMARY = "Documentation for the Automaton Library"
DESCRIPTION = "Documentation for the Automaton library."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "python-automaton-doc-3.1.0-1.2.noarch.rpm"
RPM_HASH = "7fdacf1e33e395d26335df039a912032e228c7ea13967154db3d3146ddde38e65a8e0cd16a545c970de74a268df2424f111e9741ceb5071d3da4204feb167492"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-automaton-doc"
RDEPENDS:${PN} += ""

inherit rpm
