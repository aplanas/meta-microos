SUMMARY = "Translations for package kpartloader"
DESCRIPTION = "Provides translations for the 'kpartloader' package."
LICENSE = "GPL-2.0-only & GFDL-1.2-only & LGPL-2.0-only"

PV = "23.04.1"

RPM_NAME = "kpartloader-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "6c501d3ed9efbb048daeba76ee5921c1a26fd1a345b98c5b7936bf5bd3da0c0df3bb078114aabfb7b1b34c7971050cf17a6f747447c49b30d1d02a88f3ebf4b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kpartloader-lang kpartloader-lang-all locale(kpartloader:az) locale(kpartloader:bg) locale(kpartloader:bs) locale(kpartloader:ca) locale(kpartloader:ca@valencia) locale(kpartloader:cs) locale(kpartloader:da) locale(kpartloader:de) locale(kpartloader:el) locale(kpartloader:en_GB) locale(kpartloader:eo) locale(kpartloader:es) locale(kpartloader:et) locale(kpartloader:eu) locale(kpartloader:fi) locale(kpartloader:fr) locale(kpartloader:ga) locale(kpartloader:gl) locale(kpartloader:hr) locale(kpartloader:hu) locale(kpartloader:it) locale(kpartloader:ja) locale(kpartloader:ka) locale(kpartloader:kk) locale(kpartloader:ko) locale(kpartloader:lt) locale(kpartloader:lv) locale(kpartloader:mr) locale(kpartloader:nb) locale(kpartloader:nds) locale(kpartloader:nl) locale(kpartloader:nn) locale(kpartloader:pa) locale(kpartloader:pl) locale(kpartloader:pt) locale(kpartloader:pt_BR) locale(kpartloader:ro) locale(kpartloader:ru) locale(kpartloader:sk) locale(kpartloader:sl) locale(kpartloader:sq) locale(kpartloader:sv) locale(kpartloader:tr) locale(kpartloader:ug) locale(kpartloader:uk) locale(kpartloader:zh_CN) locale(kpartloader:zh_TW)"
RDEPENDS:${PN} += "kpartloader"

inherit rpm
