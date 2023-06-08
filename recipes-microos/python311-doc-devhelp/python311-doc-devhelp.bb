SUMMARY = "Additional Package Documentation for Python 3 in devhelp format"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in format for devhelp."
LICENSE = "Python-2.0"

PV = "3.11.2"

RPM_NAME = "python311-doc-devhelp-3.11.2-1.3.aarch64.rpm"
RPM_HASH = "cfecf7b294652fcae381417abf21732d6cb98cfd7f3e91cc27c3feec7c7fbceea523cafb326b947c1d49807285c866d893b10416ad9865b1291f9ae89c66b1de"

RPROVIDES:${PN} += "python311-doc-devhelp python311-doc-devhelp(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
