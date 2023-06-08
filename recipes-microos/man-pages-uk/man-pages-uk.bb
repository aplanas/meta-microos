SUMMARY = "Translation of man pages in Ukrainian"
DESCRIPTION = "This package provides translations of man pages in Ukrainian."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.1"

RPM_NAME = "man-pages-uk-4.18.1-1.1.noarch.rpm"
RPM_HASH = "f410bd70cacd2c311be8b0e08989528a9175b68d97e1de1ced6f2a245c09a2b97d9079257117843bd4bbf576d62be549891fb3d18ed75a3fd222d48b2bb67101"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(man-pages:uk) man-pages-uk"
RDEPENDS:${PN} += "man-pages"

inherit rpm
