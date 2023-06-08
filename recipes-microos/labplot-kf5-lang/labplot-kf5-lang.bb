SUMMARY = "Translations for package labplot-kf5"
DESCRIPTION = "Provides translations for the 'labplot-kf5' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.10.0"

RPM_NAME = "labplot-kf5-lang-2.10.0-1.1.noarch.rpm"
RPM_HASH = "dd737c64ec62b5299f9907cc60187a536352cab227845aa163a4f1c45d1609810784a7305bf0e86883edfbcfb43a919bf70a7af1bec5b07ff3041eee9eb9b56e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "labplot-kf5-lang labplot-kf5-lang-all locale(labplot-kf5:ar) locale(labplot-kf5:bs) locale(labplot-kf5:ca) locale(labplot-kf5:ca@valencia) locale(labplot-kf5:cs) locale(labplot-kf5:da) locale(labplot-kf5:de) locale(labplot-kf5:el) locale(labplot-kf5:en_GB) locale(labplot-kf5:es) locale(labplot-kf5:eu) locale(labplot-kf5:fi) locale(labplot-kf5:fr) locale(labplot-kf5:gl) locale(labplot-kf5:hu) locale(labplot-kf5:it) locale(labplot-kf5:ka) locale(labplot-kf5:nds) locale(labplot-kf5:nl) locale(labplot-kf5:pl) locale(labplot-kf5:pt) locale(labplot-kf5:pt_BR) locale(labplot-kf5:ru) locale(labplot-kf5:sk) locale(labplot-kf5:sl) locale(labplot-kf5:sv) locale(labplot-kf5:tr) locale(labplot-kf5:uk) locale(labplot-kf5:zh_CN) locale(labplot-kf5:zh_TW)"
RDEPENDS:${PN} += "labplot-kf5"

inherit rpm
