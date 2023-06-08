SUMMARY = "The Viqr (Vietnamese) table for ibus-table"
DESCRIPTION = "ibus-table-viqr provides the Viqr (Vietnamese) table for ibus-table. Tiếng Việt \
/ Vietnamese"
LICENSE = "GPL-3.0-or-later"

PV = "1.3.13"

RPM_NAME = "ibus-table-viqr-1.3.13-2.3.noarch.rpm"
RPM_HASH = "7ba0c4b5eb468094331d1cbbfe32b12917ead8afbaa9a2946e037cbc37f6b6b877c40c5156b9f252e9609d3c6460e0863b389305180611cc4ebffb25796a5735"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-viqr locale(ibus:vi)"
RDEPENDS:${PN} += "ibus-table"

inherit rpm
