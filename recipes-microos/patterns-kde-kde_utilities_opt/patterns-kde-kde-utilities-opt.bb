SUMMARY = "KDE Utilities"
DESCRIPTION = "KDE Application - Additional Utilities"
LICENSE = "MIT"

PV = "20230403"

RPM_NAME = "patterns-kde-kde_utilities_opt-20230403-1.1.noarch.rpm"
RPM_HASH = "1011c0df99b2a3b8b59d3d92176be577f55a66c643b3271f660ad0b21ccc1f8754aa00841eec1c55e42cebd6522852e909a114f97e0dceb629aa6657b048c604"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-extends() pattern-icon() pattern-order() patterns-kde-kde_utilities_opt patterns-openSUSE-kde4_utilities_opt patterns-openSUSE-kde_utilities_opt"
RDEPENDS:${PN} += ""

inherit rpm
