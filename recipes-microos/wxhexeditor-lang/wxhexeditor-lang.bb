SUMMARY = "Translations for package wxhexeditor"
DESCRIPTION = "Provides translations for the 'wxhexeditor' package."
LICENSE = "GPL-2.0-only"

PV = "0.24"

RPM_NAME = "wxhexeditor-lang-0.24-3.14.noarch.rpm"
RPM_HASH = "c840e4fbcbea7f393d83d7bfb39bcbddf8c45ba9cba499e48d7eb146cb1f3001f7623e51e60cee236becd1dd2203c7323f07db559b7a656eabe7cd3afd3b926a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(wxhexeditor:ar) \
locale(wxhexeditor:cs) \
locale(wxhexeditor:de) \
locale(wxhexeditor:es) \
locale(wxhexeditor:fr) \
locale(wxhexeditor:it) \
locale(wxhexeditor:pl) \
locale(wxhexeditor:pt_BR) \
locale(wxhexeditor:ro) \
locale(wxhexeditor:ru) \
locale(wxhexeditor:tr) \
locale(wxhexeditor:zh_CN) \
wxhexeditor-lang \
wxhexeditor-lang-all"
RDEPENDS:${PN} += "wxhexeditor"

inherit rpm
