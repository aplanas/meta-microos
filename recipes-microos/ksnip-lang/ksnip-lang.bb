SUMMARY = "Translations for package ksnip"
DESCRIPTION = "Provides translations for the 'ksnip' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.10.1"

RPM_NAME = "ksnip-lang-1.10.1-1.1.noarch.rpm"
RPM_HASH = "989798fc6e0e339d625b761064fcc885fc0aaedf7ca5c86dc878b56514377b50acac70d3a7db38ba9a9c5d0239faaa2d6f42c81b293d1e261251f0334f06a81c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ksnip-lang ksnip-lang-all"
RDEPENDS:${PN} += "ksnip"

inherit rpm
