SUMMARY = "Documentation for the libmspub API"
DESCRIPTION = "This package contains documentation for the libmspub API."
LICENSE = "MPL-2.0"

PV = "0.1.4"

RPM_NAME = "libmspub-devel-doc-0.1.4-2.23.noarch.rpm"
RPM_HASH = "1581aaf3458696c8722015c942d0c51b07aabdad4d4ee8588c6c0dd80babe611c43419f64e93a4143a38a61b8d37972c04c6c743f1ddf467be87b20482cf695c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libmspub-devel-doc"
RDEPENDS:${PN} += ""

inherit rpm
