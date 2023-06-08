SUMMARY = "Translations for package libkmahjongg"
DESCRIPTION = "Provides translations for the 'libkmahjongg' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "libkmahjongg-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "bcf1f7890818bb962d06fd2393effcc5fd8826ee549dd52b206bd86f7e98afbdbdc07bc4cfa549cd568107eefcb717b94d0137508863c6b911b6dab5895e8180"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libkmahjongg-lang libkmahjongg-lang-all locale(libkmahjongg:ar) locale(libkmahjongg:be) locale(libkmahjongg:bg) locale(libkmahjongg:bs) locale(libkmahjongg:ca) locale(libkmahjongg:ca@valencia) locale(libkmahjongg:cs) locale(libkmahjongg:da) locale(libkmahjongg:de) locale(libkmahjongg:el) locale(libkmahjongg:en_GB) locale(libkmahjongg:eo) locale(libkmahjongg:es) locale(libkmahjongg:et) locale(libkmahjongg:eu) locale(libkmahjongg:fi) locale(libkmahjongg:fr) locale(libkmahjongg:ga) locale(libkmahjongg:gl) locale(libkmahjongg:gu) locale(libkmahjongg:hi) locale(libkmahjongg:hr) locale(libkmahjongg:hu) locale(libkmahjongg:id) locale(libkmahjongg:is) locale(libkmahjongg:it) locale(libkmahjongg:ja) locale(libkmahjongg:ka) locale(libkmahjongg:kk) locale(libkmahjongg:km) locale(libkmahjongg:ko) locale(libkmahjongg:lt) locale(libkmahjongg:lv) locale(libkmahjongg:mai) locale(libkmahjongg:ml) locale(libkmahjongg:mr) locale(libkmahjongg:nb) locale(libkmahjongg:nds) locale(libkmahjongg:nl) locale(libkmahjongg:nn) locale(libkmahjongg:oc) locale(libkmahjongg:pl) locale(libkmahjongg:pt) locale(libkmahjongg:pt_BR) locale(libkmahjongg:ro) locale(libkmahjongg:ru) locale(libkmahjongg:sk) locale(libkmahjongg:sl) locale(libkmahjongg:sq) locale(libkmahjongg:sr) locale(libkmahjongg:sr@ijekavian) locale(libkmahjongg:sr@ijekavianlatin) locale(libkmahjongg:sr@latin) locale(libkmahjongg:sv) locale(libkmahjongg:th) locale(libkmahjongg:tr) locale(libkmahjongg:ug) locale(libkmahjongg:uk) locale(libkmahjongg:wa) locale(libkmahjongg:zh_CN) locale(libkmahjongg:zh_TW)"
RDEPENDS:${PN} += "libkmahjongg"

inherit rpm
