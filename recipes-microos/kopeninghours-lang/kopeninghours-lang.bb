SUMMARY = "Translations for package kopeninghours"
DESCRIPTION = "Provides translations for the 'kopeninghours' package."
LICENSE = "LGPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kopeninghours-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "1e872a9a886d90b908b89f388d5899be8a59c21dc3c592b1db9a27d441e86d4e497069c39bd0d5d8473e96d535261706c57f49932cfb0ed56a6ac380ec528164"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kopeninghours-lang kopeninghours-lang-all locale(kopeninghours:ca) locale(kopeninghours:ca@valencia) locale(kopeninghours:cs) locale(kopeninghours:de) locale(kopeninghours:en_GB) locale(kopeninghours:es) locale(kopeninghours:eu) locale(kopeninghours:fi) locale(kopeninghours:fr) locale(kopeninghours:hi) locale(kopeninghours:it) locale(kopeninghours:ja) locale(kopeninghours:ka) locale(kopeninghours:ko) locale(kopeninghours:lt) locale(kopeninghours:nl) locale(kopeninghours:nn) locale(kopeninghours:pl) locale(kopeninghours:pt) locale(kopeninghours:pt_BR) locale(kopeninghours:ro) locale(kopeninghours:ru) locale(kopeninghours:sk) locale(kopeninghours:sl) locale(kopeninghours:sv) locale(kopeninghours:tr) locale(kopeninghours:uk) locale(kopeninghours:zh_CN) locale(kopeninghours:zh_TW)"
RDEPENDS:${PN} += "kopeninghours"

inherit rpm
