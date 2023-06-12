SUMMARY = "Translations for package wireplumber"
DESCRIPTION = "Provides translations for the 'wireplumber' package."
LICENSE = "MIT"

PV = "0.4.14"

RPM_NAME = "wireplumber-lang-0.4.14-2.1.noarch.rpm"
RPM_HASH = "205c787c45012a5ec14e51b37a84beeb482f970e2228683512456f6b52c71d5f438513847f3353dabb8c7c8ca532078306c2cfcae945bfe1fa19454d1263dbd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(wireplumber:af) \
locale(wireplumber:as) \
locale(wireplumber:be) \
locale(wireplumber:bg) \
locale(wireplumber:bn_IN) \
locale(wireplumber:ca) \
locale(wireplumber:cs) \
locale(wireplumber:da) \
locale(wireplumber:de) \
locale(wireplumber:de_CH) \
locale(wireplumber:el) \
locale(wireplumber:eo) \
locale(wireplumber:es) \
locale(wireplumber:fa) \
locale(wireplumber:fi) \
locale(wireplumber:fr) \
locale(wireplumber:gl) \
locale(wireplumber:gu) \
locale(wireplumber:he) \
locale(wireplumber:hi) \
locale(wireplumber:hr) \
locale(wireplumber:hu) \
locale(wireplumber:id) \
locale(wireplumber:it) \
locale(wireplumber:ja) \
locale(wireplumber:ka) \
locale(wireplumber:kk) \
locale(wireplumber:kn) \
locale(wireplumber:ko) \
locale(wireplumber:lt) \
locale(wireplumber:ml) \
locale(wireplumber:mr) \
locale(wireplumber:nl) \
locale(wireplumber:nn) \
locale(wireplumber:oc) \
locale(wireplumber:or) \
locale(wireplumber:pa) \
locale(wireplumber:pl) \
locale(wireplumber:pt) \
locale(wireplumber:pt_BR) \
locale(wireplumber:ro) \
locale(wireplumber:ru) \
locale(wireplumber:si) \
locale(wireplumber:sk) \
locale(wireplumber:sr) \
locale(wireplumber:sr@latin) \
locale(wireplumber:sv) \
locale(wireplumber:ta) \
locale(wireplumber:te) \
locale(wireplumber:tr) \
locale(wireplumber:uk) \
locale(wireplumber:zh_CN) \
locale(wireplumber:zh_TW) \
wireplumber-lang \
wireplumber-lang-all"
RDEPENDS:${PN} += "wireplumber"

inherit rpm
