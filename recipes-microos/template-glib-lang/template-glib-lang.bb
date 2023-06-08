SUMMARY = "Translations for package template-glib"
DESCRIPTION = "Provides translations for the 'template-glib' package."
LICENSE = "LGPL-2.1-or-later"

PV = "3.36.1"

RPM_NAME = "template-glib-lang-3.36.1-1.3.noarch.rpm"
RPM_HASH = "a1c0d76e21f226da6641702cd6475a9ed4d92040ca6373a4826d4a96329ebac2987d93aff1c3034cf6d4dc99d3727d6cfdbe17968999e9e15673da268dbd1147"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(template-glib:ca) locale(template-glib:cs) locale(template-glib:da) locale(template-glib:de) locale(template-glib:el) locale(template-glib:en_GB) locale(template-glib:es) locale(template-glib:eu) locale(template-glib:fr) locale(template-glib:fur) locale(template-glib:hr) locale(template-glib:hu) locale(template-glib:id) locale(template-glib:it) locale(template-glib:ka) locale(template-glib:lt) locale(template-glib:nl) locale(template-glib:pl) locale(template-glib:pt) locale(template-glib:pt_BR) locale(template-glib:ro) locale(template-glib:sl) locale(template-glib:sr) locale(template-glib:sv) locale(template-glib:tr) locale(template-glib:uk) locale(template-glib:zh_CN) template-glib-lang template-glib-lang-all"
RDEPENDS:${PN} += "template-glib"

inherit rpm
