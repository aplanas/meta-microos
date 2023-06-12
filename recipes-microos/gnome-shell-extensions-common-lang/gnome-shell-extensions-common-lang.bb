SUMMARY = "Translations for package gnome-shell-extensions-common"
DESCRIPTION = "Provides translations for the 'gnome-shell-extensions-common' package."
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-shell-extensions-common-lang-44.0-1.1.noarch.rpm"
RPM_HASH = "6662fb7da5bc3e84865c1c9cb239da9fe26ff44a782132d6b59e01b202371ac9cf797092d3d3da49ed2ceaf5a6c0fc2a029a81ad19505c3e2bf2473923217606"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-shell-extensions-common-lang \
gnome-shell-extensions-common-lang-all \
locale(gnome-shell-extensions-common:af) \
locale(gnome-shell-extensions-common:ar) \
locale(gnome-shell-extensions-common:as) \
locale(gnome-shell-extensions-common:be) \
locale(gnome-shell-extensions-common:bg) \
locale(gnome-shell-extensions-common:bn_IN) \
locale(gnome-shell-extensions-common:bs) \
locale(gnome-shell-extensions-common:ca) \
locale(gnome-shell-extensions-common:ca@valencia) \
locale(gnome-shell-extensions-common:cs) \
locale(gnome-shell-extensions-common:da) \
locale(gnome-shell-extensions-common:de) \
locale(gnome-shell-extensions-common:el) \
locale(gnome-shell-extensions-common:en_GB) \
locale(gnome-shell-extensions-common:eo) \
locale(gnome-shell-extensions-common:es) \
locale(gnome-shell-extensions-common:et) \
locale(gnome-shell-extensions-common:eu) \
locale(gnome-shell-extensions-common:fa) \
locale(gnome-shell-extensions-common:fi) \
locale(gnome-shell-extensions-common:fr) \
locale(gnome-shell-extensions-common:fur) \
locale(gnome-shell-extensions-common:gd) \
locale(gnome-shell-extensions-common:gl) \
locale(gnome-shell-extensions-common:gu) \
locale(gnome-shell-extensions-common:he) \
locale(gnome-shell-extensions-common:hi) \
locale(gnome-shell-extensions-common:hr) \
locale(gnome-shell-extensions-common:hu) \
locale(gnome-shell-extensions-common:id) \
locale(gnome-shell-extensions-common:is) \
locale(gnome-shell-extensions-common:it) \
locale(gnome-shell-extensions-common:ja) \
locale(gnome-shell-extensions-common:ka) \
locale(gnome-shell-extensions-common:kk) \
locale(gnome-shell-extensions-common:km) \
locale(gnome-shell-extensions-common:kn) \
locale(gnome-shell-extensions-common:ko) \
locale(gnome-shell-extensions-common:lt) \
locale(gnome-shell-extensions-common:lv) \
locale(gnome-shell-extensions-common:ml) \
locale(gnome-shell-extensions-common:mr) \
locale(gnome-shell-extensions-common:ms) \
locale(gnome-shell-extensions-common:nb) \
locale(gnome-shell-extensions-common:ne) \
locale(gnome-shell-extensions-common:nl) \
locale(gnome-shell-extensions-common:oc) \
locale(gnome-shell-extensions-common:or) \
locale(gnome-shell-extensions-common:pa) \
locale(gnome-shell-extensions-common:pl) \
locale(gnome-shell-extensions-common:pt) \
locale(gnome-shell-extensions-common:pt_BR) \
locale(gnome-shell-extensions-common:ro) \
locale(gnome-shell-extensions-common:ru) \
locale(gnome-shell-extensions-common:sk) \
locale(gnome-shell-extensions-common:sl) \
locale(gnome-shell-extensions-common:sr) \
locale(gnome-shell-extensions-common:sr@latin) \
locale(gnome-shell-extensions-common:sv) \
locale(gnome-shell-extensions-common:ta) \
locale(gnome-shell-extensions-common:te) \
locale(gnome-shell-extensions-common:th) \
locale(gnome-shell-extensions-common:tr) \
locale(gnome-shell-extensions-common:uk) \
locale(gnome-shell-extensions-common:vi) \
locale(gnome-shell-extensions-common:zh_CN) \
locale(gnome-shell-extensions-common:zh_HK) \
locale(gnome-shell-extensions-common:zh_TW)"
RDEPENDS:${PN} += "gnome-shell-extensions-common"

inherit rpm
