SUMMARY = "A Python library for rich text and beautiful formatting in the terminal"
DESCRIPTION = "Render rich text, tables, progress bars, syntax highlighting, \
markdown and more to the terminal."
LICENSE = "MIT"

PV = "13.3.5"

RPM_NAME = "python39-rich-13.3.5-1.1.noarch.rpm"
RPM_HASH = "0476d6335b9597706a9bc767a372d7c8ac5faf6d89d5f2c2aa0042ade3a0e3b17f7b80f83afc617e0d6bed4fbbd53f63534113c3b17d3468f5938a695f476074"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(rich) python39-rich python3dist(rich)"
RDEPENDS:${PN} += "python(abi) python39-markdown-it-py python39-pygments"

inherit rpm
