SUMMARY = "Translations for package ktp-desktop-applets"
DESCRIPTION = "Provides translations for the 'ktp-desktop-applets' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "ktp-desktop-applets-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "03a7b3c25e9c7b2b9111a02b272d08d5777682caeeaae8778f0cd0c09afb90eb973e281fa03b5f20b098d3d15dac131dc8762b055f00bd3eab897cd59e7bb930"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ktp-desktop-applets-lang ktp-desktop-applets-lang-all locale(ktp-desktop-applets:ar) locale(ktp-desktop-applets:ca) locale(ktp-desktop-applets:ca@valencia) locale(ktp-desktop-applets:cs) locale(ktp-desktop-applets:da) locale(ktp-desktop-applets:de) locale(ktp-desktop-applets:el) locale(ktp-desktop-applets:en_GB) locale(ktp-desktop-applets:es) locale(ktp-desktop-applets:et) locale(ktp-desktop-applets:eu) locale(ktp-desktop-applets:fi) locale(ktp-desktop-applets:fr) locale(ktp-desktop-applets:gl) locale(ktp-desktop-applets:hi) locale(ktp-desktop-applets:ia) locale(ktp-desktop-applets:it) locale(ktp-desktop-applets:ja) locale(ktp-desktop-applets:ka) locale(ktp-desktop-applets:ko) locale(ktp-desktop-applets:lt) locale(ktp-desktop-applets:nl) locale(ktp-desktop-applets:nn) locale(ktp-desktop-applets:pl) locale(ktp-desktop-applets:pt) locale(ktp-desktop-applets:pt_BR) locale(ktp-desktop-applets:ro) locale(ktp-desktop-applets:ru) locale(ktp-desktop-applets:sk) locale(ktp-desktop-applets:sl) locale(ktp-desktop-applets:sr) locale(ktp-desktop-applets:sr@ijekavian) locale(ktp-desktop-applets:sr@ijekavianlatin) locale(ktp-desktop-applets:sr@latin) locale(ktp-desktop-applets:sv) locale(ktp-desktop-applets:tr) locale(ktp-desktop-applets:uk) locale(ktp-desktop-applets:zh_CN) locale(ktp-desktop-applets:zh_TW)"
RDEPENDS:${PN} += "ktp-desktop-applets"

inherit rpm
