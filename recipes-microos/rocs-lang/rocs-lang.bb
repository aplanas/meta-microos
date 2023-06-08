SUMMARY = "Translations for package rocs"
DESCRIPTION = "Provides translations for the 'rocs' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "rocs-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "ccb59e48f63adb44be30dc5240384cd4da6d823ef6d07841e2fd5d0be6821546a77e056ad3dc56d7541768f0770044c2b6eeab35a9be3b54a0d6210465b17dd8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(rocs:ar) locale(rocs:bg) locale(rocs:bs) locale(rocs:ca) locale(rocs:ca@valencia) locale(rocs:cs) locale(rocs:da) locale(rocs:de) locale(rocs:el) locale(rocs:en_GB) locale(rocs:eo) locale(rocs:es) locale(rocs:et) locale(rocs:fi) locale(rocs:fr) locale(rocs:ga) locale(rocs:gl) locale(rocs:hr) locale(rocs:hu) locale(rocs:it) locale(rocs:ja) locale(rocs:ka) locale(rocs:kk) locale(rocs:ko) locale(rocs:lt) locale(rocs:lv) locale(rocs:ml) locale(rocs:mr) locale(rocs:nb) locale(rocs:nds) locale(rocs:nl) locale(rocs:nn) locale(rocs:pa) locale(rocs:pl) locale(rocs:pt) locale(rocs:pt_BR) locale(rocs:ro) locale(rocs:ru) locale(rocs:sk) locale(rocs:sl) locale(rocs:sv) locale(rocs:th) locale(rocs:tr) locale(rocs:ug) locale(rocs:uk) locale(rocs:zh_CN) locale(rocs:zh_TW) rocs-lang rocs-lang-all"
RDEPENDS:${PN} += "rocs"

inherit rpm
