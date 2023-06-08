SUMMARY = "Translation of man pages in Norwegian Bokmål"
DESCRIPTION = "This package provides translations of man pages in Norwegian Bokmål."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.1"

RPM_NAME = "man-pages-nb-4.18.1-1.1.noarch.rpm"
RPM_HASH = "34d1c8a5e475e1076701e29d0a161410646741d249e7c6f45b1629a6bf0773b1690f1ca7a0fe8f92629a6745368f43854d1498a2fe97483161e9b5f0a9d66194"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(man-pages:nb) man-pages-nb"
RDEPENDS:${PN} += "man-pages"

inherit rpm
