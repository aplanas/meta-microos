SUMMARY = "Translations for package kdenlive"
DESCRIPTION = "Provides translations for the 'kdenlive' package."
LICENSE = "GPL-3.0-or-later"

PV = "23.04.1"

RPM_NAME = "kdenlive-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "1158124ed97dc5237dbafe3973c51be1e96ed810522b0f581b8bf116501132d938bb39558f188d203999de193c8ec24b046460d1f02775f00d3b42f655eb3c2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdenlive-lang kdenlive-lang-all locale(kdenlive:ar) locale(kdenlive:az) locale(kdenlive:bs) locale(kdenlive:ca) locale(kdenlive:ca@valencia) locale(kdenlive:cs) locale(kdenlive:da) locale(kdenlive:de) locale(kdenlive:el) locale(kdenlive:en_GB) locale(kdenlive:es) locale(kdenlive:et) locale(kdenlive:eu) locale(kdenlive:fi) locale(kdenlive:fr) locale(kdenlive:ga) locale(kdenlive:gl) locale(kdenlive:he) locale(kdenlive:hr) locale(kdenlive:hu) locale(kdenlive:id) locale(kdenlive:it) locale(kdenlive:ja) locale(kdenlive:ka) locale(kdenlive:ko) locale(kdenlive:lt) locale(kdenlive:mr) locale(kdenlive:nb) locale(kdenlive:nds) locale(kdenlive:nl) locale(kdenlive:pl) locale(kdenlive:pt) locale(kdenlive:pt_BR) locale(kdenlive:ro) locale(kdenlive:ru) locale(kdenlive:sk) locale(kdenlive:sl) locale(kdenlive:sv) locale(kdenlive:tr) locale(kdenlive:ug) locale(kdenlive:uk) locale(kdenlive:zh_CN) locale(kdenlive:zh_TW)"
RDEPENDS:${PN} += "kdenlive"

inherit rpm
