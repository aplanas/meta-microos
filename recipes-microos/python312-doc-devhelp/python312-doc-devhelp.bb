SUMMARY = "Additional Package Documentation for Python 3 in devhelp format"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in format for devhelp."
LICENSE = "Python-2.0"

PV = "3.12.0b1"

RPM_NAME = "python312-doc-devhelp-3.12.0b1-1.1.aarch64.rpm"
RPM_HASH = "32139856b8d91499d18ac60ac8e1b223e1558ce14e146b540d3734522cc4aa97af2fd981192f231f976ffc839ec03440b4c38e96a88b797d9729e5fc7e6ca729"

RPROVIDES:${PN} += "python312-doc-devhelp \
python312-doc-devhelp(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
