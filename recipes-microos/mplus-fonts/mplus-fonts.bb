SUMMARY = "Font set incorporating all Kanji until level 2, and latin glyphs"
DESCRIPTION = "This is a metapackage containing the non-variable M PLUS 1/2 fonts."
LICENSE = "OFL-1.1"

PV = "20230116"

RPM_NAME = "mplus-fonts-20230116-1.1.noarch.rpm"
RPM_HASH = "7ea21130166e4e45ed8ce5a7a8cf62a8428e10ebaf306152868f2c78aefaff5e89f18bd71b8ca4f64ad800f195d1c83101d635a6de0355b6ee4662357f13363c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mplus-fonts"
RDEPENDS:${PN} += "mplus1-fonts mplus2-fonts"

inherit rpm
