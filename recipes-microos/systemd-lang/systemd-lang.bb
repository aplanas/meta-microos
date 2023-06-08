SUMMARY = "Translations for package systemd"
DESCRIPTION = "Provides translations for the 'systemd' package."
LICENSE = "LGPL-2.1-or-later"

PV = "253.4"

RPM_NAME = "systemd-lang-253.4-1.2.noarch.rpm"
RPM_HASH = "d1e1410d40a12167af5766e94150c5a0aa28d676d230855d503b425c57d261fdcc872b4353687672ddd68f7f49cffe63a26ee951079a502d8aa2b33a737bfd5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(systemd:be) locale(systemd:be@latin) locale(systemd:bg) locale(systemd:ca) locale(systemd:cs) locale(systemd:da) locale(systemd:de) locale(systemd:el) locale(systemd:es) locale(systemd:et) locale(systemd:fi) locale(systemd:fr) locale(systemd:gl) locale(systemd:hr) locale(systemd:hu) locale(systemd:id) locale(systemd:it) locale(systemd:ja) locale(systemd:ka) locale(systemd:ko) locale(systemd:lt) locale(systemd:nl) locale(systemd:pa) locale(systemd:pl) locale(systemd:pt) locale(systemd:pt_BR) locale(systemd:ro) locale(systemd:ru) locale(systemd:si) locale(systemd:sk) locale(systemd:sr) locale(systemd:sv) locale(systemd:tr) locale(systemd:uk) locale(systemd:zh_CN) locale(systemd:zh_TW) systemd-lang systemd-lang-all"
RDEPENDS:${PN} += "systemd"

inherit rpm
