SUMMARY = "EPPIC include files and libraries"
DESCRIPTION = "EPPIC is a C interpreter that permits easy access to the symbol and type \
information stored in a executable image like a coredump or live memory \
interfaces (e.g. /dev/kmem, /dev/mem). Although it has a strong association \
with live or postmortem kernel analysis, it is not constraint to it and can be \
embedded in any tools that is C friendly. \
 \
This package provides the include files and libraries needed for development."
LICENSE = "GPL-2.0-or-later"

PV = "4.99.git.1682279748.c294e5b"

RPM_NAME = "libeppic-devel-4.99.git.1682279748.c294e5b-1.1.aarch64.rpm"
RPM_HASH = "9f81c7ac68e34682db3b5ed5c1c2fcff0f31bacee5e57c5a6e1902f2d0f545f802e5ebaf123861bb05cc38d226fbf74a8085cbc2cb621e848078f3a4cf23f11c"

RPROVIDES:${PN} += "libeppic-devel libeppic-devel(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
