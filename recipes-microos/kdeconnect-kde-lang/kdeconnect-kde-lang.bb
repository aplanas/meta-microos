SUMMARY = "Translations for package kdeconnect-kde"
DESCRIPTION = "Provides translations for the 'kdeconnect-kde' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kdeconnect-kde-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "9fc70e084acd0f82bb97cfc38142f59c000d2b9d36eb931e39660a4cd3953697dffdf83a035e2d72a500156cf35bc6d5a49ae2e5706695db42cb68beab5e5d4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdeconnect-kde-lang kdeconnect-kde-lang-all locale(kdeconnect-kde:ar) locale(kdeconnect-kde:az) locale(kdeconnect-kde:bg) locale(kdeconnect-kde:bs) locale(kdeconnect-kde:ca) locale(kdeconnect-kde:ca@valencia) locale(kdeconnect-kde:cs) locale(kdeconnect-kde:da) locale(kdeconnect-kde:de) locale(kdeconnect-kde:el) locale(kdeconnect-kde:en_GB) locale(kdeconnect-kde:es) locale(kdeconnect-kde:et) locale(kdeconnect-kde:eu) locale(kdeconnect-kde:fi) locale(kdeconnect-kde:fr) locale(kdeconnect-kde:gl) locale(kdeconnect-kde:he) locale(kdeconnect-kde:hu) locale(kdeconnect-kde:ia) locale(kdeconnect-kde:id) locale(kdeconnect-kde:is) locale(kdeconnect-kde:it) locale(kdeconnect-kde:ja) locale(kdeconnect-kde:ka) locale(kdeconnect-kde:ko) locale(kdeconnect-kde:lt) locale(kdeconnect-kde:ml) locale(kdeconnect-kde:nl) locale(kdeconnect-kde:nn) locale(kdeconnect-kde:pl) locale(kdeconnect-kde:pt) locale(kdeconnect-kde:pt_BR) locale(kdeconnect-kde:ro) locale(kdeconnect-kde:ru) locale(kdeconnect-kde:sk) locale(kdeconnect-kde:sl) locale(kdeconnect-kde:sr) locale(kdeconnect-kde:sr@ijekavian) locale(kdeconnect-kde:sr@ijekavianlatin) locale(kdeconnect-kde:sr@latin) locale(kdeconnect-kde:sv) locale(kdeconnect-kde:ta) locale(kdeconnect-kde:tr) locale(kdeconnect-kde:uk) locale(kdeconnect-kde:zh_CN) locale(kdeconnect-kde:zh_TW)"
RDEPENDS:${PN} += "kdeconnect-kde"

inherit rpm
