SUMMARY = "Simple and flexible tool for managing secrets"
DESCRIPTION = "Simple and flexible tool for managing secrets"
LICENSE = "MPL-2.0"

PV = "3.7.3"

RPM_NAME = "sops-3.7.3-1.5.aarch64.rpm"
RPM_HASH = "81d4a78c823a090da5c0cfdb32e49049c652b8d6152f7c8441789a2e9e17d1f3c7c57d91a70dc0207a32ae15725bc323114f98df7df7c601a9c106c74d9e7d04"

RPROVIDES:${PN} += "sops sops(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
