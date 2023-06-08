SUMMARY = "Additional Package Documentation for Python 3 in devhelp format"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in format for devhelp."
LICENSE = "Python-2.0"

PV = "3.8.16"

RPM_NAME = "python38-doc-devhelp-3.8.16-6.1.aarch64.rpm"
RPM_HASH = "93afec19450c780af8c887e69b2c46db1ad4227aa247bf0891d639b874fd8ddc6e5c9b3ebd913c28ca5e4fe13206422893b900776d39994cd433a5e30cc5dec3"

RPROVIDES:${PN} += "python38-doc-devhelp python38-doc-devhelp(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
