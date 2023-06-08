SUMMARY = "Translations for package kcm_sddm"
DESCRIPTION = "Provides translations for the 'kcm_sddm' package."
LICENSE = "GPL-2.0-only"

PV = "5.27.4"

RPM_NAME = "kcm_sddm-lang-5.27.4-1.1.noarch.rpm"
RPM_HASH = "e476ca5e38151f696f77ea46e6eb6f0b5d01f850d0b827f3f221defd42bb8c9ae58f7f88e2388ec69bd4ccb3be2c233cb3b26582bb716a82c95dd888e18ffdcb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kcm_sddm-lang kcm_sddm-lang-all locale(kcm_sddm:ar) locale(kcm_sddm:az) locale(kcm_sddm:bg) locale(kcm_sddm:bs) locale(kcm_sddm:ca) locale(kcm_sddm:ca@valencia) locale(kcm_sddm:cs) locale(kcm_sddm:da) locale(kcm_sddm:de) locale(kcm_sddm:el) locale(kcm_sddm:en_GB) locale(kcm_sddm:es) locale(kcm_sddm:et) locale(kcm_sddm:eu) locale(kcm_sddm:fi) locale(kcm_sddm:fr) locale(kcm_sddm:gl) locale(kcm_sddm:he) locale(kcm_sddm:hi) locale(kcm_sddm:hu) locale(kcm_sddm:ia) locale(kcm_sddm:id) locale(kcm_sddm:it) locale(kcm_sddm:ja) locale(kcm_sddm:ka) locale(kcm_sddm:ko) locale(kcm_sddm:lt) locale(kcm_sddm:nb) locale(kcm_sddm:nl) locale(kcm_sddm:nn) locale(kcm_sddm:pa) locale(kcm_sddm:pl) locale(kcm_sddm:pt) locale(kcm_sddm:pt_BR) locale(kcm_sddm:ro) locale(kcm_sddm:ru) locale(kcm_sddm:sk) locale(kcm_sddm:sl) locale(kcm_sddm:sr) locale(kcm_sddm:sr@ijekavian) locale(kcm_sddm:sr@ijekavianlatin) locale(kcm_sddm:sr@latin) locale(kcm_sddm:sv) locale(kcm_sddm:tr) locale(kcm_sddm:uk) locale(kcm_sddm:zh_CN) locale(kcm_sddm:zh_TW)"
RDEPENDS:${PN} += "kcm_sddm"

inherit rpm
