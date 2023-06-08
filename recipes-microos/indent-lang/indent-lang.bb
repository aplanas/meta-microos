SUMMARY = "Translations for package indent"
DESCRIPTION = "Provides translations for the 'indent' package."
LICENSE = "GPL-3.0-or-later"

PV = "2.2.13"

RPM_NAME = "indent-lang-2.2.13-1.1.noarch.rpm"
RPM_HASH = "67cdb5be08929d291b6e3dabd8cff59133804018b17d1bb5e087bbca7673d561ade69b50d78907be516a5d37bf3a9266eb6be386ee04ced7b0a06f84857e4427"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "indent-lang indent-lang-all locale(indent:bg) locale(indent:ca) locale(indent:cs) locale(indent:da) locale(indent:de) locale(indent:el) locale(indent:eo) locale(indent:es) locale(indent:et) locale(indent:eu) locale(indent:fi) locale(indent:fr) locale(indent:ga) locale(indent:gl) locale(indent:hr) locale(indent:hu) locale(indent:id) locale(indent:it) locale(indent:ja) locale(indent:ko) locale(indent:nl) locale(indent:pl) locale(indent:pt_BR) locale(indent:ro) locale(indent:ru) locale(indent:sk) locale(indent:sr) locale(indent:sv) locale(indent:tr) locale(indent:uk) locale(indent:vi) locale(indent:zh_CN) locale(indent:zh_TW)"
RDEPENDS:${PN} += "indent"

inherit rpm
