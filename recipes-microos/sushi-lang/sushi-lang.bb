SUMMARY = "Translations for package sushi"
DESCRIPTION = "Provides translations for the 'sushi' package."
LICENSE = "SUSE-GPL-2.0-with-plugin-exception"

PV = "43.0"

RPM_NAME = "sushi-lang-43.0-3.3.noarch.rpm"
RPM_HASH = "e13c4b303f22135bb7deb2567145aeb11102e09d95bfdf9e6075957e39b697f8d2d5373de89ae9bd4673de17ca9cd2f8bf141d841f6325bfc1a68c9e8953cbc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(sushi:af) locale(sushi:ar) locale(sushi:as) locale(sushi:ast) locale(sushi:be) locale(sushi:bg) locale(sushi:bn_IN) locale(sushi:bs) locale(sushi:ca) locale(sushi:ca@valencia) locale(sushi:cs) locale(sushi:da) locale(sushi:de) locale(sushi:el) locale(sushi:en_GB) locale(sushi:eo) locale(sushi:es) locale(sushi:et) locale(sushi:eu) locale(sushi:fa) locale(sushi:fi) locale(sushi:fr) locale(sushi:fur) locale(sushi:gd) locale(sushi:gl) locale(sushi:gu) locale(sushi:he) locale(sushi:hi) locale(sushi:hr) locale(sushi:hu) locale(sushi:id) locale(sushi:is) locale(sushi:it) locale(sushi:ja) locale(sushi:ka) locale(sushi:kk) locale(sushi:kn) locale(sushi:ko) locale(sushi:lt) locale(sushi:lv) locale(sushi:ml) locale(sushi:mr) locale(sushi:ms) locale(sushi:nb) locale(sushi:ne) locale(sushi:nl) locale(sushi:oc) locale(sushi:or) locale(sushi:pa) locale(sushi:pl) locale(sushi:pt) locale(sushi:pt_BR) locale(sushi:ro) locale(sushi:ru) locale(sushi:sk) locale(sushi:sl) locale(sushi:sr) locale(sushi:sr@latin) locale(sushi:sv) locale(sushi:ta) locale(sushi:te) locale(sushi:th) locale(sushi:tr) locale(sushi:ug) locale(sushi:uk) locale(sushi:vi) locale(sushi:zh_CN) locale(sushi:zh_HK) locale(sushi:zh_TW) sushi-lang sushi-lang-all"
RDEPENDS:${PN} += "sushi"

inherit rpm
