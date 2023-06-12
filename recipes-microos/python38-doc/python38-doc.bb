SUMMARY = "Package Documentation for Python 3"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in HTML format."
LICENSE = "Python-2.0"

PV = "3.8.16"

RPM_NAME = "python38-doc-3.8.16-7.1.aarch64.rpm"
RPM_HASH = "3c967680c09014da10015f41ac8a08c28d5ae0f43232513a4de99c80893a08a55538f54ce17b5b79c5d6ead2b616ecabda35fb60257d4dd53f2d2436d29a6295"

RPROVIDES:${PN} += "python38-doc \
python38-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
