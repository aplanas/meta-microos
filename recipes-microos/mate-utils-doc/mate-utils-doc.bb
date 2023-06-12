SUMMARY = "Documentation how to mate-utils"
DESCRIPTION = "This package contains the documentation for mate-utils"
LICENSE = "GFDL-1.1-only & GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "mate-utils-doc-1.26.1-1.1.noarch.rpm"
RPM_HASH = "c2765ee1d3042ac30c795003551b21f9c0a04da78116aba2ddfbdf070609237312d11e5ef4f772079c1925d8bd69cd3c4db5b1eefc9896c7ed66ee14d0971417"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mate-utils-doc"
RDEPENDS:${PN} += ""

inherit rpm
