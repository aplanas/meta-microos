SUMMARY = "Translations for package krecorder"
DESCRIPTION = "Provides translations for the 'krecorder' package."
LICENSE = "GPL-3.0-or-later"

PV = "23.04.0"

RPM_NAME = "krecorder-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "4a731c65b1d8fb88f5678afaeeac9194da3e4a4b0913b62ca2aa339f0e467d1da3e1d8c28738b6e9280dcc50451200c10b43c6421e7737d556c4e7b424673775"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "krecorder-lang krecorder-lang-all locale(krecorder:ar) locale(krecorder:ca) locale(krecorder:ca@valencia) locale(krecorder:cs) locale(krecorder:de) locale(krecorder:el) locale(krecorder:en_GB) locale(krecorder:es) locale(krecorder:fi) locale(krecorder:fr) locale(krecorder:it) locale(krecorder:ja) locale(krecorder:ka) locale(krecorder:ko) locale(krecorder:lt) locale(krecorder:nl) locale(krecorder:nn) locale(krecorder:pa) locale(krecorder:pl) locale(krecorder:pt) locale(krecorder:pt_BR) locale(krecorder:ro) locale(krecorder:ru) locale(krecorder:sk) locale(krecorder:sl) locale(krecorder:sv) locale(krecorder:tr) locale(krecorder:uk) locale(krecorder:zh_CN) locale(krecorder:zh_TW)"
RDEPENDS:${PN} += "krecorder"

inherit rpm
