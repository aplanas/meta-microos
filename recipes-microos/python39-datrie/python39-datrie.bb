SUMMARY = "Trie data structure for Python"
DESCRIPTION = "A trie data structure for Python (2.x and 3.x). Uses libdatrie."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.2"

RPM_NAME = "python39-datrie-0.8.2-3.11.aarch64.rpm"
RPM_HASH = "28397e6a7d12c0e60b3486bf1389259dba575145a52b5dd9b8e2a9bd0fde75f06acf077766cc41e4ace2b9f6d35e2851b7c3b3d6773ff4b9e3c2ef07f79b3dd2"

RPROVIDES:${PN} += "python3.9dist(datrie) python39-datrie python39-datrie(aarch-64) python3dist(datrie)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi)"

inherit rpm
