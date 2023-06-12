SUMMARY = "Translation of man pages in Serbian"
DESCRIPTION = "This package provides translations of man pages in Serbian."
LICENSE = "GPL-3.0-or-later"

PV = "4.19.0"

RPM_NAME = "man-pages-sr-4.19.0-1.1.noarch.rpm"
RPM_HASH = "d57f8c6c94b80ff433c8f499d073114a2d860b5230fb8d0023fe7a092404c3d4eb28200a4a448eb6f6423b54a555bdf08636448897021ae07c915b87b0c556c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(man-pages:sr) \
man-pages-sr"
RDEPENDS:${PN} += "man-pages"

inherit rpm
