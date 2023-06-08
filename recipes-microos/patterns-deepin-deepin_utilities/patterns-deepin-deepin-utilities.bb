SUMMARY = "Deepin Utilities"
DESCRIPTION = "Deepin Utilities"
LICENSE = "MIT"

PV = "15.4.20220603"

RPM_NAME = "patterns-deepin-deepin_utilities-15.4.20220603-2.3.aarch64.rpm"
RPM_HASH = "c912ac8386d2cabe20bd1d7fe9d41456b4e0712c493e95dd733eec0206cd756f2e939702ca2782814fa220ae7c6efdbb1a8ce156f9e28257eac094f29379eb32"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-extends() pattern-icon() pattern-order() patterns-deepin-deepin_utilities patterns-deepin-deepin_utilities(aarch-64)"
RDEPENDS:${PN} += "pattern()"

inherit rpm
