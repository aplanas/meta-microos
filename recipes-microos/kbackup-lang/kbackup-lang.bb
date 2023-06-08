SUMMARY = "Translations for package kbackup"
DESCRIPTION = "Provides translations for the 'kbackup' package."
LICENSE = "GPL-2.0-only"

PV = "23.04.0"

RPM_NAME = "kbackup-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "bf4da97bc327d97e758d9a8d4cfb1eea16f36aa25f18d0b8beb379af7695ee0244c4a9bdcd16f6136ac538ea2342bdbbef464f058b52bfe1f3fbd6ea562c2257"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kbackup-lang kbackup-lang-all locale(kbackup:ar) locale(kbackup:ca) locale(kbackup:ca@valencia) locale(kbackup:cs) locale(kbackup:da) locale(kbackup:de) locale(kbackup:el) locale(kbackup:en_GB) locale(kbackup:es) locale(kbackup:et) locale(kbackup:eu) locale(kbackup:fi) locale(kbackup:fr) locale(kbackup:gl) locale(kbackup:ia) locale(kbackup:it) locale(kbackup:ja) locale(kbackup:ka) locale(kbackup:ko) locale(kbackup:lt) locale(kbackup:nl) locale(kbackup:nn) locale(kbackup:pl) locale(kbackup:pt) locale(kbackup:pt_BR) locale(kbackup:ru) locale(kbackup:sk) locale(kbackup:sl) locale(kbackup:sv) locale(kbackup:tr) locale(kbackup:uk) locale(kbackup:zh_CN) locale(kbackup:zh_TW)"
RDEPENDS:${PN} += "kbackup"

inherit rpm
