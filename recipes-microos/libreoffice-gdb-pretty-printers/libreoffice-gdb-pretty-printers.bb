SUMMARY = "Additional support for debugging with gdb"
DESCRIPTION = "This package provides gdb pretty printers for package libreoffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-gdb-pretty-printers-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "13daeb6ae98ab2b53cd88e18d8c08dbd5d2dda15400ccb85301155407fea7a0ac87deaa7e4f73c68dcc5244507cac8cf3be751737ff23900ed7bbabc23b0bda3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-gdb-pretty-printers"
RDEPENDS:${PN} += "gdb libreoffice python3-six"

inherit rpm
