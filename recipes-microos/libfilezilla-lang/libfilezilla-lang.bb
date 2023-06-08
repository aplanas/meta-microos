SUMMARY = "Translations for package libfilezilla"
DESCRIPTION = "Provides translations for the 'libfilezilla' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.41.1"

RPM_NAME = "libfilezilla-lang-0.41.1-1.3.noarch.rpm"
RPM_HASH = "8261d4db853705d80c585e3cd652d0d22ea941379bb20e965600311888e8845640255816b7ec9eb57d26b64300436379bef48aa9dcffd16b1e719bfc48190bff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libfilezilla-lang libfilezilla-lang-all locale(libfilezilla:ar) locale(libfilezilla:az) locale(libfilezilla:ca) locale(libfilezilla:cs_CZ) locale(libfilezilla:cy) locale(libfilezilla:da) locale(libfilezilla:de) locale(libfilezilla:el) locale(libfilezilla:es) locale(libfilezilla:et) locale(libfilezilla:eu) locale(libfilezilla:fi_FI) locale(libfilezilla:fr) locale(libfilezilla:hr) locale(libfilezilla:is) locale(libfilezilla:it) locale(libfilezilla:nb_NO) locale(libfilezilla:ne) locale(libfilezilla:nl) locale(libfilezilla:nn_NO) locale(libfilezilla:oc) locale(libfilezilla:pl_PL) locale(libfilezilla:pt_BR) locale(libfilezilla:pt_PT) locale(libfilezilla:ru) locale(libfilezilla:sl_SI) locale(libfilezilla:sr) locale(libfilezilla:sv) locale(libfilezilla:tr) locale(libfilezilla:uk_UA) locale(libfilezilla:zh_CN) locale(libfilezilla:zh_TW)"
RDEPENDS:${PN} += "libfilezilla"

inherit rpm
