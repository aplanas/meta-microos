SUMMARY = "Translations for package kamera"
DESCRIPTION = "Provides translations for the 'kamera' package."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "kamera-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "119042673e0dce9a9533855a43cce990b8f86165621f2c71f6cc3b5c348de3873c058bac179f54e9b889796d85d6f1fce1d69e866c00c105c440a0cfd60e7153"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kamera-lang kamera-lang-all locale(kamera:af) locale(kamera:ar) locale(kamera:az) locale(kamera:be) locale(kamera:bg) locale(kamera:br) locale(kamera:bs) locale(kamera:ca) locale(kamera:ca@valencia) locale(kamera:cs) locale(kamera:cy) locale(kamera:da) locale(kamera:de) locale(kamera:el) locale(kamera:en_GB) locale(kamera:eo) locale(kamera:es) locale(kamera:et) locale(kamera:eu) locale(kamera:fa) locale(kamera:fi) locale(kamera:fr) locale(kamera:ga) locale(kamera:gl) locale(kamera:he) locale(kamera:hi) locale(kamera:hr) locale(kamera:hu) locale(kamera:ia) locale(kamera:is) locale(kamera:it) locale(kamera:ja) locale(kamera:ka) locale(kamera:kk) locale(kamera:km) locale(kamera:ko) locale(kamera:lt) locale(kamera:lv) locale(kamera:mk) locale(kamera:ml) locale(kamera:mr) locale(kamera:ms) locale(kamera:nb) locale(kamera:nds) locale(kamera:ne) locale(kamera:nl) locale(kamera:nn) locale(kamera:oc) locale(kamera:pa) locale(kamera:pl) locale(kamera:pt) locale(kamera:pt_BR) locale(kamera:ro) locale(kamera:ru) locale(kamera:si) locale(kamera:sk) locale(kamera:sl) locale(kamera:sq) locale(kamera:sv) locale(kamera:ta) locale(kamera:th) locale(kamera:tr) locale(kamera:ug) locale(kamera:uk) locale(kamera:vi) locale(kamera:zh_CN) locale(kamera:zh_HK) locale(kamera:zh_TW)"
RDEPENDS:${PN} += "kamera"

inherit rpm
