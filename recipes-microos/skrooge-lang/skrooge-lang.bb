SUMMARY = "Translations for package skrooge"
DESCRIPTION = "Provides translations for the 'skrooge' package."
LICENSE = "GPL-3.0-only"

PV = "2.28.0"

RPM_NAME = "skrooge-lang-2.28.0-1.10.noarch.rpm"
RPM_HASH = "a79373d6496399fae512baedab40841183f47f9e6caf957055e98727b2e90cc552d173150a2f717c977b073d874468bbf49f0f639e0b08312c00ba9acf5e861f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(skrooge:ar) locale(skrooge:bg) locale(skrooge:bs) locale(skrooge:ca) locale(skrooge:ca@valencia) locale(skrooge:cs) locale(skrooge:da) locale(skrooge:de) locale(skrooge:el) locale(skrooge:en_GB) locale(skrooge:eo) locale(skrooge:es) locale(skrooge:et) locale(skrooge:fi) locale(skrooge:fr) locale(skrooge:ga) locale(skrooge:gl) locale(skrooge:hu) locale(skrooge:ia) locale(skrooge:it) locale(skrooge:ko) locale(skrooge:lt) locale(skrooge:mr) locale(skrooge:ms) locale(skrooge:nb) locale(skrooge:nds) locale(skrooge:nl) locale(skrooge:pl) locale(skrooge:pt) locale(skrooge:pt_BR) locale(skrooge:ro) locale(skrooge:ru) locale(skrooge:sk) locale(skrooge:sl) locale(skrooge:sv) locale(skrooge:tr) locale(skrooge:ug) locale(skrooge:uk) locale(skrooge:zh_CN) locale(skrooge:zh_TW) skrooge-lang skrooge-lang-all"
RDEPENDS:${PN} += "skrooge"

inherit rpm
