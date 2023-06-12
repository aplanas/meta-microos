SUMMARY = "Additional Package Documentation for Python 3 in devhelp format"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in format for devhelp."
LICENSE = "Python-2.0"

PV = "3.9.16"

RPM_NAME = "python39-doc-devhelp-3.9.16-8.1.aarch64.rpm"
RPM_HASH = "d810b6640085c1535247ad880f53d3f4c9bd4ee38e43a07887b7d4eaad5c1758feeb74692604cfe679dbf1701b51fdf98c2232a5195a854528a54fb0275e2354"

RPROVIDES:${PN} += "python39-doc-devhelp python39-doc-devhelp(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
