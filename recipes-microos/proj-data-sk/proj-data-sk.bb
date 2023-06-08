SUMMARY = "Slovakia datum grids for Proj"
DESCRIPTION = "Slovakia datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.2.0"

RPM_NAME = "proj-data-sk-9.2.0-1.3.noarch.rpm"
RPM_HASH = "284cc4637653d0c2aa1dd9626faacf3bb7a69ba2abb8e8228b1792c4ab237f1c1ed623eb24df48940e2211d70040d8f4339c199dbaa9876c9d115475aad7322f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-sk"
RDEPENDS:${PN} += ""

inherit rpm
