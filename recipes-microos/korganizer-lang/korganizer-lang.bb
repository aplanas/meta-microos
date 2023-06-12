SUMMARY = "Translations for package korganizer"
DESCRIPTION = "Provides translations for the 'korganizer' package."
LICENSE = "GPL-2.0-only"

PV = "23.04.1"

RPM_NAME = "korganizer-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "48ffa14ccd70e4bc2f8dc0cc6f488ef067ff8c99a141ae1be61a8e8afd56274d4803bc622fce5b0513f8978aff9771b7d27a1ceb833e784403e08b831c45e1f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "korganizer-lang korganizer-lang-all locale(korganizer:af) locale(korganizer:ar) locale(korganizer:az) locale(korganizer:be) locale(korganizer:bg) locale(korganizer:br) locale(korganizer:bs) locale(korganizer:ca) locale(korganizer:ca@valencia) locale(korganizer:cs) locale(korganizer:cy) locale(korganizer:da) locale(korganizer:de) locale(korganizer:el) locale(korganizer:en_GB) locale(korganizer:eo) locale(korganizer:es) locale(korganizer:et) locale(korganizer:eu) locale(korganizer:fa) locale(korganizer:fi) locale(korganizer:fr) locale(korganizer:ga) locale(korganizer:gl) locale(korganizer:he) locale(korganizer:hi) locale(korganizer:hr) locale(korganizer:hu) locale(korganizer:ia) locale(korganizer:id) locale(korganizer:is) locale(korganizer:it) locale(korganizer:ja) locale(korganizer:ka) locale(korganizer:kk) locale(korganizer:km) locale(korganizer:ko) locale(korganizer:lt) locale(korganizer:lv) locale(korganizer:mai) locale(korganizer:mk) locale(korganizer:mr) locale(korganizer:ms) locale(korganizer:nb) locale(korganizer:nds) locale(korganizer:ne) locale(korganizer:nl) locale(korganizer:nn) locale(korganizer:pa) locale(korganizer:pl) locale(korganizer:pt) locale(korganizer:pt_BR) locale(korganizer:ro) locale(korganizer:ru) locale(korganizer:sk) locale(korganizer:sl) locale(korganizer:sq) locale(korganizer:sv) locale(korganizer:ta) locale(korganizer:th) locale(korganizer:tr) locale(korganizer:ug) locale(korganizer:uk) locale(korganizer:wa) locale(korganizer:zh_CN) locale(korganizer:zh_TW)"
RDEPENDS:${PN} += "korganizer"

inherit rpm
