SUMMARY = "Translations for package kate"
DESCRIPTION = "Provides translations for the 'kate' package."
LICENSE = "GPL-3.0-or-later"

PV = "23.04.1"

RPM_NAME = "kate-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "dee2ba5fab2df8dc72cfd668ccc8e6f72729270584a79907903fb21ba5aef45037a131118cb802afb064412367eb1b29bfc5f6e7bb7562962f41d6abe203b87c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kate-lang kate-lang-all locale(kate:af) locale(kate:ar) locale(kate:az) locale(kate:be) locale(kate:bg) locale(kate:br) locale(kate:bs) locale(kate:ca) locale(kate:ca@valencia) locale(kate:cs) locale(kate:cy) locale(kate:da) locale(kate:de) locale(kate:el) locale(kate:en_GB) locale(kate:eo) locale(kate:es) locale(kate:et) locale(kate:eu) locale(kate:fa) locale(kate:fi) locale(kate:fr) locale(kate:ga) locale(kate:gl) locale(kate:he) locale(kate:hi) locale(kate:hr) locale(kate:hu) locale(kate:ia) locale(kate:id) locale(kate:is) locale(kate:it) locale(kate:ja) locale(kate:ka) locale(kate:kk) locale(kate:km) locale(kate:ko) locale(kate:lt) locale(kate:lv) locale(kate:mai) locale(kate:mk) locale(kate:ml) locale(kate:mr) locale(kate:ms) locale(kate:nb) locale(kate:nds) locale(kate:ne) locale(kate:nl) locale(kate:nn) locale(kate:oc) locale(kate:pa) locale(kate:pl) locale(kate:pt) locale(kate:pt_BR) locale(kate:ro) locale(kate:ru) locale(kate:si) locale(kate:sk) locale(kate:sl) locale(kate:sq) locale(kate:sr) locale(kate:sr@ijekavian) locale(kate:sr@ijekavianlatin) locale(kate:sr@latin) locale(kate:sv) locale(kate:ta) locale(kate:te) locale(kate:th) locale(kate:tr) locale(kate:ug) locale(kate:uk) locale(kate:vi) locale(kate:wa) locale(kate:zh_CN) locale(kate:zh_TW)"
RDEPENDS:${PN} += "kate"

inherit rpm
