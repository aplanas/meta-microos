SUMMARY = "KDE Utilities"
DESCRIPTION = "KDE Applications - Utilities"
LICENSE = "MIT"

PV = "20230403"

RPM_NAME = "patterns-kde-kde_utilities-20230403-1.1.noarch.rpm"
RPM_HASH = "a9a0668f5fa7c8fb793566acd001dccb1960b2b51ed55d28d112c34e3a908771e8def4af998b52da342daedc57b8866c417891d9387fb4f6e9903ebe2f006a10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-extends() \
pattern-icon() \
pattern-order() \
patterns-kde-kde_utilities \
patterns-openSUSE-kde4_utilities \
patterns-openSUSE-kde_utilities"
RDEPENDS:${PN} += ""

inherit rpm
