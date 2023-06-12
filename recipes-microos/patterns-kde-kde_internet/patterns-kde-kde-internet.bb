SUMMARY = "KDE Internet"
DESCRIPTION = "KDE Internet Applications"
LICENSE = "MIT"

PV = "20230403"

RPM_NAME = "patterns-kde-kde_internet-20230403-1.1.noarch.rpm"
RPM_HASH = "260187496d530be6762a10f4bad093085c3c232ed6536540dc3ec1de78fadbb28a6907355f5a8ba489d1351217a614361a32bdd79072f117e7dc264dd6caeff6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-extends() \
pattern-icon() \
pattern-order() \
patterns-kde-kde_internet \
patterns-openSUSE-kde4_internet \
patterns-openSUSE-kde_internet"
RDEPENDS:${PN} += ""

inherit rpm
