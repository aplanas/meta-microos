SUMMARY = "Python SHA3 wrapper library"
DESCRIPTION = "This is a python wrapper library for SHA-3 (keccak)."
LICENSE = "Python-2.0"

PV = "1.0.2"

RPM_NAME = "python310-pysha3-1.0.2-3.3.aarch64.rpm"
RPM_HASH = "cb1a70bf1684234a4a194235cf242c9a4e872c4aad67f000ba20d2dc0cdbd90974a289a64d5741d369b5cc632826f0fc7474ca152e2f2bd65af22c31fb2e3f8b"

RPROVIDES:${PN} += "python3-pysha3 python3.10dist(pysha3) python310-pysha3 python310-pysha3(aarch-64) python3dist(pysha3)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi)"

inherit rpm
