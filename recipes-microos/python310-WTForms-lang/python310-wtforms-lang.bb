SUMMARY = "Translations for builtin WTForms messages"
DESCRIPTION = "Translations for builtin WTForms messages. \
 \
WTForms is a forms validation and rendering library for Python web development."
LICENSE = "BSD-3-Clause"

PV = "3.0.1"

RPM_NAME = "python310-WTForms-lang-3.0.1-2.6.noarch.rpm"
RPM_HASH = "816e74240a95da2611e4ef363b487e9ab93ae8a879ee59eec634c238435c452277091cd6b62f75349f9033d291a0e56e2e529bc84cce7f4f87d6ee890515b7d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(python310-WTForms:ar) locale(python310-WTForms:bg) locale(python310-WTForms:ca) locale(python310-WTForms:cs_CZ) locale(python310-WTForms:cy) locale(python310-WTForms:de) locale(python310-WTForms:de_CH) locale(python310-WTForms:el) locale(python310-WTForms:en) locale(python310-WTForms:es) locale(python310-WTForms:et) locale(python310-WTForms:fa) locale(python310-WTForms:fi) locale(python310-WTForms:fr) locale(python310-WTForms:he) locale(python310-WTForms:hu) locale(python310-WTForms:it) locale(python310-WTForms:ja) locale(python310-WTForms:ko) locale(python310-WTForms:nb) locale(python310-WTForms:nl) locale(python310-WTForms:pl) locale(python310-WTForms:pt) locale(python310-WTForms:ru) locale(python310-WTForms:sk) locale(python310-WTForms:sv) locale(python310-WTForms:tr) locale(python310-WTForms:uk) locale(python310-WTForms:zh) locale(python310-WTForms:zh_TW) python3-WTForms-lang python310-WTForms-lang"
RDEPENDS:${PN} += "python310-WTForms"

inherit rpm
