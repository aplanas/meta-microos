SUMMARY = "Package Documentation for Python 3"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in HTML format."
LICENSE = "Python-2.0"

PV = "3.12.0a7"

RPM_NAME = "python312-doc-3.12.0a7-1.1.aarch64.rpm"
RPM_HASH = "7c8f5dbc96d4460601fdc666b9ab35eb99a5d3941c828a82043f0ea7826c5605d30c143cab2f9650d8feb592dfaf9157e1293d14071ce1fe3011e8e27888bc73"

RPROVIDES:${PN} += "python312-doc python312-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
