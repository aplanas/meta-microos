SUMMARY = "Translations for package kcalutils"
DESCRIPTION = "Provides translations for the 'kcalutils' package."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "kcalutils-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "b90b4f090632c8200b198b551deebc9061936397de8636baee86161fe97c25e8d379861caf53717b4d6fa179b7517da830e20569ed9f5ac4635ea8ef5fd1c5b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kcalutils-lang kcalutils-lang-all locale(kcalutils:ar) locale(kcalutils:az) locale(kcalutils:bg) locale(kcalutils:bs) locale(kcalutils:ca) locale(kcalutils:ca@valencia) locale(kcalutils:cs) locale(kcalutils:da) locale(kcalutils:de) locale(kcalutils:el) locale(kcalutils:en_GB) locale(kcalutils:es) locale(kcalutils:et) locale(kcalutils:eu) locale(kcalutils:fi) locale(kcalutils:fr) locale(kcalutils:ga) locale(kcalutils:gl) locale(kcalutils:hr) locale(kcalutils:hu) locale(kcalutils:ia) locale(kcalutils:it) locale(kcalutils:ja) locale(kcalutils:ka) locale(kcalutils:kk) locale(kcalutils:km) locale(kcalutils:ko) locale(kcalutils:lt) locale(kcalutils:mai) locale(kcalutils:mr) locale(kcalutils:nb) locale(kcalutils:nds) locale(kcalutils:nl) locale(kcalutils:nn) locale(kcalutils:pa) locale(kcalutils:pl) locale(kcalutils:pt) locale(kcalutils:pt_BR) locale(kcalutils:ro) locale(kcalutils:ru) locale(kcalutils:sk) locale(kcalutils:sl) locale(kcalutils:sr) locale(kcalutils:sr@ijekavian) locale(kcalutils:sr@ijekavianlatin) locale(kcalutils:sr@latin) locale(kcalutils:sv) locale(kcalutils:ta) locale(kcalutils:tr) locale(kcalutils:ug) locale(kcalutils:uk) locale(kcalutils:zh_CN) locale(kcalutils:zh_TW)"
RDEPENDS:${PN} += "kcalutils"

inherit rpm
