SUMMARY = "A Python library for rich text and beautiful formatting in the terminal"
DESCRIPTION = "Render rich text, tables, progress bars, syntax highlighting, \
markdown and more to the terminal."
LICENSE = "MIT"

PV = "13.4.1"

RPM_NAME = "python310-rich-13.4.1-1.1.noarch.rpm"
RPM_HASH = "ef9b0bc15f3d415fbb72d96eb337ac1aee0091ae64ca5231cf89a29dc6a3b3af5806e7f737315f82b41bd9b9928d665c5ee8a14268e5a27b778bbf34bf971819"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rich python3.10dist(rich) python310-rich python3dist(rich)"
RDEPENDS:${PN} += "python(abi) python310-markdown-it-py python310-pygments"

inherit rpm
