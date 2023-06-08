SUMMARY = "Translations for package gummi"
DESCRIPTION = "Provides translations for the 'gummi' package."
LICENSE = "MIT"

PV = "0.8.3"

RPM_NAME = "gummi-lang-0.8.3-1.6.noarch.rpm"
RPM_HASH = "7679adc81bec233df6f4dd894ca271249bef30f9c882fc20958216b1d51c2728f57164cfb2aae6f9a2686c7b24411e478f395d520b87dc24ae2bee006c9fb0c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gummi-lang gummi-lang-all locale(gummi:ar) locale(gummi:ca) locale(gummi:cs) locale(gummi:da) locale(gummi:de) locale(gummi:el) locale(gummi:es) locale(gummi:fr) locale(gummi:hu) locale(gummi:it) locale(gummi:nl) locale(gummi:pl) locale(gummi:pt) locale(gummi:pt_BR) locale(gummi:ro) locale(gummi:ru) locale(gummi:sv) locale(gummi:zh_CN) locale(gummi:zh_TW)"
RDEPENDS:${PN} += "gummi"

inherit rpm
