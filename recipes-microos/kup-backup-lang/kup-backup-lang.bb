SUMMARY = "Translations for package kup-backup"
DESCRIPTION = "Provides translations for the 'kup-backup' package."
LICENSE = "GPL-2.0-only & GPL-3.0-only"

PV = "0.9.1"

RPM_NAME = "kup-backup-lang-0.9.1-2.5.noarch.rpm"
RPM_HASH = "fe17dcfa8e726b41b1b49ff77b84634a3a52f71008152741d3eafd15cb80cdca5a50a1cedcfa06f730de4853dd41724757cbdc1e4d58f6e0b29db1ca4ec4fbff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kup-backup-lang \
kup-backup-lang-all \
locale(kup-backup:bs) \
locale(kup-backup:ca) \
locale(kup-backup:ca@valencia) \
locale(kup-backup:cs) \
locale(kup-backup:da) \
locale(kup-backup:de) \
locale(kup-backup:en_GB) \
locale(kup-backup:es) \
locale(kup-backup:et) \
locale(kup-backup:eu) \
locale(kup-backup:fi) \
locale(kup-backup:fr) \
locale(kup-backup:hu) \
locale(kup-backup:it) \
locale(kup-backup:ko) \
locale(kup-backup:lt) \
locale(kup-backup:nl) \
locale(kup-backup:pl) \
locale(kup-backup:pt) \
locale(kup-backup:pt_BR) \
locale(kup-backup:ru) \
locale(kup-backup:sk) \
locale(kup-backup:sl) \
locale(kup-backup:sv) \
locale(kup-backup:uk) \
locale(kup-backup:zh_CN) \
locale(kup-backup:zh_TW)"
RDEPENDS:${PN} += "kup-backup"

inherit rpm
