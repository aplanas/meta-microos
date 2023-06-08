SUMMARY = "Sphinx extension which outputs Devhelp documents"
DESCRIPTION = "sphinxcontrib-devhelp is a sphinx extension which outputs Devhelp document."
LICENSE = "BSD-2-Clause"

PV = "1.0.2"

RPM_NAME = "python39-sphinxcontrib-devhelp-1.0.2-2.1.noarch.rpm"
RPM_HASH = "20dac81f57b113573a82cbf589534ca981585092daca9365b80472ffba9a09ea9f8931e78c39da6be21c88b29d86538395c8b5ee42554552b0266391988f69bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sphinxcontrib-devhelp) python39-sphinxcontrib-devhelp python3dist(sphinxcontrib-devhelp)"
RDEPENDS:${PN} += "python(abi) python39-Sphinx"

inherit rpm
