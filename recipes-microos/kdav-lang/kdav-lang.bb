SUMMARY = "Translations for package kdav"
DESCRIPTION = "Provides translations for the 'kdav' package."
LICENSE = "LGPL-2.0-or-later"

PV = "5.105.0"

RPM_NAME = "kdav-lang-5.105.0-1.1.noarch.rpm"
RPM_HASH = "f5383351a3495e564edd057c8a047d6951f473cd29dbb1d6ca2c67696183ec1c16e691ea90a0b0c49c4337c69860aa1cf2e8c0a7cde54a447f544771d81b5a3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdav-lang kdav-lang-all locale(kdav:ar) locale(kdav:az) locale(kdav:bg) locale(kdav:ca) locale(kdav:ca@valencia) locale(kdav:cs) locale(kdav:de) locale(kdav:el) locale(kdav:en_GB) locale(kdav:es) locale(kdav:et) locale(kdav:eu) locale(kdav:fi) locale(kdav:fr) locale(kdav:gl) locale(kdav:hi) locale(kdav:ia) locale(kdav:it) locale(kdav:ja) locale(kdav:ka) locale(kdav:ko) locale(kdav:lt) locale(kdav:nb) locale(kdav:nl) locale(kdav:nn) locale(kdav:pl) locale(kdav:pt) locale(kdav:pt_BR) locale(kdav:ro) locale(kdav:ru) locale(kdav:sk) locale(kdav:sl) locale(kdav:sr) locale(kdav:sr@ijekavian) locale(kdav:sr@ijekavianlatin) locale(kdav:sr@latin) locale(kdav:sv) locale(kdav:tr) locale(kdav:uk) locale(kdav:zh_CN) locale(kdav:zh_TW)"
RDEPENDS:${PN} += "kdav"

inherit rpm
