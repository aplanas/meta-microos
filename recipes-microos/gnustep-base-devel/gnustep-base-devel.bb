SUMMARY = "Devel package for the GNUstep Base Library"
DESCRIPTION = "This package contains include files for developing applications \
using the GNUstep Base Library."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.29.0"

RPM_NAME = "gnustep-base-devel-1.29.0-1.5.aarch64.rpm"
RPM_HASH = "ae03258ef1b8d037bd2f17b43b440356ea379540fd72f4d6519b50c0f4e35e0badc3c1cab29d06dea02c8d07f1938fd80d834564071d3f85379c427797bdd777"

RPROVIDES:${PN} += "gnustep-base-devel \
gnustep-base-devel(aarch-64)"
RDEPENDS:${PN} += "gnustep-base \
libgnustep-base1_29"

inherit rpm
