SUMMARY = "Translations for package ksystemstats5"
DESCRIPTION = "Provides translations for the 'ksystemstats5' package."
LICENSE = "BSD-2-Clause & BSD-3-Clause & CC0-1.0 & GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "ksystemstats5-lang-5.27.5-1.1.noarch.rpm"
RPM_HASH = "6d70e423d22bad31f7ae443d4819f938e51134409d605f67a5064d5a96caf08634bba6661197ae350caee35bedbcb8e5d1b071ec3e0323bf84e86288db568340"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ksystemstats5-lang ksystemstats5-lang-all locale(ksystemstats5:ar) locale(ksystemstats5:az) locale(ksystemstats5:ca) locale(ksystemstats5:ca@valencia) locale(ksystemstats5:cs) locale(ksystemstats5:da) locale(ksystemstats5:de) locale(ksystemstats5:en_GB) locale(ksystemstats5:es) locale(ksystemstats5:et) locale(ksystemstats5:eu) locale(ksystemstats5:fi) locale(ksystemstats5:fr) locale(ksystemstats5:ia) locale(ksystemstats5:id) locale(ksystemstats5:it) locale(ksystemstats5:ja) locale(ksystemstats5:ka) locale(ksystemstats5:ko) locale(ksystemstats5:lt) locale(ksystemstats5:nl) locale(ksystemstats5:nn) locale(ksystemstats5:pa) locale(ksystemstats5:pl) locale(ksystemstats5:pt) locale(ksystemstats5:pt_BR) locale(ksystemstats5:ro) locale(ksystemstats5:ru) locale(ksystemstats5:sk) locale(ksystemstats5:sl) locale(ksystemstats5:sv) locale(ksystemstats5:tr) locale(ksystemstats5:uk) locale(ksystemstats5:vi) locale(ksystemstats5:zh_CN) locale(ksystemstats5:zh_TW)"
RDEPENDS:${PN} += "ksystemstats5"

inherit rpm
