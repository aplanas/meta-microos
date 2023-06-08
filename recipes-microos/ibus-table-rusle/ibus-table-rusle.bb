SUMMARY = "Rusle table for ibus-table"
DESCRIPTION = "ibus-table-rusle provides the Rusle table for ibus-table."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.13"

RPM_NAME = "ibus-table-rusle-1.3.13-2.3.noarch.rpm"
RPM_HASH = "f1623124d68127de0b3c86d569e80831a87d6c43885188c93f7379f5c2a29934f0be4ab534db41d61a0f08920adcb807898009c25dad95d3616cb9de8c4af289"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-rusle"
RDEPENDS:${PN} += "ibus-table"

inherit rpm
