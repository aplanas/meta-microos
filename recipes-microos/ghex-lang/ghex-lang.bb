SUMMARY = "Translations for package ghex"
DESCRIPTION = "Provides translations for the 'ghex' package."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "ghex-lang-44.1-1.1.noarch.rpm"
RPM_HASH = "9a3ab27e84f5b62130db92106db1cb6219461cc3479ac76bde3f4f94369736db866f943f16d3956b37da17b40b5f70d703d5c97db9815cf7399306b2c723d6dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghex-lang ghex-lang-all locale(ghex:ar) locale(ghex:az) locale(ghex:be) locale(ghex:bg) locale(ghex:bs) locale(ghex:ca) locale(ghex:cs) locale(ghex:da) locale(ghex:de) locale(ghex:dz) locale(ghex:el) locale(ghex:en_CA) locale(ghex:en_GB) locale(ghex:es) locale(ghex:et) locale(ghex:eu) locale(ghex:fa) locale(ghex:fi) locale(ghex:fr) locale(ghex:fur) locale(ghex:ga) locale(ghex:gl) locale(ghex:he) locale(ghex:hr) locale(ghex:hu) locale(ghex:id) locale(ghex:it) locale(ghex:ja) locale(ghex:ko) locale(ghex:lt) locale(ghex:lv) locale(ghex:mk) locale(ghex:ml) locale(ghex:ms) locale(ghex:nb) locale(ghex:ne) locale(ghex:nl) locale(ghex:nn) locale(ghex:oc) locale(ghex:pa) locale(ghex:pl) locale(ghex:pt) locale(ghex:pt_BR) locale(ghex:ro) locale(ghex:ru) locale(ghex:sk) locale(ghex:sl) locale(ghex:sq) locale(ghex:sr) locale(ghex:sr@latin) locale(ghex:sv) locale(ghex:th) locale(ghex:tr) locale(ghex:uk) locale(ghex:vi) locale(ghex:wa) locale(ghex:zh_CN) locale(ghex:zh_TW)"
RDEPENDS:${PN} += "ghex"

inherit rpm
