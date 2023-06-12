SUMMARY = "Oxygen sounds"
DESCRIPTION = "This package contains the default sound set for a KDE Plasma workspace."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "oxygen5-sounds-5.27.5-1.1.noarch.rpm"
RPM_HASH = "37594ce3fbda90545da7444762367e21a86ae2d58441214b1e957f006be0ac0f79bd24101aa33fd6d17adff442563b3823bed3e706e310d0287686657ae34967"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "oxygen-sounds5 \
oxygen5-sounds"
RDEPENDS:${PN} += ""

inherit rpm
