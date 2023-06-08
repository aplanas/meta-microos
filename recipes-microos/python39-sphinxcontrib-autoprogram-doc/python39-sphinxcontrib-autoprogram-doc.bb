SUMMARY = "Documentation for sphinxcontrib-autoprogram"
DESCRIPTION = "This package contains the documentation for the package \
python-sphinxcontrib-autoprogram."
LICENSE = "BSD-2-Clause"

PV = "0.1.8"

RPM_NAME = "python39-sphinxcontrib-autoprogram-doc-0.1.8-2.1.noarch.rpm"
RPM_HASH = "3eca3066b45f039a6930467a1c05de260f3e7c18d9449e06db2f5fffbcc72fd5575da99170e15628dfabcd403411204f74df29a13dd0b77b6492775dc8b2c46c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-sphinxcontrib-autoprogram-doc"
RDEPENDS:${PN} += "python39-Sphinx"

inherit rpm
