SUMMARY = "Package Documentation for Python 3"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in HTML format."
LICENSE = "Python-2.0"

PV = "3.8.16"

RPM_NAME = "python38-doc-3.8.16-6.1.aarch64.rpm"
RPM_HASH = "aa138c10a23a8801dc4a7a3e7e7a864150761364ae7ac1843f46a747928ce82d6c3dcbbc0f90ba96bcd3c090ad272c2deef823b64183ff5c37a74dfed2d37954"

RPROVIDES:${PN} += "python38-doc python38-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
