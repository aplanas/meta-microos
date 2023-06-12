SUMMARY = "Translations for package kbackup"
DESCRIPTION = "Provides translations for the 'kbackup' package."
LICENSE = "GPL-2.0-only"

PV = "23.04.1"

RPM_NAME = "kbackup-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "83cf8b42bb0ac802e7357ddb82baefc9f7a23374e51e7754048a9823b147b93215250705887c0fa2ec69f71fc6a4d598171b798b61c3b7f543e770fafbd23dba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kbackup-lang kbackup-lang-all locale(kbackup:ar) locale(kbackup:ca) locale(kbackup:ca@valencia) locale(kbackup:cs) locale(kbackup:da) locale(kbackup:de) locale(kbackup:el) locale(kbackup:en_GB) locale(kbackup:es) locale(kbackup:et) locale(kbackup:eu) locale(kbackup:fi) locale(kbackup:fr) locale(kbackup:gl) locale(kbackup:ia) locale(kbackup:it) locale(kbackup:ja) locale(kbackup:ka) locale(kbackup:ko) locale(kbackup:lt) locale(kbackup:nl) locale(kbackup:nn) locale(kbackup:pl) locale(kbackup:pt) locale(kbackup:pt_BR) locale(kbackup:ru) locale(kbackup:sk) locale(kbackup:sl) locale(kbackup:sv) locale(kbackup:tr) locale(kbackup:uk) locale(kbackup:zh_CN) locale(kbackup:zh_TW)"
RDEPENDS:${PN} += "kbackup"

inherit rpm
