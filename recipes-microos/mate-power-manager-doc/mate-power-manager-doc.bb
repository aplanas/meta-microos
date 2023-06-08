SUMMARY = "Documentation how to Use Atril"
DESCRIPTION = "This package contains the documentation for atril"
LICENSE = "GPL-2.0-only"

PV = "1.26.0"

RPM_NAME = "mate-power-manager-doc-1.26.0-1.10.noarch.rpm"
RPM_HASH = "a018c8fce2e165dc63b28f70efd7295f998a1dc16e9d5c28fd58aaf4dcdbebab80fbc63e2df86d628f8807ed6d0554fb560a224a45cd9867eb18cf8cec8d7d09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mate-power-manager-doc"
RDEPENDS:${PN} += ""

inherit rpm
