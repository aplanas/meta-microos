SUMMARY = "A Python library for rich text and beautiful formatting in the terminal"
DESCRIPTION = "Render rich text, tables, progress bars, syntax highlighting, \
markdown and more to the terminal."
LICENSE = "MIT"

PV = "13.3.5"

RPM_NAME = "python310-rich-13.3.5-1.1.noarch.rpm"
RPM_HASH = "ab77dc3dc6d0a117bb34f84fa9e446d1bffcb295f247ff135563e09cc72976444d7ee7e357f5b0b89b4dc173da55e82f8e5932df3e258b656fdbca7c2ceb3e19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rich python3.10dist(rich) python310-rich python3dist(rich)"
RDEPENDS:${PN} += "python(abi) python310-markdown-it-py python310-pygments"

inherit rpm
