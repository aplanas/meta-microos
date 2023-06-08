SUMMARY = "Package Documentation for Python 3"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in HTML format."
LICENSE = "Python-2.0"

PV = "3.11.2"

RPM_NAME = "python311-doc-3.11.2-1.3.aarch64.rpm"
RPM_HASH = "df4c49d3021888ea83dabf59e7d33bc5e4867dffcc02d7b23f78978e83a7bbdb2f8ddee5b5f0eb2a550630fb0775089d28b96353e822321149908c89c1d1f2f1"

RPROVIDES:${PN} += "python311-doc python311-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
