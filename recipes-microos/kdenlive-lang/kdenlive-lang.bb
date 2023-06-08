SUMMARY = "Translations for package kdenlive"
DESCRIPTION = "Provides translations for the 'kdenlive' package."
LICENSE = "GPL-3.0-or-later"

PV = "23.04.0"

RPM_NAME = "kdenlive-lang-23.04.0-2.1.noarch.rpm"
RPM_HASH = "28784c80cccd223ea5d1010e082cbb60377471f6acd6fb2b45e52131d1174faa76a51e4f74ca4aec064eb82b2c76af240f7e5a30b283b42b8221caaf74f03b9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdenlive-lang kdenlive-lang-all locale(kdenlive:ar) locale(kdenlive:az) locale(kdenlive:bs) locale(kdenlive:ca) locale(kdenlive:ca@valencia) locale(kdenlive:cs) locale(kdenlive:da) locale(kdenlive:de) locale(kdenlive:el) locale(kdenlive:en_GB) locale(kdenlive:es) locale(kdenlive:et) locale(kdenlive:eu) locale(kdenlive:fi) locale(kdenlive:fr) locale(kdenlive:ga) locale(kdenlive:gl) locale(kdenlive:he) locale(kdenlive:hr) locale(kdenlive:hu) locale(kdenlive:id) locale(kdenlive:it) locale(kdenlive:ja) locale(kdenlive:ka) locale(kdenlive:ko) locale(kdenlive:lt) locale(kdenlive:mr) locale(kdenlive:nb) locale(kdenlive:nds) locale(kdenlive:nl) locale(kdenlive:pl) locale(kdenlive:pt) locale(kdenlive:pt_BR) locale(kdenlive:ro) locale(kdenlive:ru) locale(kdenlive:sk) locale(kdenlive:sl) locale(kdenlive:sv) locale(kdenlive:tr) locale(kdenlive:ug) locale(kdenlive:uk) locale(kdenlive:zh_CN) locale(kdenlive:zh_TW)"
RDEPENDS:${PN} += "kdenlive"

inherit rpm
