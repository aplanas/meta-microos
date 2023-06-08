SUMMARY = "Documentation for the libodfgen API"
DESCRIPTION = "This package contains documentation for the libodfgen API."
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.1.8"

RPM_NAME = "libodfgen-devel-doc-0.1.8-3.8.noarch.rpm"
RPM_HASH = "57f917654881ec7188e818c4354f677f471c92cd2d2bfcee740d78d7cb0395a2a8a1d5e84ef7514fe4d40fc5b05aabf4550d4b156da4b21f857305c26e21c361"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libodfgen-devel-doc"
RDEPENDS:${PN} += ""

inherit rpm
