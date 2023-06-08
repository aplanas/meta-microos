SUMMARY = "Documentation for Kvantum engine"
DESCRIPTION = "This package provides instructions on how to change configuration or make new themes for Kvantum engine."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.10"

RPM_NAME = "kvantum-doc-1.0.10-1.1.noarch.rpm"
RPM_HASH = "813c0ed3418445e4785f743ac5a5ac919450d1ef9c3822d58ec5780891d17ab3e900074e889ad197b190afff582b8991e6b04586d0bdd6ff3cd857bb884cdbfb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kvantum-doc"
RDEPENDS:${PN} += ""

inherit rpm
