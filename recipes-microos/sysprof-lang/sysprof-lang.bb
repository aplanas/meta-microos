SUMMARY = "Translations for package sysprof"
DESCRIPTION = "Provides translations for the 'sysprof' package."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.48.0"

RPM_NAME = "sysprof-lang-3.48.0-2.1.noarch.rpm"
RPM_HASH = "d351fc59bbe34bcc687b33f3aeef070242a2ae36505d00526071385bdd81e39e981e69f3e6173ae064b9af9976a286fbdb03cb1c245dca90d1ea3db994e31251"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(sysprof:ca) locale(sysprof:cs) locale(sysprof:da) locale(sysprof:de) locale(sysprof:el) locale(sysprof:es) locale(sysprof:eu) locale(sysprof:fi) locale(sysprof:fr) locale(sysprof:fur) locale(sysprof:gl) locale(sysprof:he) locale(sysprof:hu) locale(sysprof:id) locale(sysprof:it) locale(sysprof:ka) locale(sysprof:ko) locale(sysprof:nl) locale(sysprof:pl) locale(sysprof:pt) locale(sysprof:pt_BR) locale(sysprof:ro) locale(sysprof:ru) locale(sysprof:sk) locale(sysprof:sl) locale(sysprof:sr) locale(sysprof:sv) locale(sysprof:uk) locale(sysprof:zh_CN) sysprof-lang sysprof-lang-all"
RDEPENDS:${PN} += "sysprof"

inherit rpm
