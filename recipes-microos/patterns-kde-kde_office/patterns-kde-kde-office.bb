SUMMARY = "KDE Office"
DESCRIPTION = "KDE Office"
LICENSE = "MIT"

PV = "20230403"

RPM_NAME = "patterns-kde-kde_office-20230403-1.1.noarch.rpm"
RPM_HASH = "4ceeb3b826bd3463b0443c380eed6c61f8be57477d516d56cfcc7ca9cbc2d854bb4d4eccf85ca09a01e40507cb7eaff2398ffbd589c4e8da18fb054860252150"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-extends() pattern-icon() pattern-order() patterns-kde-kde_office patterns-openSUSE-kde4_office patterns-openSUSE-kde_office"
RDEPENDS:${PN} += ""

inherit rpm
