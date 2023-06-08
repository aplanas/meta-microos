SUMMARY = "Emoji dictionary for IBus"
DESCRIPTION = "This package contains data of emoji dictionary for IBus and other applications"
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.28"

RPM_NAME = "ibus-dict-emoji-1.5.28-2.1.noarch.rpm"
RPM_HASH = "1b28af54c4df92b8af82966223881a99d2d81ccc54a6f6bfef2a5a5aa3b2c4fea06903aec49d3f10483e3afe0bbf19e2a4e73e3d107ebe76e8c84da244779595"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-dict-emoji"
RDEPENDS:${PN} += ""

inherit rpm
