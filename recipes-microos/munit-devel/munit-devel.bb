SUMMARY = "Headers for the munit testing framework for C"
DESCRIPTION = "Headers for µnit, a unit testing framework for C."
LICENSE = "MIT"

PV = "0.2.0+git38"

RPM_NAME = "munit-devel-0.2.0+git38-2.10.aarch64.rpm"
RPM_HASH = "8eac39ebd907204da6f97f7ed6ca956789b0c099250681f0b15b76f2605fe44b7414257d197da35ccab77bbe8bce76dee8607a96227a30905a99422eb954af9e"

RPROVIDES:${PN} += "munit-devel munit-devel(aarch-64) pkgconfig(munit)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libmunit0suse0"

inherit rpm
