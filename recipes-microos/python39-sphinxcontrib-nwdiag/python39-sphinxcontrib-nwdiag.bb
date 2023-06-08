SUMMARY = "Sphinx 'nwdiag' extension"
DESCRIPTION = "sphinxcontrib-nwdiag is a Sphinx extension for embedding nwdiag \
diagrams. Network diagrams can be embedded with the 'nwdiag', \
'rackdiag' and 'packetdiag' directives."
LICENSE = "BSD-2-Clause"

PV = "2.0.0"

RPM_NAME = "python39-sphinxcontrib-nwdiag-2.0.0-1.13.noarch.rpm"
RPM_HASH = "b94136324b05f702511e00d79c6968d64b03663b62c3c1ff8471e7f5e4e3299fcba914dae9e7b5720ddbd9aeb864ccee15ba727391fed6dfe7bc16c549755727"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sphinxcontrib-nwdiag) python39-sphinxcontrib-nwdiag python3dist(sphinxcontrib-nwdiag)"
RDEPENDS:${PN} += "python(abi) python39-Sphinx python39-blockdiag python39-nwdiag"

inherit rpm
