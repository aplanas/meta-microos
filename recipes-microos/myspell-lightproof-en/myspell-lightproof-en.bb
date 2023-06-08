SUMMARY = "Lightproof for en"
DESCRIPTION = "Lightproof grammar checker information for en."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-lightproof-en-20221012-1.2.aarch64.rpm"
RPM_HASH = "cdf67e681faa79ad6537cc9dc65a770a04091ca9cfe2d88bbf1e66bbbffd45b84cb9fc796b0735fd8665a2fc204375f5302d24dec25056eadcc46f75c5880e18"

RPROVIDES:${PN} += "myspell-lightproof-en myspell-lightproof-en(aarch-64)"
RDEPENDS:${PN} += "myspell-en"

inherit rpm
