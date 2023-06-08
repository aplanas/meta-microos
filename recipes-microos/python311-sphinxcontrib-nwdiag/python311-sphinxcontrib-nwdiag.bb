SUMMARY = "Sphinx 'nwdiag' extension"
DESCRIPTION = "sphinxcontrib-nwdiag is a Sphinx extension for embedding nwdiag \
diagrams. Network diagrams can be embedded with the 'nwdiag', \
'rackdiag' and 'packetdiag' directives."
LICENSE = "BSD-2-Clause"

PV = "2.0.0"

RPM_NAME = "python311-sphinxcontrib-nwdiag-2.0.0-1.13.noarch.rpm"
RPM_HASH = "0d7120b0867fea711e3fcd4a3386d7e0a1d13ad29f27016df4784d277e1d95cca7898c50c31ee512dc222f1469039a5e5da244fd04bd0ebd03fd7a803b56a1a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sphinxcontrib-nwdiag) python311-sphinxcontrib-nwdiag python3dist(sphinxcontrib-nwdiag)"
RDEPENDS:${PN} += "python(abi) python311-Sphinx python311-blockdiag python311-nwdiag"

inherit rpm
