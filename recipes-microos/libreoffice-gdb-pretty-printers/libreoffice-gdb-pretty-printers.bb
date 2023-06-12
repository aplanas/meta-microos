SUMMARY = "Additional support for debugging with gdb"
DESCRIPTION = "This package provides gdb pretty printers for package libreoffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-gdb-pretty-printers-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "14b09f8de3fb6b185d2cb99d3026d826366ebb53ceb5d6a2dc594d3769a2b8d91f995e539501889bf55f1f49adf4f8ba33b8fe35a85e231c6274cbfd76b226de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-gdb-pretty-printers"
RDEPENDS:${PN} += "gdb libreoffice python3-six"

inherit rpm
