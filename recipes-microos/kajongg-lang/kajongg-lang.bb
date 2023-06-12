SUMMARY = "Translations for package kajongg"
DESCRIPTION = "Provides translations for the 'kajongg' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kajongg-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "93308e2e01e8758363320b69aa4e89f05fd255b107a9138fa2d035fa60ddd3592fd3ce279b8c6a7b445c143b4b27026de07ea3160eef5c8bc311cef59c996300"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kajongg-lang \
kajongg-lang-all \
locale(kajongg:ar) \
locale(kajongg:bg) \
locale(kajongg:bs) \
locale(kajongg:ca) \
locale(kajongg:ca@valencia) \
locale(kajongg:cs) \
locale(kajongg:da) \
locale(kajongg:de) \
locale(kajongg:el) \
locale(kajongg:en_GB) \
locale(kajongg:eo) \
locale(kajongg:es) \
locale(kajongg:et) \
locale(kajongg:eu) \
locale(kajongg:fi) \
locale(kajongg:fr) \
locale(kajongg:ga) \
locale(kajongg:gl) \
locale(kajongg:hu) \
locale(kajongg:is) \
locale(kajongg:it) \
locale(kajongg:ja) \
locale(kajongg:ka) \
locale(kajongg:kk) \
locale(kajongg:km) \
locale(kajongg:lt) \
locale(kajongg:mai) \
locale(kajongg:ml) \
locale(kajongg:mr) \
locale(kajongg:nb) \
locale(kajongg:nds) \
locale(kajongg:nl) \
locale(kajongg:nn) \
locale(kajongg:pl) \
locale(kajongg:pt) \
locale(kajongg:pt_BR) \
locale(kajongg:ro) \
locale(kajongg:ru) \
locale(kajongg:sk) \
locale(kajongg:sl) \
locale(kajongg:sr) \
locale(kajongg:sr@ijekavian) \
locale(kajongg:sr@ijekavianlatin) \
locale(kajongg:sr@latin) \
locale(kajongg:sv) \
locale(kajongg:tr) \
locale(kajongg:ug) \
locale(kajongg:uk) \
locale(kajongg:zh_CN) \
locale(kajongg:zh_TW)"
RDEPENDS:${PN} += "kajongg"

inherit rpm
