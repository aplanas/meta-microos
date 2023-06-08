SUMMARY = "Developer documentation for libdex"
DESCRIPTION = "This package contains developer documentation for writing \
applications with libdex."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.0"

RPM_NAME = "libdex-devel-docs-0.2.0-1.1.noarch.rpm"
RPM_HASH = "cb60015a64a1a5e0c27eae67c1255916c15c7dacc5bacfca270bc359912410bd2f392d278d492357eaade8e0c6dfcdc4e54c031c5899582210249fd096068eb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libdex-devel-docs"
RDEPENDS:${PN} += ""

inherit rpm
