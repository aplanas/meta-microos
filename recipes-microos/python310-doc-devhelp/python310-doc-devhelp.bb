SUMMARY = "Additional Package Documentation for Python 3 in devhelp format"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in format for devhelp."
LICENSE = "Python-2.0"

PV = "3.10.10"

RPM_NAME = "python310-doc-devhelp-3.10.10-2.1.aarch64.rpm"
RPM_HASH = "0322e0edf92ff04f75d6b18289fb72fdfa1cb0fc8272bf29c8c7dd208143c7865294c405bf04ce78124f277705232587fe18cee3a707462de22bc4d064b9c0b8"

RPROVIDES:${PN} += "python3-doc-devhelp python310-doc-devhelp python310-doc-devhelp(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
