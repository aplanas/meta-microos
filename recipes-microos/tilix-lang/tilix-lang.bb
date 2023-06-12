SUMMARY = "Translations for package tilix"
DESCRIPTION = "Provides translations for the 'tilix' package."
LICENSE = "LGPL-3.0-only & MPL-2.0"

PV = "1.9.5"

RPM_NAME = "tilix-lang-1.9.5-3.1.noarch.rpm"
RPM_HASH = "3920027e438364861de936e20d7ce8769b0bdfbf75ee5f36386b2afd68a93a4672b254bd59156a118a0c3943f661b78c9cb92a72abf164954390d007adb184c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(tilix:ar) \
locale(tilix:bg) \
locale(tilix:ca) \
locale(tilix:cs) \
locale(tilix:de) \
locale(tilix:el) \
locale(tilix:en_GB) \
locale(tilix:eo) \
locale(tilix:es) \
locale(tilix:eu) \
locale(tilix:fi) \
locale(tilix:fr) \
locale(tilix:gl) \
locale(tilix:he) \
locale(tilix:hr) \
locale(tilix:hu) \
locale(tilix:id) \
locale(tilix:it) \
locale(tilix:ja) \
locale(tilix:ko) \
locale(tilix:lt) \
locale(tilix:mr) \
locale(tilix:nb_NO) \
locale(tilix:nl) \
locale(tilix:oc) \
locale(tilix:pl) \
locale(tilix:pt_BR) \
locale(tilix:pt_PT) \
locale(tilix:ro) \
locale(tilix:ru) \
locale(tilix:sr) \
locale(tilix:sv) \
locale(tilix:tr) \
locale(tilix:uk) \
locale(tilix:vi) \
locale(tilix:zh_CN) \
locale(tilix:zh_TW) \
tilix-lang \
tilix-lang-all"
RDEPENDS:${PN} += "tilix"

inherit rpm
