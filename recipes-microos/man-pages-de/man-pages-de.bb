SUMMARY = "Translation of man pages in German"
DESCRIPTION = "This package provides translations of man pages in German."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.1"

RPM_NAME = "man-pages-de-4.18.1-1.1.noarch.rpm"
RPM_HASH = "6863a4f78d9946d6e26c1c285f16fae80ff51995feefd52c2e89af8f7607ea54abaa5aafc721cda2e68a99797183fc8136610215ba49210f45b4ad6b671bf0dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(man-pages:de) man-pages-de"
RDEPENDS:${PN} += "man-pages"

inherit rpm
