SUMMARY = "Translations for package poedit"
DESCRIPTION = "Provides translations for the 'poedit' package."
LICENSE = "MIT"

PV = "3.2.2"

RPM_NAME = "poedit-lang-3.2.2-1.7.noarch.rpm"
RPM_HASH = "4340be362d23f837738621479ee027d41d0771de94760327f9585e05bd31f086b869659107cd9116d819289fd3d16623a05fdca99a34028ae78bec267a66afe5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(poedit:af) locale(poedit:ar) locale(poedit:az) locale(poedit:be) locale(poedit:be@latin) locale(poedit:bg) locale(poedit:bs) locale(poedit:ca) locale(poedit:cs) locale(poedit:da) locale(poedit:de) locale(poedit:el) locale(poedit:en_GB) locale(poedit:es) locale(poedit:et) locale(poedit:eu) locale(poedit:fa) locale(poedit:fi) locale(poedit:fr) locale(poedit:ga) locale(poedit:gl) locale(poedit:he) locale(poedit:hr) locale(poedit:hu) locale(poedit:id) locale(poedit:is) locale(poedit:it) locale(poedit:ja) locale(poedit:ka) locale(poedit:kk) locale(poedit:ko) locale(poedit:lt) locale(poedit:lv) locale(poedit:ms) locale(poedit:nb) locale(poedit:nl) locale(poedit:oc) locale(poedit:pa) locale(poedit:pl) locale(poedit:pt_BR) locale(poedit:pt_PT) locale(poedit:ro) locale(poedit:ru) locale(poedit:sk) locale(poedit:sl) locale(poedit:sq) locale(poedit:sr) locale(poedit:sv) locale(poedit:th) locale(poedit:tr) locale(poedit:uk) locale(poedit:vi) locale(poedit:zh_CN) locale(poedit:zh_TW) poedit-lang poedit-lang-all"
RDEPENDS:${PN} += "poedit"

inherit rpm
