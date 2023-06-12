SUMMARY = "Translation of man pages in Ukrainian"
DESCRIPTION = "This package provides translations of man pages in Ukrainian."
LICENSE = "GPL-3.0-or-later"

PV = "4.19.0"

RPM_NAME = "man-pages-uk-4.19.0-1.1.noarch.rpm"
RPM_HASH = "39230b129d1d74d92a394dcf995e4e721850893d3ab3a5ed498fdb8b5ffadf69ed161f6a493f7d81227c4e9260bd9d31a6273ef8f37a9a7b398a076c0226aa62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(man-pages:uk) man-pages-uk"
RDEPENDS:${PN} += "man-pages"

inherit rpm
