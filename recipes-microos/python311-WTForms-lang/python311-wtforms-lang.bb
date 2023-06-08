SUMMARY = "Translations for builtin WTForms messages"
DESCRIPTION = "Translations for builtin WTForms messages. \
 \
WTForms is a forms validation and rendering library for Python web development."
LICENSE = "BSD-3-Clause"

PV = "3.0.1"

RPM_NAME = "python311-WTForms-lang-3.0.1-2.6.noarch.rpm"
RPM_HASH = "7307f13de9c9c5254b4c9fdcb0289a1a7f2a8b82a4da866d114517b39cfcc84d58b0e62391828f5160b7057d4a433a5f6e41dce150d04ebba22660c117461c5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(python311-WTForms:ar) locale(python311-WTForms:bg) locale(python311-WTForms:ca) locale(python311-WTForms:cs_CZ) locale(python311-WTForms:cy) locale(python311-WTForms:de) locale(python311-WTForms:de_CH) locale(python311-WTForms:el) locale(python311-WTForms:en) locale(python311-WTForms:es) locale(python311-WTForms:et) locale(python311-WTForms:fa) locale(python311-WTForms:fi) locale(python311-WTForms:fr) locale(python311-WTForms:he) locale(python311-WTForms:hu) locale(python311-WTForms:it) locale(python311-WTForms:ja) locale(python311-WTForms:ko) locale(python311-WTForms:nb) locale(python311-WTForms:nl) locale(python311-WTForms:pl) locale(python311-WTForms:pt) locale(python311-WTForms:ru) locale(python311-WTForms:sk) locale(python311-WTForms:sv) locale(python311-WTForms:tr) locale(python311-WTForms:uk) locale(python311-WTForms:zh) locale(python311-WTForms:zh_TW) python311-WTForms-lang"
RDEPENDS:${PN} += "python311-WTForms"

inherit rpm
