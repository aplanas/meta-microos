SUMMARY = "Translations for package libokteta"
DESCRIPTION = "Provides translations for the 'libokteta' package."
LICENSE = "GFDL-1.2-only & GPL-2.0-only"

PV = "0.26.10"

RPM_NAME = "libokteta-lang-0.26.10-1.3.noarch.rpm"
RPM_HASH = "7ce0459109fbbef74f3abe98aad411c00e5b672b27df6af22045bc28ecc5d744ec42893aeff70faf51615beab2bd7c9e967d0499ddb0b8b09e17ef4a796d8542"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libokteta-lang \
libokteta-lang-all \
locale(libokteta:ar) \
locale(libokteta:ast) \
locale(libokteta:bg) \
locale(libokteta:bs) \
locale(libokteta:ca) \
locale(libokteta:ca@valencia) \
locale(libokteta:cs) \
locale(libokteta:da) \
locale(libokteta:de) \
locale(libokteta:el) \
locale(libokteta:en_GB) \
locale(libokteta:eo) \
locale(libokteta:es) \
locale(libokteta:et) \
locale(libokteta:eu) \
locale(libokteta:fi) \
locale(libokteta:fr) \
locale(libokteta:ga) \
locale(libokteta:gl) \
locale(libokteta:hr) \
locale(libokteta:hu) \
locale(libokteta:ia) \
locale(libokteta:id) \
locale(libokteta:is) \
locale(libokteta:it) \
locale(libokteta:ja) \
locale(libokteta:ka) \
locale(libokteta:kk) \
locale(libokteta:ko) \
locale(libokteta:lt) \
locale(libokteta:lv) \
locale(libokteta:mr) \
locale(libokteta:nb) \
locale(libokteta:nds) \
locale(libokteta:nl) \
locale(libokteta:nn) \
locale(libokteta:pa) \
locale(libokteta:pl) \
locale(libokteta:pt) \
locale(libokteta:pt_BR) \
locale(libokteta:ro) \
locale(libokteta:ru) \
locale(libokteta:sk) \
locale(libokteta:sl) \
locale(libokteta:sq) \
locale(libokteta:sr) \
locale(libokteta:sr@ijekavian) \
locale(libokteta:sr@ijekavianlatin) \
locale(libokteta:sr@latin) \
locale(libokteta:sv) \
locale(libokteta:tr) \
locale(libokteta:ug) \
locale(libokteta:uk) \
locale(libokteta:zh_CN) \
locale(libokteta:zh_TW)"
RDEPENDS:${PN} += "libokteta"

inherit rpm
