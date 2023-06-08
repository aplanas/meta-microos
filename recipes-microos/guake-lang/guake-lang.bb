SUMMARY = "Translations for package guake"
DESCRIPTION = "Provides translations for the 'guake' package."
LICENSE = "GPL-2.0-only"

PV = "3.9.0"

RPM_NAME = "guake-lang-3.9.0-1.3.noarch.rpm"
RPM_HASH = "c4594b4616d68ad58906fca6cd5ccdc613a160a54452c0246a46975238a00bb749331378b4642b5c49d22a707abbc695b091d3aecebc5f345b6c8689949d635f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "guake-lang guake-lang-all locale(guake:ca) locale(guake:cs) locale(guake:de) locale(guake:el) locale(guake:es) locale(guake:fa) locale(guake:fi) locale(guake:fr) locale(guake:gl) locale(guake:hr) locale(guake:hu) locale(guake:id) locale(guake:it) locale(guake:ja) locale(guake:ko) locale(guake:nb) locale(guake:nl) locale(guake:pa) locale(guake:pl) locale(guake:pt_BR) locale(guake:ru) locale(guake:sv) locale(guake:tr) locale(guake:uk) locale(guake:zh_CN) locale(guake:zh_TW)"
RDEPENDS:${PN} += "guake"

inherit rpm
