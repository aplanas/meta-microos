SUMMARY = "Translations for package kded"
DESCRIPTION = "Provides translations for the 'kded' package."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "kded-lang-5.105.0-1.1.noarch.rpm"
RPM_HASH = "143e2c6f83e0acffe1e9f5e38ecfb606a77ecd1f9949eca1e741b5b083a0a1ef736e8ba332d576ec910716f226a5a433ed8d604e43cb64325fcb3e0b742d361a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kded-lang kded-lang-all"
RDEPENDS:${PN} += "kded"

inherit rpm
