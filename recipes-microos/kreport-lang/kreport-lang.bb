SUMMARY = "Translations for package kreport"
DESCRIPTION = "Provides translations for the 'kreport' package."
LICENSE = "LGPL-2.0-only"

PV = "3.2.0"

RPM_NAME = "kreport-lang-3.2.0-4.11.noarch.rpm"
RPM_HASH = "d4437d6cb184d2ca7f5d5ae0b0f65a113bf91f11aa9cce9d73aa7b0b0dc3b43e74524632d612f661eb5868df0ccb0aa1a3baac4df407120d8c2cfbd8fe8281a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kreport-lang kreport-lang-all locale(kreport:af) locale(kreport:ar) locale(kreport:ast) locale(kreport:be) locale(kreport:bg) locale(kreport:br) locale(kreport:bs) locale(kreport:ca) locale(kreport:ca@valencia) locale(kreport:cs) locale(kreport:cy) locale(kreport:da) locale(kreport:de) locale(kreport:el) locale(kreport:en_GB) locale(kreport:eo) locale(kreport:es) locale(kreport:et) locale(kreport:eu) locale(kreport:fa) locale(kreport:fi) locale(kreport:fr) locale(kreport:ga) locale(kreport:gl) locale(kreport:he) locale(kreport:hi) locale(kreport:hr) locale(kreport:hu) locale(kreport:ia) locale(kreport:is) locale(kreport:it) locale(kreport:ja) locale(kreport:kk) locale(kreport:ko) locale(kreport:lt) locale(kreport:lv) locale(kreport:mai) locale(kreport:mk) locale(kreport:mr) locale(kreport:ms) locale(kreport:nb) locale(kreport:nds) locale(kreport:ne) locale(kreport:nl) locale(kreport:nn) locale(kreport:oc) locale(kreport:pa) locale(kreport:pl) locale(kreport:pt) locale(kreport:pt_BR) locale(kreport:ro) locale(kreport:ru) locale(kreport:sk) locale(kreport:sl) locale(kreport:sv) locale(kreport:ta) locale(kreport:th) locale(kreport:tr) locale(kreport:ug) locale(kreport:uk) locale(kreport:vi) locale(kreport:wa) locale(kreport:zh_CN) locale(kreport:zh_TW)"
RDEPENDS:${PN} += "kreport"

inherit rpm
