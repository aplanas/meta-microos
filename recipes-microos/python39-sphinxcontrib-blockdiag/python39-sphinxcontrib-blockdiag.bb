SUMMARY = "Sphinx 'blockdiag' extension"
DESCRIPTION = "A sphinx extension for embedding block diagram using blockdiag."
LICENSE = "BSD-2-Clause"

PV = "3.0.0"

RPM_NAME = "python39-sphinxcontrib-blockdiag-3.0.0-3.3.noarch.rpm"
RPM_HASH = "8573f7b206f5952ae63050c8f9aa98ce3297c0fbd588291d7414f4d46bdc8568ffc4bce4348408eb6fe5ffcfb69b018b6f7377a6a29a56607aad60a5d1325c36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sphinxcontrib-blockdiag) \
python39-sphinxcontrib-blockdiag \
python3dist(sphinxcontrib-blockdiag)"
RDEPENDS:${PN} += "python(abi) \
python39-Sphinx \
python39-blockdiag"

inherit rpm
