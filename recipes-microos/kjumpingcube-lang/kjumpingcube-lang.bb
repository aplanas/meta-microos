SUMMARY = "Translations for package kjumpingcube"
DESCRIPTION = "Provides translations for the 'kjumpingcube' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kjumpingcube-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "79fbe986797cd6f3fccd2b5231218677c51c24cd6d73e2b0c58dc6a37207dad5dd0a0e97e90866eb806589363e9fceec32e2a7a6cdd933cedd91c7d64ed7bfa8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kjumpingcube-lang kjumpingcube-lang-all locale(kjumpingcube:af) locale(kjumpingcube:ar) locale(kjumpingcube:be) locale(kjumpingcube:bg) locale(kjumpingcube:br) locale(kjumpingcube:bs) locale(kjumpingcube:ca) locale(kjumpingcube:ca@valencia) locale(kjumpingcube:cs) locale(kjumpingcube:cy) locale(kjumpingcube:da) locale(kjumpingcube:de) locale(kjumpingcube:el) locale(kjumpingcube:en_GB) locale(kjumpingcube:eo) locale(kjumpingcube:es) locale(kjumpingcube:et) locale(kjumpingcube:eu) locale(kjumpingcube:fa) locale(kjumpingcube:fi) locale(kjumpingcube:fr) locale(kjumpingcube:ga) locale(kjumpingcube:gl) locale(kjumpingcube:he) locale(kjumpingcube:hi) locale(kjumpingcube:hr) locale(kjumpingcube:hu) locale(kjumpingcube:id) locale(kjumpingcube:is) locale(kjumpingcube:it) locale(kjumpingcube:ja) locale(kjumpingcube:ka) locale(kjumpingcube:kk) locale(kjumpingcube:km) locale(kjumpingcube:ko) locale(kjumpingcube:lt) locale(kjumpingcube:lv) locale(kjumpingcube:mai) locale(kjumpingcube:mk) locale(kjumpingcube:ml) locale(kjumpingcube:mr) locale(kjumpingcube:nb) locale(kjumpingcube:nds) locale(kjumpingcube:ne) locale(kjumpingcube:nl) locale(kjumpingcube:nn) locale(kjumpingcube:oc) locale(kjumpingcube:pa) locale(kjumpingcube:pl) locale(kjumpingcube:pt) locale(kjumpingcube:pt_BR) locale(kjumpingcube:ro) locale(kjumpingcube:ru) locale(kjumpingcube:sk) locale(kjumpingcube:sl) locale(kjumpingcube:sq) locale(kjumpingcube:sr) locale(kjumpingcube:sr@ijekavian) locale(kjumpingcube:sr@ijekavianlatin) locale(kjumpingcube:sr@latin) locale(kjumpingcube:sv) locale(kjumpingcube:ta) locale(kjumpingcube:te) locale(kjumpingcube:tr) locale(kjumpingcube:ug) locale(kjumpingcube:uk) locale(kjumpingcube:vi) locale(kjumpingcube:zh_CN) locale(kjumpingcube:zh_TW)"
RDEPENDS:${PN} += "kjumpingcube"

inherit rpm
