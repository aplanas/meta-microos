SUMMARY = "Translations for package wireplumber"
DESCRIPTION = "Provides translations for the 'wireplumber' package."
LICENSE = "MIT"

PV = "0.4.14"

RPM_NAME = "wireplumber-lang-0.4.14-1.1.noarch.rpm"
RPM_HASH = "099128ccb24dd7fb84675cf013655a4e05bdeaae908eaf61f2aace064a960c7fa57472a5d66f13b52fc220ef778c2df229741d67ab3aa0b76dce8849e67412a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(wireplumber:af) locale(wireplumber:as) locale(wireplumber:be) locale(wireplumber:bg) locale(wireplumber:bn_IN) locale(wireplumber:ca) locale(wireplumber:cs) locale(wireplumber:da) locale(wireplumber:de) locale(wireplumber:de_CH) locale(wireplumber:el) locale(wireplumber:eo) locale(wireplumber:es) locale(wireplumber:fa) locale(wireplumber:fi) locale(wireplumber:fr) locale(wireplumber:gl) locale(wireplumber:gu) locale(wireplumber:he) locale(wireplumber:hi) locale(wireplumber:hr) locale(wireplumber:hu) locale(wireplumber:id) locale(wireplumber:it) locale(wireplumber:ja) locale(wireplumber:ka) locale(wireplumber:kk) locale(wireplumber:kn) locale(wireplumber:ko) locale(wireplumber:lt) locale(wireplumber:ml) locale(wireplumber:mr) locale(wireplumber:nl) locale(wireplumber:nn) locale(wireplumber:oc) locale(wireplumber:or) locale(wireplumber:pa) locale(wireplumber:pl) locale(wireplumber:pt) locale(wireplumber:pt_BR) locale(wireplumber:ro) locale(wireplumber:ru) locale(wireplumber:si) locale(wireplumber:sk) locale(wireplumber:sr) locale(wireplumber:sr@latin) locale(wireplumber:sv) locale(wireplumber:ta) locale(wireplumber:te) locale(wireplumber:tr) locale(wireplumber:uk) locale(wireplumber:zh_CN) locale(wireplumber:zh_TW) wireplumber-lang wireplumber-lang-all"
RDEPENDS:${PN} += "wireplumber"

inherit rpm
