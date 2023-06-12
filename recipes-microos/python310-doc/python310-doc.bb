SUMMARY = "Package Documentation for Python 3"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in HTML format."
LICENSE = "Python-2.0"

PV = "3.10.11"

RPM_NAME = "python310-doc-3.10.11-1.1.aarch64.rpm"
RPM_HASH = "79917c23e2a678bfb36686afe6f8a87971b23ea208460f7b59b8638bea61c08af0811b1d0a357a12d6248badf7577723cd67b1efad54d3e9efe96fbd2b07679f"

RPROVIDES:${PN} += "python3-doc \
python310-doc \
python310-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
