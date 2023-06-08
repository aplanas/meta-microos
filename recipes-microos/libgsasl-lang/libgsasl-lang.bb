SUMMARY = "Translations for package libgsasl"
DESCRIPTION = "Provides translations for the 'libgsasl' package."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.10.0"

RPM_NAME = "libgsasl-lang-1.10.0-5.2.noarch.rpm"
RPM_HASH = "4dde337193877505f991708960b94fffed84d24b10d76ca06f94cf93059986d7c670bf76b4e1c67aa4abe1d3b08db995fd1f7e047738d2c7e0d5ffd81a042103"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libgsasl-lang libgsasl-lang-all locale(libgsasl:da) locale(libgsasl:de) locale(libgsasl:en@boldquot) locale(libgsasl:en@quot) locale(libgsasl:eo) locale(libgsasl:es) locale(libgsasl:fi) locale(libgsasl:fr) locale(libgsasl:ga) locale(libgsasl:hu) locale(libgsasl:id) locale(libgsasl:it) locale(libgsasl:nl) locale(libgsasl:pl) locale(libgsasl:pt_BR) locale(libgsasl:ro) locale(libgsasl:sk) locale(libgsasl:sr) locale(libgsasl:sv) locale(libgsasl:uk) locale(libgsasl:vi) locale(libgsasl:zh_CN)"
RDEPENDS:${PN} += "libgsasl"

inherit rpm
