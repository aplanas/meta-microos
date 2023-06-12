SUMMARY = "Translations for package secrets"
DESCRIPTION = "Provides translations for the 'secrets' package."
LICENSE = "GPL-3.0-or-later"

PV = "7.3"

RPM_NAME = "secrets-lang-7.3-1.1.noarch.rpm"
RPM_HASH = "d6465c9d511493371e2805cc2163eb70d8494d7fa4f50ec8f7de26252f9087d538628f59a7aa77d7ab5788363db2528c9873a54a2c6c5750145e011f8abd78e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(secrets:ca) \
locale(secrets:cs) \
locale(secrets:da) \
locale(secrets:de) \
locale(secrets:el) \
locale(secrets:en_GB) \
locale(secrets:es) \
locale(secrets:eu) \
locale(secrets:fi) \
locale(secrets:fr) \
locale(secrets:gl) \
locale(secrets:he) \
locale(secrets:hr) \
locale(secrets:hu) \
locale(secrets:id) \
locale(secrets:is) \
locale(secrets:it) \
locale(secrets:ka) \
locale(secrets:ko) \
locale(secrets:nb) \
locale(secrets:nl) \
locale(secrets:nn) \
locale(secrets:oc) \
locale(secrets:pa) \
locale(secrets:pl) \
locale(secrets:pt) \
locale(secrets:pt_BR) \
locale(secrets:ro) \
locale(secrets:ru) \
locale(secrets:sl) \
locale(secrets:sr) \
locale(secrets:sv) \
locale(secrets:tr) \
locale(secrets:uk) \
locale(secrets:vi) \
locale(secrets:zh_CN) \
secrets-lang \
secrets-lang-all"
RDEPENDS:${PN} += "secrets"

inherit rpm
