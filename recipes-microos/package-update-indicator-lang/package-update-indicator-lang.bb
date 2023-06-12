SUMMARY = "Translations for package package-update-indicator"
DESCRIPTION = "Provides translations for the 'package-update-indicator' package."
LICENSE = "MIT"

PV = "8"

RPM_NAME = "package-update-indicator-lang-8-1.3.noarch.rpm"
RPM_HASH = "c69c2195c98bc4c06c2e8c423949bb101c1c4fe23afbb444d31c4b4b2ae91271af104e3bfe9cf316b68e77b501ec91664e0fc595d338a3111e7ecbaa629296d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(package-update-indicator:da) \
locale(package-update-indicator:de) \
locale(package-update-indicator:en) \
locale(package-update-indicator:fr) \
locale(package-update-indicator:id) \
locale(package-update-indicator:it) \
locale(package-update-indicator:nl) \
locale(package-update-indicator:pt_BR) \
locale(package-update-indicator:ru) \
package-update-indicator-lang \
package-update-indicator-lang-all"
RDEPENDS:${PN} += "package-update-indicator"

inherit rpm
