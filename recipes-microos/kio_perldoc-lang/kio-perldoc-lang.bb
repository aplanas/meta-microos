SUMMARY = "Translations for package kio_perldoc"
DESCRIPTION = "Provides translations for the 'kio_perldoc' package."
LICENSE = "GPL-2.0-only"

PV = "23.04.0"

RPM_NAME = "kio_perldoc-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "2b9fbc3904e0a6f6386379d1ab28507cc3eab222026c6d128270a2c4cb293ba46df7200364735e594a4f782142cd23ddc80f976a3227e8e80ced672d99c02824"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kio_perldoc-lang kio_perldoc-lang-all locale(kio_perldoc:bs) locale(kio_perldoc:ca) locale(kio_perldoc:ca@valencia) locale(kio_perldoc:cs) locale(kio_perldoc:da) locale(kio_perldoc:de) locale(kio_perldoc:el) locale(kio_perldoc:en_GB) locale(kio_perldoc:eo) locale(kio_perldoc:es) locale(kio_perldoc:et) locale(kio_perldoc:eu) locale(kio_perldoc:fi) locale(kio_perldoc:fr) locale(kio_perldoc:ga) locale(kio_perldoc:gl) locale(kio_perldoc:hi) locale(kio_perldoc:hu) locale(kio_perldoc:it) locale(kio_perldoc:ja) locale(kio_perldoc:ka) locale(kio_perldoc:kk) locale(kio_perldoc:ko) locale(kio_perldoc:lt) locale(kio_perldoc:mr) locale(kio_perldoc:nb) locale(kio_perldoc:nds) locale(kio_perldoc:nl) locale(kio_perldoc:nn) locale(kio_perldoc:pa) locale(kio_perldoc:pl) locale(kio_perldoc:pt) locale(kio_perldoc:pt_BR) locale(kio_perldoc:ru) locale(kio_perldoc:sk) locale(kio_perldoc:sl) locale(kio_perldoc:sq) locale(kio_perldoc:sv) locale(kio_perldoc:tr) locale(kio_perldoc:ug) locale(kio_perldoc:uk) locale(kio_perldoc:zh_CN) locale(kio_perldoc:zh_TW)"
RDEPENDS:${PN} += "kio_perldoc"

inherit rpm
