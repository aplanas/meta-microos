SUMMARY = "Python Bindings for YARA (from Virus Total)"
DESCRIPTION = "python bindings for libyara. \
YARA is a tool to identify and classify malware samples."
LICENSE = "Apache-2.0"

PV = "4.0.2"

RPM_NAME = "python39-yara-4.0.2-1.18.aarch64.rpm"
RPM_HASH = "91bebda4ec8c4cad1c47ccb9fb5d3e9d14042c3559ecd090da9cb6dafdec307379e87828409dcb1414610cc5dcbd6bc254538d4386027e527704dbc2d76581f2"

RPROVIDES:${PN} += "python3.9dist(yara-python) \
python39-yara \
python39-yara(aarch-64) \
python3dist(yara-python)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libyara.so.10()(64bit) \
python(abi)"

inherit rpm
