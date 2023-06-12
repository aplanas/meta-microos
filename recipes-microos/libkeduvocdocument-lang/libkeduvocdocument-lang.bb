SUMMARY = "Translations for package libkeduvocdocument"
DESCRIPTION = "Provides translations for the 'libkeduvocdocument' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "libkeduvocdocument-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "3fa292ed38e5ed037e2dbe8b0c6aa937815ecacda098af40a18704dd4dbf07132d76db57d52424290c4261161737a8451f1080fc3d955276a31c0dd359274863"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libkeduvocdocument-lang libkeduvocdocument-lang-all locale(libkeduvocdocument:ar) locale(libkeduvocdocument:az) locale(libkeduvocdocument:be) locale(libkeduvocdocument:bg) locale(libkeduvocdocument:br) locale(libkeduvocdocument:bs) locale(libkeduvocdocument:ca) locale(libkeduvocdocument:ca@valencia) locale(libkeduvocdocument:cs) locale(libkeduvocdocument:cy) locale(libkeduvocdocument:da) locale(libkeduvocdocument:de) locale(libkeduvocdocument:el) locale(libkeduvocdocument:en_GB) locale(libkeduvocdocument:eo) locale(libkeduvocdocument:es) locale(libkeduvocdocument:et) locale(libkeduvocdocument:eu) locale(libkeduvocdocument:fa) locale(libkeduvocdocument:fi) locale(libkeduvocdocument:fr) locale(libkeduvocdocument:ga) locale(libkeduvocdocument:gl) locale(libkeduvocdocument:he) locale(libkeduvocdocument:hi) locale(libkeduvocdocument:hr) locale(libkeduvocdocument:hu) locale(libkeduvocdocument:is) locale(libkeduvocdocument:it) locale(libkeduvocdocument:ja) locale(libkeduvocdocument:ka) locale(libkeduvocdocument:kk) locale(libkeduvocdocument:km) locale(libkeduvocdocument:ko) locale(libkeduvocdocument:lt) locale(libkeduvocdocument:lv) locale(libkeduvocdocument:mai) locale(libkeduvocdocument:mk) locale(libkeduvocdocument:ml) locale(libkeduvocdocument:mr) locale(libkeduvocdocument:ms) locale(libkeduvocdocument:nb) locale(libkeduvocdocument:nds) locale(libkeduvocdocument:ne) locale(libkeduvocdocument:nl) locale(libkeduvocdocument:nn) locale(libkeduvocdocument:oc) locale(libkeduvocdocument:pa) locale(libkeduvocdocument:pl) locale(libkeduvocdocument:pt) locale(libkeduvocdocument:pt_BR) locale(libkeduvocdocument:ro) locale(libkeduvocdocument:ru) locale(libkeduvocdocument:si) locale(libkeduvocdocument:sk) locale(libkeduvocdocument:sl) locale(libkeduvocdocument:sq) locale(libkeduvocdocument:sv) locale(libkeduvocdocument:th) locale(libkeduvocdocument:tr) locale(libkeduvocdocument:ug) locale(libkeduvocdocument:uk) locale(libkeduvocdocument:vi) locale(libkeduvocdocument:zh_CN) locale(libkeduvocdocument:zh_TW)"
RDEPENDS:${PN} += "libkeduvocdocument"

inherit rpm
