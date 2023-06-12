SUMMARY = "Translations for package kubrick"
DESCRIPTION = "Provides translations for the 'kubrick' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kubrick-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "2130d09565f9261a91f3accdd779b0da404f6bdfd4a61fcf9af860a0c88d320292e0ead88a3994c0041c3462c0de1301cc1d1fd964e31687686cf340a0cb48e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubrick-lang kubrick-lang-all locale(kubrick:bg) locale(kubrick:bs) locale(kubrick:ca) locale(kubrick:ca@valencia) locale(kubrick:cs) locale(kubrick:da) locale(kubrick:de) locale(kubrick:el) locale(kubrick:en_GB) locale(kubrick:eo) locale(kubrick:es) locale(kubrick:et) locale(kubrick:eu) locale(kubrick:fi) locale(kubrick:fr) locale(kubrick:ga) locale(kubrick:gl) locale(kubrick:hr) locale(kubrick:hu) locale(kubrick:id) locale(kubrick:is) locale(kubrick:it) locale(kubrick:ja) locale(kubrick:ka) locale(kubrick:kk) locale(kubrick:km) locale(kubrick:ko) locale(kubrick:lt) locale(kubrick:lv) locale(kubrick:mai) locale(kubrick:ml) locale(kubrick:mr) locale(kubrick:nb) locale(kubrick:nds) locale(kubrick:nl) locale(kubrick:nn) locale(kubrick:pl) locale(kubrick:pt) locale(kubrick:pt_BR) locale(kubrick:ro) locale(kubrick:ru) locale(kubrick:sk) locale(kubrick:sl) locale(kubrick:sr) locale(kubrick:sr@ijekavian) locale(kubrick:sr@ijekavianlatin) locale(kubrick:sr@latin) locale(kubrick:sv) locale(kubrick:tr) locale(kubrick:ug) locale(kubrick:uk) locale(kubrick:zh_CN) locale(kubrick:zh_TW)"
RDEPENDS:${PN} += "kubrick"

inherit rpm
