SUMMARY = "Library for Handling Page Faults in User Mode"
DESCRIPTION = "This is a library for handling page faults in user mode. A page fault occurs \
when a program tries to access to a region of memory that is currently not \
available."
LICENSE = "GPL-2.0-or-later"

PV = "2.14"

RPM_NAME = "libsigsegv-doc-2.14-2.9.aarch64.rpm"
RPM_HASH = "46f1452842ff3a17caccad357e7d68043e6f30c58622bed553f658c88b1733af5d74f60d08fb0485daccf0baab722dc6397ed6f664f2a0686b4d09114542df30"

RPROVIDES:${PN} += "libsigsegv-doc \
libsigsegv-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
