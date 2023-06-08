SUMMARY = "Additional Package Documentation for Python 3 in devhelp format"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in format for devhelp."
LICENSE = "Python-2.0"

PV = "3.9.16"

RPM_NAME = "python39-doc-devhelp-3.9.16-6.1.aarch64.rpm"
RPM_HASH = "81c6f394188183977880cc2c95adc18af70d1e62beaf39bcbb4f3f3567b944275c6c0a9b5553ed59680c5ce71f8fbf5ce197b1035a8f0963ef4cf714689e9d19"

RPROVIDES:${PN} += "python39-doc-devhelp python39-doc-devhelp(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
