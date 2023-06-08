SUMMARY = "Translation of man pages in Spanish"
DESCRIPTION = "This package provides translations of man pages in Spanish."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.1"

RPM_NAME = "man-pages-es-4.18.1-1.1.noarch.rpm"
RPM_HASH = "c9a27b148e22b974eb31f1517be4aaa4af98827d923278722632ca907c6bbcbbbb046b8408da7c46ab1981b3f2003c6082d7464199b711e5454218290e8e6fae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(man-pages:es) man-pages-es"
RDEPENDS:${PN} += "man-pages"

inherit rpm
