SUMMARY = "Translations for package gpg2"
DESCRIPTION = "Provides translations for the 'gpg2' package."
LICENSE = "GPL-3.0-or-later"

PV = "2.3.8"

RPM_NAME = "gpg2-lang-2.3.8-1.3.noarch.rpm"
RPM_HASH = "47d560b01eb0678d9fb8e6912833562ada04a759dbce266b1d636f876956d12fc9155725e5b13ebb35dfab10da2dc3baa4806d67edc5d7ce0e7b4ec399aebf45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gpg2-lang gpg2-lang-all locale(gpg2:ca) locale(gpg2:cs) locale(gpg2:da) locale(gpg2:de) locale(gpg2:el) locale(gpg2:eo) locale(gpg2:es) locale(gpg2:et) locale(gpg2:fi) locale(gpg2:fr) locale(gpg2:gl) locale(gpg2:hu) locale(gpg2:id) locale(gpg2:it) locale(gpg2:ja) locale(gpg2:nb) locale(gpg2:pl) locale(gpg2:pt) locale(gpg2:ro) locale(gpg2:ru) locale(gpg2:sk) locale(gpg2:sv) locale(gpg2:tr) locale(gpg2:uk) locale(gpg2:zh_CN) locale(gpg2:zh_TW)"
RDEPENDS:${PN} += "gpg2"

inherit rpm
