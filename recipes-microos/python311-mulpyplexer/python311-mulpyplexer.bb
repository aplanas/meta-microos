SUMMARY = "A module that multiplexes interactions with lists of python objects"
DESCRIPTION = "Mulpyplexer is a piece of code that can multiplex interactions with lists of python objects."
LICENSE = "BSD-2-Clause"

PV = "0.09"

RPM_NAME = "python311-mulpyplexer-0.09-1.3.noarch.rpm"
RPM_HASH = "ea951e0069427fecc90f46e2137fdf659bac0f50c295acba72ba77b907a8372a97b23992d3f78538c6e96c07e4a63333758f03da63ca6b883ea8122fc8224bf3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(mulpyplexer) python311-mulpyplexer python3dist(mulpyplexer)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
