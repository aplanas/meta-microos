SUMMARY = "Translations for package kdf"
DESCRIPTION = "Provides translations for the 'kdf' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kdf-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "f4405efe96be7b36b49773fcf699c5bfd41fed12875551a3a2c183c4ec83b67bf1ff7f9cfd6cfdc9362d2b31ecba0d19a8f5586aaf7445f841785ea81b80ee75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdf-lang kdf-lang-all locale(kdf:af) locale(kdf:ar) locale(kdf:be) locale(kdf:bg) locale(kdf:br) locale(kdf:bs) locale(kdf:ca) locale(kdf:ca@valencia) locale(kdf:cs) locale(kdf:cy) locale(kdf:da) locale(kdf:de) locale(kdf:el) locale(kdf:en_GB) locale(kdf:eo) locale(kdf:es) locale(kdf:et) locale(kdf:eu) locale(kdf:fa) locale(kdf:fi) locale(kdf:fr) locale(kdf:ga) locale(kdf:gl) locale(kdf:he) locale(kdf:hi) locale(kdf:hr) locale(kdf:hu) locale(kdf:ia) locale(kdf:id) locale(kdf:is) locale(kdf:it) locale(kdf:ja) locale(kdf:ka) locale(kdf:kk) locale(kdf:km) locale(kdf:ko) locale(kdf:lt) locale(kdf:lv) locale(kdf:mk) locale(kdf:mr) locale(kdf:ms) locale(kdf:nb) locale(kdf:nds) locale(kdf:ne) locale(kdf:nl) locale(kdf:nn) locale(kdf:oc) locale(kdf:pa) locale(kdf:pl) locale(kdf:pt) locale(kdf:pt_BR) locale(kdf:ro) locale(kdf:ru) locale(kdf:sk) locale(kdf:sl) locale(kdf:sq) locale(kdf:sr) locale(kdf:sr@ijekavian) locale(kdf:sr@ijekavianlatin) locale(kdf:sr@latin) locale(kdf:sv) locale(kdf:ta) locale(kdf:th) locale(kdf:tr) locale(kdf:ug) locale(kdf:uk) locale(kdf:zh_CN) locale(kdf:zh_TW)"
RDEPENDS:${PN} += "kdf"

inherit rpm
