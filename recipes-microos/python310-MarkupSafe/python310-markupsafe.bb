SUMMARY = "Implements a XML/HTML/XHTML Markup safe string for Python"
DESCRIPTION = "Implements a unicode subclass that supports HTML strings. This can be used to \
safely encode strings for dynamically generated web pages."
LICENSE = "BSD-3-Clause"

PV = "2.1.2"

RPM_NAME = "python310-MarkupSafe-2.1.2-2.1.aarch64.rpm"
RPM_HASH = "9fdd0778cae7574bc3b53a4ad2e9f75a075a91f311ed72f838e7999bd3e5147e7120e3fab59b26c329809dc6f95a355f1ac08bb945a7140d040a5d9867af60dc"

RPROVIDES:${PN} += "python3-MarkupSafe python3.10dist(markupsafe) python310-MarkupSafe python310-MarkupSafe(aarch-64) python3dist(markupsafe)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) python(abi) python310-base"

inherit rpm
