SUMMARY = "Translations for package shared-mime-info"
DESCRIPTION = "Provides translations for the 'shared-mime-info' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.2"

RPM_NAME = "shared-mime-info-lang-2.2-2.1.noarch.rpm"
RPM_HASH = "5d1551d0172a9a57face76e407d03123b11d4af97a590990462305fd262b264dcddd30f7e95ce354f294f6e80ce337547ec1b3d4b30fdc9cbef6df6f36ee3578"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(shared-mime-info:af) locale(shared-mime-info:ar) locale(shared-mime-info:as) locale(shared-mime-info:ast) locale(shared-mime-info:az) locale(shared-mime-info:be) locale(shared-mime-info:be@latin) locale(shared-mime-info:bg) locale(shared-mime-info:bn_IN) locale(shared-mime-info:ca) locale(shared-mime-info:ca@valencia) locale(shared-mime-info:cs) locale(shared-mime-info:cy) locale(shared-mime-info:da) locale(shared-mime-info:de) locale(shared-mime-info:el) locale(shared-mime-info:en_GB) locale(shared-mime-info:eo) locale(shared-mime-info:es) locale(shared-mime-info:et) locale(shared-mime-info:eu) locale(shared-mime-info:fa) locale(shared-mime-info:fi) locale(shared-mime-info:fr) locale(shared-mime-info:fur) locale(shared-mime-info:ga) locale(shared-mime-info:gl) locale(shared-mime-info:gu) locale(shared-mime-info:he) locale(shared-mime-info:hi) locale(shared-mime-info:hr) locale(shared-mime-info:hu) locale(shared-mime-info:ia) locale(shared-mime-info:id) locale(shared-mime-info:it) locale(shared-mime-info:ja) locale(shared-mime-info:ka) locale(shared-mime-info:kk) locale(shared-mime-info:kn) locale(shared-mime-info:ko) locale(shared-mime-info:lt) locale(shared-mime-info:lv) locale(shared-mime-info:ml) locale(shared-mime-info:mr) locale(shared-mime-info:ms) locale(shared-mime-info:nb) locale(shared-mime-info:nl) locale(shared-mime-info:nn) locale(shared-mime-info:oc) locale(shared-mime-info:or) locale(shared-mime-info:pa) locale(shared-mime-info:pl) locale(shared-mime-info:pt) locale(shared-mime-info:pt_BR) locale(shared-mime-info:ro) locale(shared-mime-info:ru) locale(shared-mime-info:sk) locale(shared-mime-info:sl) locale(shared-mime-info:sq) locale(shared-mime-info:sr) locale(shared-mime-info:sr@latin) locale(shared-mime-info:sv) locale(shared-mime-info:ta) locale(shared-mime-info:te) locale(shared-mime-info:th) locale(shared-mime-info:tr) locale(shared-mime-info:uk) locale(shared-mime-info:vi) locale(shared-mime-info:wa) locale(shared-mime-info:zh_CN) locale(shared-mime-info:zh_HK) locale(shared-mime-info:zh_TW) shared-mime-info-lang shared-mime-info-lang-all"
RDEPENDS:${PN} += "shared-mime-info"

inherit rpm
