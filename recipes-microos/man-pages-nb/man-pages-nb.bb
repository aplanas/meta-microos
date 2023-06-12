SUMMARY = "Translation of man pages in Norwegian Bokmål"
DESCRIPTION = "This package provides translations of man pages in Norwegian Bokmål."
LICENSE = "GPL-3.0-or-later"

PV = "4.19.0"

RPM_NAME = "man-pages-nb-4.19.0-1.1.noarch.rpm"
RPM_HASH = "fefb903c62c4fee9c4ca327394a130cefed67610f8219f0aed4bf0029e7da6e3e7cdea502c05f392fa30d0229d2abcec370b613bff76854f445abe3d05cb9b65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(man-pages:nb) man-pages-nb"
RDEPENDS:${PN} += "man-pages"

inherit rpm
