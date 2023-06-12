SUMMARY = "Translations for package kwave"
DESCRIPTION = "Provides translations for the 'kwave' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kwave-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "e28a8b66547ea20ec1403db4368b8659e3124d8159b6492cb4319c5d2e56a8e57cf8f0a7f5ea9216d50510c89096444c0e633b8a3d94ddb2e7d64a5c6cd40275"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kwave-lang kwave-lang-all locale(kwave:bs) locale(kwave:ca) locale(kwave:ca@valencia) locale(kwave:cs) locale(kwave:da) locale(kwave:de) locale(kwave:el) locale(kwave:en_GB) locale(kwave:es) locale(kwave:et) locale(kwave:eu) locale(kwave:fi) locale(kwave:fr) locale(kwave:gl) locale(kwave:ia) locale(kwave:it) locale(kwave:ja) locale(kwave:ka) locale(kwave:ko) locale(kwave:lt) locale(kwave:nl) locale(kwave:pl) locale(kwave:pt) locale(kwave:pt_BR) locale(kwave:ru) locale(kwave:sk) locale(kwave:sl) locale(kwave:sv) locale(kwave:tr) locale(kwave:uk) locale(kwave:zh_CN) locale(kwave:zh_TW)"
RDEPENDS:${PN} += "kwave"

inherit rpm
