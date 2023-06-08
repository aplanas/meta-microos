SUMMARY = "Translations for package gstreamer-plugins-bad"
DESCRIPTION = "Provides translations for the 'gstreamer-plugins-bad' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "gstreamer-plugins-bad-lang-1.22.2-3.1.noarch.rpm"
RPM_HASH = "2c1be61ec35ad800069383180743fc08f3d987c3b684f103b767aceec5b926df86e2eac78aa7569e984cde6d53cae5875151bf5bbd3d1b65ff6fae1c9edd26e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gstreamer-plugins-bad-lang gstreamer-plugins-bad-lang-all locale(gstreamer-plugins-bad:af) locale(gstreamer-plugins-bad:ast) locale(gstreamer-plugins-bad:az) locale(gstreamer-plugins-bad:bg) locale(gstreamer-plugins-bad:ca) locale(gstreamer-plugins-bad:cs) locale(gstreamer-plugins-bad:da) locale(gstreamer-plugins-bad:de) locale(gstreamer-plugins-bad:el) locale(gstreamer-plugins-bad:en_GB) locale(gstreamer-plugins-bad:eo) locale(gstreamer-plugins-bad:es) locale(gstreamer-plugins-bad:eu) locale(gstreamer-plugins-bad:fi) locale(gstreamer-plugins-bad:fr) locale(gstreamer-plugins-bad:fur) locale(gstreamer-plugins-bad:gl) locale(gstreamer-plugins-bad:hr) locale(gstreamer-plugins-bad:hu) locale(gstreamer-plugins-bad:id) locale(gstreamer-plugins-bad:it) locale(gstreamer-plugins-bad:ja) locale(gstreamer-plugins-bad:ka) locale(gstreamer-plugins-bad:lt) locale(gstreamer-plugins-bad:lv) locale(gstreamer-plugins-bad:nb) locale(gstreamer-plugins-bad:nl) locale(gstreamer-plugins-bad:or) locale(gstreamer-plugins-bad:pl) locale(gstreamer-plugins-bad:pt_BR) locale(gstreamer-plugins-bad:ro) locale(gstreamer-plugins-bad:ru) locale(gstreamer-plugins-bad:sk) locale(gstreamer-plugins-bad:sl) locale(gstreamer-plugins-bad:sq) locale(gstreamer-plugins-bad:sr) locale(gstreamer-plugins-bad:sv) locale(gstreamer-plugins-bad:tr) locale(gstreamer-plugins-bad:uk) locale(gstreamer-plugins-bad:vi) locale(gstreamer-plugins-bad:zh_CN) locale(gstreamer-plugins-bad:zh_TW)"
RDEPENDS:${PN} += "gstreamer-plugins-bad"

inherit rpm
