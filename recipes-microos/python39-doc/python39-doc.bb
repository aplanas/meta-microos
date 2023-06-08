SUMMARY = "Package Documentation for Python 3"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in HTML format."
LICENSE = "Python-2.0"

PV = "3.9.16"

RPM_NAME = "python39-doc-3.9.16-6.1.aarch64.rpm"
RPM_HASH = "7123a2aae486c167d15e020a291d03f37cbf85e5c988f7842ebde03d5f3f3c3ed935f004b564de9a8a085101172af9be8c32d13f46aeef223e14fbb47d2c51f2"

RPROVIDES:${PN} += "python39-doc python39-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
