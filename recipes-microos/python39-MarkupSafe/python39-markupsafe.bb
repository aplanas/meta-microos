SUMMARY = "Implements a XML/HTML/XHTML Markup safe string for Python"
DESCRIPTION = "Implements a unicode subclass that supports HTML strings. This can be used to \
safely encode strings for dynamically generated web pages."
LICENSE = "BSD-3-Clause"

PV = "2.1.2"

RPM_NAME = "python39-MarkupSafe-2.1.2-2.1.aarch64.rpm"
RPM_HASH = "b618e35be95ba81cac88cd1c787e205f6e98c25bbfd6d58b1d7085926139617c0e0cc13617f51ab9b282344166130b9b98d2de8780ce9ade7ed5089a1fce8f3c"

RPROVIDES:${PN} += "python3.9dist(markupsafe) python39-MarkupSafe python39-MarkupSafe(aarch-64) python3dist(markupsafe)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) python(abi) python39-base"

inherit rpm
