SUMMARY = "Sphinx 'seqdiag' extension"
DESCRIPTION = "A sphinx extension for embedding sequence diagram using seqdiag_. \
 \
This extension enables you to insert sequence diagrams into your document."
LICENSE = "BSD-2-Clause"

PV = "3.0.0"

RPM_NAME = "python310-sphinxcontrib-seqdiag-3.0.0-1.6.noarch.rpm"
RPM_HASH = "62c992c7da4eef0715b351b25f2c8a8038a52f6eeb785a5fc502a2f8767438c8e06bce7eee7b56bdc129d4e5ffe54e8a88389a7e29d357aa0a38c85bfc1cafc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-seqdiag \
python3.10dist(sphinxcontrib-seqdiag) \
python310-sphinxcontrib-seqdiag \
python3dist(sphinxcontrib-seqdiag)"
RDEPENDS:${PN} += "python(abi) \
python310-Sphinx \
python310-blockdiag \
python310-seqdiag"

inherit rpm
