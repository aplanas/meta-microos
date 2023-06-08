SUMMARY = "Deepin Office"
DESCRIPTION = "Deepin Office"
LICENSE = "MIT"

PV = "15.4.20220603"

RPM_NAME = "patterns-deepin-deepin_office-15.4.20220603-2.3.aarch64.rpm"
RPM_HASH = "2b0b1bdc429c05d89686516d0011c5988ae494ed40c24bad1f805097bbfce4be7ae828e0db01ae157fcc6f863a6210be95e664108f301306fbe0ba02e9277c0f"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-extends() pattern-icon() pattern-order() patterns-deepin-deepin_office patterns-deepin-deepin_office(aarch-64)"
RDEPENDS:${PN} += "pattern()"

inherit rpm
