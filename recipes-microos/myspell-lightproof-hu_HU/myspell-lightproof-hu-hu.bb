SUMMARY = "Lightproof for hu_HU"
DESCRIPTION = "Lightproof grammar checker information for hu_HU."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-lightproof-hu_HU-20221012-1.2.aarch64.rpm"
RPM_HASH = "a0c98312eb6819ea8d474b3098e4132f5ab54e3e59cdf1c183a57bd1d2867182a095b4bc9e9f6d9ab552d808af2637bd8a455674499505e4396f2e50ab9dc212"

RPROVIDES:${PN} += "myspell-lightproof-hu_HU myspell-lightproof-hu_HU(aarch-64)"
RDEPENDS:${PN} += "myspell-hu_HU"

inherit rpm
