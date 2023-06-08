SUMMARY = "Trie data structure for Python"
DESCRIPTION = "A trie data structure for Python (2.x and 3.x). Uses libdatrie."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.2"

RPM_NAME = "python311-datrie-0.8.2-3.11.aarch64.rpm"
RPM_HASH = "5c1572c6cb7aa47c37264b08c7322abb64ea751fb69932e1b52a4bce02be9be6a40fc9529288e732bb244b4d45add5bb0c29380578057ec08ebd18659dcc383b"

RPROVIDES:${PN} += "python3.11dist(datrie) python311-datrie python311-datrie(aarch-64) python3dist(datrie)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi)"

inherit rpm
