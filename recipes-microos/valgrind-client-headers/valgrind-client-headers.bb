SUMMARY = "Header files for for Valgrind"
DESCRIPTION = "This package contains the BSD-style licensed Valgrind header \
files for inclusion into regular programs. The program can \
detect if it is running under Valgrind and interact with the \
Valgrind core and plugins."
LICENSE = "GFDL-1.2-only & GPL-2.0-or-later"

PV = "3.20.0"

RPM_NAME = "valgrind-client-headers-3.20.0-3.1.noarch.rpm"
RPM_HASH = "7820cbbaca756b07136ff326279da1ce53be026cddd7a12f2532a191e21591df28fd4c884c58e4b3301333426ea9fb7b056dadc153a47d5dacfdf400d7d94601"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "valgrind-client-headers valgrind-devel:/usr/include/valgrind/valgrind.h"
RDEPENDS:${PN} += ""

inherit rpm
