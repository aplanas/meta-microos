SUMMARY = "Package Documentation for Python 3"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in HTML format."
LICENSE = "Python-2.0"

PV = "3.10.10"

RPM_NAME = "python310-doc-3.10.10-2.1.aarch64.rpm"
RPM_HASH = "70e910614a10d9e1807d0c9fc54f3d8c6cd8a8c074a6be8ed0131129164e3fcbe9fb968b2338305bc35c0db60ae07ed1fe6d46e5defd43dbc3ec3eaa50a579f1"

RPROVIDES:${PN} += "python3-doc python310-doc python310-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
