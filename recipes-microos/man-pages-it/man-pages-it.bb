SUMMARY = "Translation of man pages in Italian"
DESCRIPTION = "This package provides translations of man pages in Italian."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.1"

RPM_NAME = "man-pages-it-4.18.1-1.1.noarch.rpm"
RPM_HASH = "75d9530fbcb3a7996ae64edf05bdfe8628a7928cd612390ee435cd7748ae1ddbd18499f7fefd05b57d928bfe7b9b2877bc03268a5d154447951f9e313769e93f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(man-pages:it) man-pages-it"
RDEPENDS:${PN} += "man-pages"

inherit rpm
