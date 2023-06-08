SUMMARY = "Translations for package kmahjongg"
DESCRIPTION = "Provides translations for the 'kmahjongg' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kmahjongg-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "6df35c74d57128686965e706c0c02ba9f8333a59fdc03537bcbedba9672d580e66a21c618b69c2337d90b4edcb11d62e30332bc897aa2ab54f3db6149d39d974"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kmahjongg-lang kmahjongg-lang-all locale(kmahjongg:af) locale(kmahjongg:ar) locale(kmahjongg:be) locale(kmahjongg:bg) locale(kmahjongg:bn) locale(kmahjongg:br) locale(kmahjongg:bs) locale(kmahjongg:ca) locale(kmahjongg:ca@valencia) locale(kmahjongg:cs) locale(kmahjongg:cy) locale(kmahjongg:da) locale(kmahjongg:de) locale(kmahjongg:el) locale(kmahjongg:en_GB) locale(kmahjongg:eo) locale(kmahjongg:es) locale(kmahjongg:et) locale(kmahjongg:eu) locale(kmahjongg:fa) locale(kmahjongg:fi) locale(kmahjongg:fr) locale(kmahjongg:ga) locale(kmahjongg:gl) locale(kmahjongg:he) locale(kmahjongg:hi) locale(kmahjongg:hr) locale(kmahjongg:hu) locale(kmahjongg:id) locale(kmahjongg:is) locale(kmahjongg:it) locale(kmahjongg:ja) locale(kmahjongg:ka) locale(kmahjongg:kk) locale(kmahjongg:km) locale(kmahjongg:ko) locale(kmahjongg:lt) locale(kmahjongg:lv) locale(kmahjongg:mai) locale(kmahjongg:mk) locale(kmahjongg:ml) locale(kmahjongg:mr) locale(kmahjongg:nb) locale(kmahjongg:nds) locale(kmahjongg:ne) locale(kmahjongg:nl) locale(kmahjongg:nn) locale(kmahjongg:oc) locale(kmahjongg:pa) locale(kmahjongg:pl) locale(kmahjongg:pt) locale(kmahjongg:pt_BR) locale(kmahjongg:ro) locale(kmahjongg:ru) locale(kmahjongg:sk) locale(kmahjongg:sl) locale(kmahjongg:sq) locale(kmahjongg:sr) locale(kmahjongg:sr@ijekavian) locale(kmahjongg:sr@ijekavianlatin) locale(kmahjongg:sr@latin) locale(kmahjongg:sv) locale(kmahjongg:ta) locale(kmahjongg:th) locale(kmahjongg:tr) locale(kmahjongg:ug) locale(kmahjongg:uk) locale(kmahjongg:wa) locale(kmahjongg:zh_CN) locale(kmahjongg:zh_TW)"
RDEPENDS:${PN} += "kmahjongg"

inherit rpm
