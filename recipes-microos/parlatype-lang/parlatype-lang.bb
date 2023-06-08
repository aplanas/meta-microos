SUMMARY = "Translations for package parlatype"
DESCRIPTION = "Provides translations for the 'parlatype' package."
LICENSE = "GPL-3.0-or-later"

PV = "3.1"

RPM_NAME = "parlatype-lang-3.1-1.7.noarch.rpm"
RPM_HASH = "edec1aaa9317f840b543b25400c918e9cdf9b9d49b94e0500a1001f248b8e50a2f88f6c703bd4701c498349d975da3c4f19087377c216343d36d8a97075d6270"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(parlatype:ar) locale(parlatype:ca) locale(parlatype:cs) locale(parlatype:de) locale(parlatype:en_AU) locale(parlatype:en_GB) locale(parlatype:es) locale(parlatype:fi) locale(parlatype:fr) locale(parlatype:he) locale(parlatype:hu) locale(parlatype:id) locale(parlatype:it) locale(parlatype:ja) locale(parlatype:lt) locale(parlatype:lv) locale(parlatype:ms) locale(parlatype:nb_NO) locale(parlatype:nl) locale(parlatype:pl) locale(parlatype:pt) locale(parlatype:pt_BR) locale(parlatype:ru) locale(parlatype:sk) locale(parlatype:sr) locale(parlatype:sv) parlatype-lang parlatype-lang-all"
RDEPENDS:${PN} += "parlatype"

inherit rpm
