SUMMARY = "Additional Package Documentation for Python 3 in devhelp format"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in format for devhelp."
LICENSE = "Python-2.0"

PV = "3.12.0a7"

RPM_NAME = "python312-doc-devhelp-3.12.0a7-1.1.aarch64.rpm"
RPM_HASH = "d9b36c04d2704021688d335e2c038539a1ef72beb4b80ba5595f3f9afe58d38a017b76412361553846e71ae9e57de653d7af0da6e0f52ecde93a17ab10c65c06"

RPROVIDES:${PN} += "python312-doc-devhelp python312-doc-devhelp(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
