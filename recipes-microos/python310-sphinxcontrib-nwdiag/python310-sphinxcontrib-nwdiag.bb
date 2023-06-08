SUMMARY = "Sphinx 'nwdiag' extension"
DESCRIPTION = "sphinxcontrib-nwdiag is a Sphinx extension for embedding nwdiag \
diagrams. Network diagrams can be embedded with the 'nwdiag', \
'rackdiag' and 'packetdiag' directives."
LICENSE = "BSD-2-Clause"

PV = "2.0.0"

RPM_NAME = "python310-sphinxcontrib-nwdiag-2.0.0-1.13.noarch.rpm"
RPM_HASH = "a9d4287cd5963b538da45ad1bc740a70afa1c37b5f9225474b59bd1b4b21ae76c963d45e687501c2610bbea0aef1cdc5ecba19d1df263c2d2461b61caa6852c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-nwdiag python3.10dist(sphinxcontrib-nwdiag) python310-sphinxcontrib-nwdiag python3dist(sphinxcontrib-nwdiag)"
RDEPENDS:${PN} += "python(abi) python310-Sphinx python310-blockdiag python310-nwdiag"

inherit rpm
