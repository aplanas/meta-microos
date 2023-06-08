SUMMARY = "Devel package for the GNUstep Base Library"
DESCRIPTION = "This package contains include files for developing applications \
using the GNUstep Base Library."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.29.0"

RPM_NAME = "gnustep-base-devel-1.29.0-1.4.aarch64.rpm"
RPM_HASH = "c3eefaddd1910655e018a6c27b2d3099f3e264119bf7ab88d3ac25373b27b7e272d4e67624f8a2187bc1bf2f94daef2a412e3070761d7a2e2ce4f29ce2ac150d"

RPROVIDES:${PN} += "gnustep-base-devel gnustep-base-devel(aarch-64)"
RDEPENDS:${PN} += "gnustep-base libgnustep-base1_29"

inherit rpm
