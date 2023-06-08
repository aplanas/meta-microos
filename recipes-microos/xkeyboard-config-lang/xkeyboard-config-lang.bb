SUMMARY = "Translations for package xkeyboard-config"
DESCRIPTION = "Provides translations for the 'xkeyboard-config' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "2.38"

RPM_NAME = "xkeyboard-config-lang-2.38-2.1.noarch.rpm"
RPM_HASH = "0e14bd11ebebc7895db0bcd2241fd6cbfe686f922e1ac171ec31640c0b0cd5271f69377988b7178f65ef6d29d20e37c64051cb51ea0cc2a5be7d45f9013f8edc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(xkeyboard-config:af) locale(xkeyboard-config:ar) locale(xkeyboard-config:az) locale(xkeyboard-config:bg) locale(xkeyboard-config:ca) locale(xkeyboard-config:cs) locale(xkeyboard-config:da) locale(xkeyboard-config:de) locale(xkeyboard-config:el) locale(xkeyboard-config:en_GB) locale(xkeyboard-config:eo) locale(xkeyboard-config:es) locale(xkeyboard-config:fi) locale(xkeyboard-config:fr) locale(xkeyboard-config:fur) locale(xkeyboard-config:gl) locale(xkeyboard-config:he) locale(xkeyboard-config:hr) locale(xkeyboard-config:hu) locale(xkeyboard-config:id) locale(xkeyboard-config:it) locale(xkeyboard-config:ja) locale(xkeyboard-config:ka) locale(xkeyboard-config:ko) locale(xkeyboard-config:lt) locale(xkeyboard-config:nb) locale(xkeyboard-config:nl) locale(xkeyboard-config:pl) locale(xkeyboard-config:pt) locale(xkeyboard-config:pt_BR) locale(xkeyboard-config:ro) locale(xkeyboard-config:ru) locale(xkeyboard-config:sk) locale(xkeyboard-config:sl) locale(xkeyboard-config:sq) locale(xkeyboard-config:sr) locale(xkeyboard-config:sv) locale(xkeyboard-config:tr) locale(xkeyboard-config:uk) locale(xkeyboard-config:vi) locale(xkeyboard-config:zh_CN) locale(xkeyboard-config:zh_TW) xkeyboard-config-lang xkeyboard-config-lang-all"
RDEPENDS:${PN} += "xkeyboard-config"

inherit rpm
