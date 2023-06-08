SUMMARY = "Translations for package libiptcdata"
DESCRIPTION = "Provides translations for the 'libiptcdata' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.5"

RPM_NAME = "libiptcdata-lang-1.0.5-1.10.noarch.rpm"
RPM_HASH = "6f305b6d611e267b1dbbbf7bf0bda0084a3fbf18922aede8453077b7110ce0cd4a618ba8f5c14679c6a84543efca1016157d3ff1883e2ec43256710197f24456"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libiptcdata-lang libiptcdata-lang-all locale(libiptcdata:de) locale(libiptcdata:it)"
RDEPENDS:${PN} += "libiptcdata"

inherit rpm
