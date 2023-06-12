SUMMARY = "Documentation for PL/R - R Procedural Language for PostgreSQL"
DESCRIPTION = "PL/R is a loadable procedural language that enables you to write PostgreSQL \
functions and triggers in the R programming language. PL/R offers most (if \
not all) of the capabilities a function writer has in the R language. \
 \
This package contain the associated documentation"
LICENSE = "GPL-2.0-or-later"

PV = "8.4.5"

RPM_NAME = "postgresql13-plr-doc-8.4.5-1.1.aarch64.rpm"
RPM_HASH = "ae9d78574e93ed6e912bef6695f765b49e0c46a7dc486ef068cba1036ac037e2cf72bcc2298d9b7973550f17cad10875568a8f80f1377c5ce1df944f28ec9d42"

RPROVIDES:${PN} += "postgresql13-plr-doc \
postgresql13-plr-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
