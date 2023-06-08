SUMMARY = "Translations for package net-tools"
DESCRIPTION = "Provides translations for the 'net-tools' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.10"

RPM_NAME = "net-tools-lang-2.10-2.1.noarch.rpm"
RPM_HASH = "59403d439ad448074f252ff5ae8f8e16cdfad73f4e361feb4d9792ed34927fb42978f1d86fb3a2995561112ebd398c3c9a70ef8e9c2f7d0ea59b4d5165cae73f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(net-tools:cs) locale(net-tools:de) locale(net-tools:et) locale(net-tools:fr) locale(net-tools:pt_BR) net-tools-lang net-tools-lang-all"
RDEPENDS:${PN} += "net-tools"

inherit rpm
