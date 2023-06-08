SUMMARY = "KDE Education"
DESCRIPTION = "KDE Applications - Tools to teach kids with computers"
LICENSE = "MIT"

PV = "20230403"

RPM_NAME = "patterns-kde-kde_edutainment-20230403-1.1.noarch.rpm"
RPM_HASH = "dfeddb6b02dac67a856f51642d8c7ad9c496fbbf1e46592b7844f48f367cac17fe4fde967320e296cf7b069e17f449b49dd552c60aea38a3d99dfcc08864beb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() patterns-kde-kde_edutainment patterns-openSUSE-kde4_edutainment patterns-openSUSE-kde_edutainment"
RDEPENDS:${PN} += ""

inherit rpm
