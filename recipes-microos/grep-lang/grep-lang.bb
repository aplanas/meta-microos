SUMMARY = "Translations for package grep"
DESCRIPTION = "Provides translations for the 'grep' package."
LICENSE = "GPL-3.0-or-later"

PV = "3.11"

RPM_NAME = "grep-lang-3.11-1.1.noarch.rpm"
RPM_HASH = "a44aac36a3be5b7232faa5351c1b5edb2af51a9656e3e073cdf9e9737df810db2d9c8c1361a188f12e69cd3796216f85d2e8cd55b55876b77b1e1b7b5f42f083"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grep-lang grep-lang-all locale(grep:af) locale(grep:be) locale(grep:bg) locale(grep:ca) locale(grep:cs) locale(grep:da) locale(grep:de) locale(grep:el) locale(grep:eo) locale(grep:es) locale(grep:et) locale(grep:eu) locale(grep:fi) locale(grep:fr) locale(grep:ga) locale(grep:gl) locale(grep:he) locale(grep:hr) locale(grep:hu) locale(grep:id) locale(grep:it) locale(grep:ja) locale(grep:ka) locale(grep:ko) locale(grep:lt) locale(grep:nb) locale(grep:nl) locale(grep:pa) locale(grep:pl) locale(grep:pt) locale(grep:pt_BR) locale(grep:ro) locale(grep:ru) locale(grep:sk) locale(grep:sl) locale(grep:sr) locale(grep:sv) locale(grep:ta) locale(grep:th) locale(grep:tr) locale(grep:uk) locale(grep:vi) locale(grep:zh_CN) locale(grep:zh_TW)"
RDEPENDS:${PN} += "grep"

inherit rpm
