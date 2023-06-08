SUMMARY = "Translations for package kfourinline"
DESCRIPTION = "Provides translations for the 'kfourinline' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kfourinline-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "629c222a8b2af8ac268cfc64c1a2693080de4e0ec80bbf75101998550e2ec4f848f6976fba5f7f3606700b1ec1ad85eda25d46788d4ac3fc6cdba7daa9b8d032"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kfourinline-lang kfourinline-lang-all locale(kfourinline:af) locale(kfourinline:ar) locale(kfourinline:be) locale(kfourinline:bg) locale(kfourinline:br) locale(kfourinline:bs) locale(kfourinline:ca) locale(kfourinline:ca@valencia) locale(kfourinline:cs) locale(kfourinline:cy) locale(kfourinline:da) locale(kfourinline:de) locale(kfourinline:el) locale(kfourinline:en_GB) locale(kfourinline:eo) locale(kfourinline:es) locale(kfourinline:et) locale(kfourinline:eu) locale(kfourinline:fa) locale(kfourinline:fi) locale(kfourinline:fr) locale(kfourinline:ga) locale(kfourinline:gl) locale(kfourinline:he) locale(kfourinline:hr) locale(kfourinline:hu) locale(kfourinline:id) locale(kfourinline:is) locale(kfourinline:it) locale(kfourinline:ja) locale(kfourinline:ka) locale(kfourinline:kk) locale(kfourinline:km) locale(kfourinline:ko) locale(kfourinline:lt) locale(kfourinline:lv) locale(kfourinline:mai) locale(kfourinline:mk) locale(kfourinline:ml) locale(kfourinline:mr) locale(kfourinline:nb) locale(kfourinline:nds) locale(kfourinline:ne) locale(kfourinline:nl) locale(kfourinline:nn) locale(kfourinline:oc) locale(kfourinline:pa) locale(kfourinline:pl) locale(kfourinline:pt) locale(kfourinline:pt_BR) locale(kfourinline:ro) locale(kfourinline:ru) locale(kfourinline:sk) locale(kfourinline:sl) locale(kfourinline:sr) locale(kfourinline:sr@ijekavian) locale(kfourinline:sr@ijekavianlatin) locale(kfourinline:sr@latin) locale(kfourinline:sv) locale(kfourinline:ta) locale(kfourinline:te) locale(kfourinline:th) locale(kfourinline:tr) locale(kfourinline:ug) locale(kfourinline:uk) locale(kfourinline:zh_CN) locale(kfourinline:zh_TW)"
RDEPENDS:${PN} += "kfourinline"

inherit rpm
