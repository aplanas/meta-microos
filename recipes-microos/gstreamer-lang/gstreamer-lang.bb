SUMMARY = "Translations for package gstreamer"
DESCRIPTION = "Provides translations for the 'gstreamer' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "gstreamer-lang-1.22.2-1.1.noarch.rpm"
RPM_HASH = "b0b9fa244484860bb04a271b88a5adb0541632c263cd2313bac95f9d071157b9c6d1905d4e47d22c80dd83c1118fe88ad4c3f8ba70236046101be9d7c1bccac8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gstreamer-lang gstreamer-lang-all locale(gstreamer:af) locale(gstreamer:ast) locale(gstreamer:az) locale(gstreamer:be) locale(gstreamer:bg) locale(gstreamer:ca) locale(gstreamer:cs) locale(gstreamer:da) locale(gstreamer:de) locale(gstreamer:el) locale(gstreamer:en_GB) locale(gstreamer:eo) locale(gstreamer:es) locale(gstreamer:eu) locale(gstreamer:fi) locale(gstreamer:fr) locale(gstreamer:fur) locale(gstreamer:gl) locale(gstreamer:hr) locale(gstreamer:hu) locale(gstreamer:id) locale(gstreamer:it) locale(gstreamer:ja) locale(gstreamer:ka) locale(gstreamer:ko) locale(gstreamer:lt) locale(gstreamer:nb) locale(gstreamer:nl) locale(gstreamer:pl) locale(gstreamer:pt_BR) locale(gstreamer:ro) locale(gstreamer:ru) locale(gstreamer:sk) locale(gstreamer:sl) locale(gstreamer:sq) locale(gstreamer:sr) locale(gstreamer:sv) locale(gstreamer:tr) locale(gstreamer:uk) locale(gstreamer:vi) locale(gstreamer:zh_CN) locale(gstreamer:zh_TW)"
RDEPENDS:${PN} += "gstreamer"

inherit rpm
