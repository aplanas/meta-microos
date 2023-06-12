SUMMARY = "Sphinx Qt documentation"
DESCRIPTION = "This is plugin to add cross-link to qt documentation for python code created with PyQt5/6 or PySide2/6."
LICENSE = "BSD-2-Clause"

PV = "0.4.1"

RPM_NAME = "python39-sphinx-qt-documentation-0.4.1-1.2.noarch.rpm"
RPM_HASH = "4c23f055038eddc2f466890de7392fef4e8424801aa59fcdd5bd6759e2a62aadd9529b4c1b683dcb9f32036b4e1b2e9cd8f5d579ae95dc1795ed473a8f14348b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sphinx-qt-documentation) \
python39-sphinx-qt-documentation \
python3dist(sphinx-qt-documentation)"
RDEPENDS:${PN} += "python(abi) \
python39-Sphinx"

inherit rpm
