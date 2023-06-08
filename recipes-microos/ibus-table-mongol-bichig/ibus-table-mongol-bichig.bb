SUMMARY = "Mongol Bichig table for ibus-table"
DESCRIPTION = "ibus-table-mongol-bichig provides the Mongol Bichig table for ibus-table."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.13"

RPM_NAME = "ibus-table-mongol-bichig-1.3.13-2.3.noarch.rpm"
RPM_HASH = "bef18c7e7f127712e108699547b3715198498e893d769a24dc8ecaf690c42f0269124c245bf6f2bd1b860f6c5fa3402100805eb7f2cd694d889fe25f17cce503"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-mongol-bichig"
RDEPENDS:${PN} += "ibus-table"

inherit rpm
