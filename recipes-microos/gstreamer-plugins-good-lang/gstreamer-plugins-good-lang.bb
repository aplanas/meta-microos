SUMMARY = "Translations for package gstreamer-plugins-good"
DESCRIPTION = "Provides translations for the 'gstreamer-plugins-good' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "gstreamer-plugins-good-lang-1.22.2-1.1.noarch.rpm"
RPM_HASH = "2231389e6a917d9c3ed1b1d706fd81030cfecb64ca7a8e3b0e6903da323ea434a7be9058b365f1033f56a46371a31ba76a66a2be0b37bcc2c13ff046aca697a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gstreamer-plugins-good-lang gstreamer-plugins-good-lang-all locale(gstreamer-plugins-good:af) locale(gstreamer-plugins-good:az) locale(gstreamer-plugins-good:bg) locale(gstreamer-plugins-good:ca) locale(gstreamer-plugins-good:cs) locale(gstreamer-plugins-good:da) locale(gstreamer-plugins-good:de) locale(gstreamer-plugins-good:el) locale(gstreamer-plugins-good:en_GB) locale(gstreamer-plugins-good:eo) locale(gstreamer-plugins-good:es) locale(gstreamer-plugins-good:eu) locale(gstreamer-plugins-good:fi) locale(gstreamer-plugins-good:fr) locale(gstreamer-plugins-good:fur) locale(gstreamer-plugins-good:gl) locale(gstreamer-plugins-good:hr) locale(gstreamer-plugins-good:hu) locale(gstreamer-plugins-good:id) locale(gstreamer-plugins-good:it) locale(gstreamer-plugins-good:ja) locale(gstreamer-plugins-good:ka) locale(gstreamer-plugins-good:lt) locale(gstreamer-plugins-good:lv) locale(gstreamer-plugins-good:nb) locale(gstreamer-plugins-good:nl) locale(gstreamer-plugins-good:or) locale(gstreamer-plugins-good:pl) locale(gstreamer-plugins-good:pt_BR) locale(gstreamer-plugins-good:ro) locale(gstreamer-plugins-good:ru) locale(gstreamer-plugins-good:sk) locale(gstreamer-plugins-good:sl) locale(gstreamer-plugins-good:sq) locale(gstreamer-plugins-good:sr) locale(gstreamer-plugins-good:sv) locale(gstreamer-plugins-good:tr) locale(gstreamer-plugins-good:uk) locale(gstreamer-plugins-good:vi) locale(gstreamer-plugins-good:zh_CN) locale(gstreamer-plugins-good:zh_HK) locale(gstreamer-plugins-good:zh_TW)"
RDEPENDS:${PN} += "gstreamer-plugins-good"

inherit rpm
