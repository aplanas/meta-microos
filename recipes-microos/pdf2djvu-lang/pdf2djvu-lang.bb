SUMMARY = "Translations for package pdf2djvu"
DESCRIPTION = "Provides translations for the 'pdf2djvu' package."
LICENSE = "GPL-2.0-only"

PV = "0.9.19"

RPM_NAME = "pdf2djvu-lang-0.9.19-3.5.noarch.rpm"
RPM_HASH = "4f5d9c8853a37b2af32b79480105f5e9eb440779b3b238bbf1c36495653b77034f95b0abe76101b419d268437f84b3e5758687b70a47e51630583360e78acc7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(pdf2djvu:de) locale(pdf2djvu:pl) locale(pdf2djvu:pt) locale(pdf2djvu:ru) locale(pdf2djvu:uk) pdf2djvu-lang pdf2djvu-lang-all"
RDEPENDS:${PN} += "pdf2djvu"

inherit rpm
