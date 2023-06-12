SUMMARY = "Translations for package gstreamer-plugins-good"
DESCRIPTION = "Provides translations for the 'gstreamer-plugins-good' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "gstreamer-plugins-good-lang-1.22.3-1.1.noarch.rpm"
RPM_HASH = "1441dbc17801209c12490be7b454c0add4bf132c085fd8124b8db41127058716288bbb36e616a998f7d6d0d64c2f8d0875eed4231c09813d7581714d5a9f0969"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gstreamer-plugins-good-lang \
gstreamer-plugins-good-lang-all \
locale(gstreamer-plugins-good:af) \
locale(gstreamer-plugins-good:az) \
locale(gstreamer-plugins-good:bg) \
locale(gstreamer-plugins-good:ca) \
locale(gstreamer-plugins-good:cs) \
locale(gstreamer-plugins-good:da) \
locale(gstreamer-plugins-good:de) \
locale(gstreamer-plugins-good:el) \
locale(gstreamer-plugins-good:en_GB) \
locale(gstreamer-plugins-good:eo) \
locale(gstreamer-plugins-good:es) \
locale(gstreamer-plugins-good:eu) \
locale(gstreamer-plugins-good:fi) \
locale(gstreamer-plugins-good:fr) \
locale(gstreamer-plugins-good:fur) \
locale(gstreamer-plugins-good:gl) \
locale(gstreamer-plugins-good:hr) \
locale(gstreamer-plugins-good:hu) \
locale(gstreamer-plugins-good:id) \
locale(gstreamer-plugins-good:it) \
locale(gstreamer-plugins-good:ja) \
locale(gstreamer-plugins-good:ka) \
locale(gstreamer-plugins-good:lt) \
locale(gstreamer-plugins-good:lv) \
locale(gstreamer-plugins-good:nb) \
locale(gstreamer-plugins-good:nl) \
locale(gstreamer-plugins-good:or) \
locale(gstreamer-plugins-good:pl) \
locale(gstreamer-plugins-good:pt_BR) \
locale(gstreamer-plugins-good:ro) \
locale(gstreamer-plugins-good:ru) \
locale(gstreamer-plugins-good:sk) \
locale(gstreamer-plugins-good:sl) \
locale(gstreamer-plugins-good:sq) \
locale(gstreamer-plugins-good:sr) \
locale(gstreamer-plugins-good:sv) \
locale(gstreamer-plugins-good:tr) \
locale(gstreamer-plugins-good:uk) \
locale(gstreamer-plugins-good:vi) \
locale(gstreamer-plugins-good:zh_CN) \
locale(gstreamer-plugins-good:zh_HK) \
locale(gstreamer-plugins-good:zh_TW)"
RDEPENDS:${PN} += "gstreamer-plugins-good"

inherit rpm
