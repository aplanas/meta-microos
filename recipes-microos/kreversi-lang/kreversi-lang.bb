SUMMARY = "Translations for package kreversi"
DESCRIPTION = "Provides translations for the 'kreversi' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kreversi-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "d69f0b69ac09c90d92cd307cdf5325a5059df3ff2ac9e9802c0c17dbdc245ae7c13c0f0853ce8463b1f96c1c3ed084d4fb8cf2edb7c348a8f96b3b010330f038"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kreversi-lang kreversi-lang-all locale(kreversi:af) locale(kreversi:ar) locale(kreversi:be) locale(kreversi:bg) locale(kreversi:bn) locale(kreversi:br) locale(kreversi:bs) locale(kreversi:ca) locale(kreversi:ca@valencia) locale(kreversi:cs) locale(kreversi:cy) locale(kreversi:da) locale(kreversi:de) locale(kreversi:el) locale(kreversi:en_GB) locale(kreversi:eo) locale(kreversi:es) locale(kreversi:et) locale(kreversi:eu) locale(kreversi:fa) locale(kreversi:fi) locale(kreversi:fr) locale(kreversi:ga) locale(kreversi:gl) locale(kreversi:he) locale(kreversi:hi) locale(kreversi:hr) locale(kreversi:hu) locale(kreversi:id) locale(kreversi:is) locale(kreversi:it) locale(kreversi:ja) locale(kreversi:ka) locale(kreversi:kk) locale(kreversi:km) locale(kreversi:ko) locale(kreversi:lt) locale(kreversi:lv) locale(kreversi:mai) locale(kreversi:mk) locale(kreversi:ml) locale(kreversi:mr) locale(kreversi:nb) locale(kreversi:nds) locale(kreversi:ne) locale(kreversi:nl) locale(kreversi:nn) locale(kreversi:oc) locale(kreversi:pa) locale(kreversi:pl) locale(kreversi:pt) locale(kreversi:pt_BR) locale(kreversi:ro) locale(kreversi:ru) locale(kreversi:sk) locale(kreversi:sl) locale(kreversi:sq) locale(kreversi:sr) locale(kreversi:sr@ijekavian) locale(kreversi:sr@ijekavianlatin) locale(kreversi:sr@latin) locale(kreversi:sv) locale(kreversi:ta) locale(kreversi:th) locale(kreversi:tr) locale(kreversi:ug) locale(kreversi:uk) locale(kreversi:zh_CN) locale(kreversi:zh_TW)"
RDEPENDS:${PN} += "kreversi"

inherit rpm
