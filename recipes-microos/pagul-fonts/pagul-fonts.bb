SUMMARY = "Pagul Fonts"
DESCRIPTION = "Pagul is a Free Font for Sourashtra Language with Unicode glyphs."
LICENSE = "SUSE-GPL-3.0-with-font-exception"

PV = "1.0"

RPM_NAME = "pagul-fonts-1.0-3.17.noarch.rpm"
RPM_HASH = "45c3ad3917c81d8737929ce178e016a538314499a02b510d7d1ea26796eb16bfbdbea6acecd96a776204ffde94370e45e3df57eaac7202fd99cf5bc8642da15a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pagul-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
