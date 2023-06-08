SUMMARY = "Translations for package kdb"
DESCRIPTION = "Provides translations for the 'kdb' package."
LICENSE = "LGPL-2.0-only"

PV = "3.2.0"

RPM_NAME = "kdb-lang-3.2.0-7.16.noarch.rpm"
RPM_HASH = "7fc0ff070b9ae93777e631b45d75275e104dfe82f7d7319ed4115349dfed40a3a3aa624f3b534e0b8380f790eacf39c6473e2d7c72bb2259cf5ab0822e7ae0e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdb-lang kdb-lang-all locale(kdb:ast) locale(kdb:ca) locale(kdb:ca@valencia) locale(kdb:cs) locale(kdb:de) locale(kdb:en) locale(kdb:en_GB) locale(kdb:es) locale(kdb:fi) locale(kdb:fr) locale(kdb:gl) locale(kdb:hu) locale(kdb:ia) locale(kdb:it) locale(kdb:ja) locale(kdb:ko) locale(kdb:lt) locale(kdb:nl) locale(kdb:nn) locale(kdb:pl) locale(kdb:pt) locale(kdb:pt_BR) locale(kdb:ru) locale(kdb:sk) locale(kdb:sv) locale(kdb:tr) locale(kdb:uk) locale(kdb:zh_CN) locale(kdb:zh_TW)"
RDEPENDS:${PN} += "kdb"

inherit rpm
