SUMMARY = "Translations for package pix"
DESCRIPTION = "Provides translations for the 'pix' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.0"

RPM_NAME = "pix-lang-2.8.0-1.11.noarch.rpm"
RPM_HASH = "a08d9368bccd33a75b124c72bde7bb42f74a2a768c812d9b54d407f01b928d50773a2f06e18b355a5d5be55e46bf9d4bd4aeee2c68fa0ec2c6b9ba10192c881f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(pix:af) \
locale(pix:ar) \
locale(pix:az) \
locale(pix:be) \
locale(pix:bg) \
locale(pix:bn) \
locale(pix:ca) \
locale(pix:ca@valencia) \
locale(pix:cs) \
locale(pix:cy) \
locale(pix:da) \
locale(pix:de) \
locale(pix:dz) \
locale(pix:el) \
locale(pix:en_CA) \
locale(pix:en_GB) \
locale(pix:eo) \
locale(pix:es) \
locale(pix:et) \
locale(pix:eu) \
locale(pix:fa) \
locale(pix:fi) \
locale(pix:fr) \
locale(pix:fr_CA) \
locale(pix:ga) \
locale(pix:gl) \
locale(pix:gu) \
locale(pix:he) \
locale(pix:hi) \
locale(pix:hr) \
locale(pix:hu) \
locale(pix:ia) \
locale(pix:id) \
locale(pix:is) \
locale(pix:it) \
locale(pix:ja) \
locale(pix:kk) \
locale(pix:kn) \
locale(pix:ko) \
locale(pix:lt) \
locale(pix:lv) \
locale(pix:mk) \
locale(pix:ml) \
locale(pix:mr) \
locale(pix:ms) \
locale(pix:nb) \
locale(pix:nds) \
locale(pix:ne) \
locale(pix:nl) \
locale(pix:nn) \
locale(pix:oc) \
locale(pix:pa) \
locale(pix:pl) \
locale(pix:pt) \
locale(pix:pt_BR) \
locale(pix:ro) \
locale(pix:ru) \
locale(pix:sk) \
locale(pix:sl) \
locale(pix:sq) \
locale(pix:sr) \
locale(pix:sr@latin) \
locale(pix:sv) \
locale(pix:ta) \
locale(pix:th) \
locale(pix:tr) \
locale(pix:uk) \
locale(pix:vi) \
locale(pix:zh_CN) \
locale(pix:zh_HK) \
locale(pix:zh_TW) \
pix-lang \
pix-lang-all"
RDEPENDS:${PN} += "pix"

inherit rpm
