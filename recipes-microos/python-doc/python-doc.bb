SUMMARY = "Additional Package Documentation for Python"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in HTML format."
LICENSE = "Python-2.0"

PV = "2.7.18"

RPM_NAME = "python-doc-2.7.18-34.1.noarch.rpm"
RPM_HASH = "e0ac2216007cfba067888dcfa15a7a83d7338e4b37f5289ed7b663f2a03df983eddee3142a5353004b3f424449b260561b772508365946909598a41b4cdc39ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pyth_doc pyth_ps python-doc python2-doc"
RDEPENDS:${PN} += ""

inherit rpm
