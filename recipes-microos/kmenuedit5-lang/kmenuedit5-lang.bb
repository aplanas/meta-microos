SUMMARY = "Translations for package kmenuedit5"
DESCRIPTION = "Provides translations for the 'kmenuedit5' package."
LICENSE = "GPL-2.0-only"

PV = "5.27.4"

RPM_NAME = "kmenuedit5-lang-5.27.4-1.1.noarch.rpm"
RPM_HASH = "9987a38147fe69e55531993e413970347fac36a7214418b2197a091084bc8a851777658bc2b04de2fea14ad4db51d0859c7ab5fca53cdba63fbbfa54531021fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kmenuedit5-lang kmenuedit5-lang-all locale(kmenuedit5:af) locale(kmenuedit5:ar) locale(kmenuedit5:az) locale(kmenuedit5:be) locale(kmenuedit5:bg) locale(kmenuedit5:bn) locale(kmenuedit5:bn_IN) locale(kmenuedit5:br) locale(kmenuedit5:bs) locale(kmenuedit5:ca) locale(kmenuedit5:ca@valencia) locale(kmenuedit5:cs) locale(kmenuedit5:cy) locale(kmenuedit5:da) locale(kmenuedit5:de) locale(kmenuedit5:el) locale(kmenuedit5:en_GB) locale(kmenuedit5:eo) locale(kmenuedit5:es) locale(kmenuedit5:et) locale(kmenuedit5:eu) locale(kmenuedit5:fa) locale(kmenuedit5:fi) locale(kmenuedit5:fr) locale(kmenuedit5:ga) locale(kmenuedit5:gl) locale(kmenuedit5:gu) locale(kmenuedit5:he) locale(kmenuedit5:hi) locale(kmenuedit5:hr) locale(kmenuedit5:hu) locale(kmenuedit5:ia) locale(kmenuedit5:id) locale(kmenuedit5:is) locale(kmenuedit5:it) locale(kmenuedit5:ja) locale(kmenuedit5:ka) locale(kmenuedit5:kk) locale(kmenuedit5:km) locale(kmenuedit5:kn) locale(kmenuedit5:ko) locale(kmenuedit5:lt) locale(kmenuedit5:lv) locale(kmenuedit5:mai) locale(kmenuedit5:mk) locale(kmenuedit5:ml) locale(kmenuedit5:mr) locale(kmenuedit5:ms) locale(kmenuedit5:nb) locale(kmenuedit5:nds) locale(kmenuedit5:ne) locale(kmenuedit5:nl) locale(kmenuedit5:nn) locale(kmenuedit5:oc) locale(kmenuedit5:pa) locale(kmenuedit5:pl) locale(kmenuedit5:pt) locale(kmenuedit5:pt_BR) locale(kmenuedit5:ro) locale(kmenuedit5:ru) locale(kmenuedit5:si) locale(kmenuedit5:sk) locale(kmenuedit5:sl) locale(kmenuedit5:sq) locale(kmenuedit5:sr) locale(kmenuedit5:sr@ijekavian) locale(kmenuedit5:sr@ijekavianlatin) locale(kmenuedit5:sr@latin) locale(kmenuedit5:sv) locale(kmenuedit5:ta) locale(kmenuedit5:te) locale(kmenuedit5:th) locale(kmenuedit5:tr) locale(kmenuedit5:ug) locale(kmenuedit5:uk) locale(kmenuedit5:vi) locale(kmenuedit5:wa) locale(kmenuedit5:zh_CN) locale(kmenuedit5:zh_TW)"
RDEPENDS:${PN} += "kmenuedit5"

inherit rpm
