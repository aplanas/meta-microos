SUMMARY = "Translations for package ktp-approver"
DESCRIPTION = "Provides translations for the 'ktp-approver' package."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "ktp-approver-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "c19227c3bac5cd78c9276c802f707ce52b0006eacdee4920ce944040c904c36e6f5c9eec719f1d8bb0de29a63c679a033b792b469cf406d93b29c03e1ae43aab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ktp-approver-lang ktp-approver-lang-all locale(ktp-approver:ar) locale(ktp-approver:bs) locale(ktp-approver:ca) locale(ktp-approver:ca@valencia) locale(ktp-approver:cs) locale(ktp-approver:da) locale(ktp-approver:de) locale(ktp-approver:el) locale(ktp-approver:en_GB) locale(ktp-approver:es) locale(ktp-approver:et) locale(ktp-approver:eu) locale(ktp-approver:fi) locale(ktp-approver:fr) locale(ktp-approver:ga) locale(ktp-approver:gl) locale(ktp-approver:hi) locale(ktp-approver:hu) locale(ktp-approver:ia) locale(ktp-approver:it) locale(ktp-approver:ja) locale(ktp-approver:ka) locale(ktp-approver:kk) locale(ktp-approver:km) locale(ktp-approver:ko) locale(ktp-approver:lt) locale(ktp-approver:mr) locale(ktp-approver:nb) locale(ktp-approver:nds) locale(ktp-approver:nl) locale(ktp-approver:nn) locale(ktp-approver:pa) locale(ktp-approver:pl) locale(ktp-approver:pt) locale(ktp-approver:pt_BR) locale(ktp-approver:ro) locale(ktp-approver:ru) locale(ktp-approver:sk) locale(ktp-approver:sl) locale(ktp-approver:sr) locale(ktp-approver:sr@ijekavian) locale(ktp-approver:sr@ijekavianlatin) locale(ktp-approver:sr@latin) locale(ktp-approver:sv) locale(ktp-approver:tr) locale(ktp-approver:ug) locale(ktp-approver:uk) locale(ktp-approver:zh_CN) locale(ktp-approver:zh_TW)"
RDEPENDS:${PN} += "ktp-approver"

inherit rpm
