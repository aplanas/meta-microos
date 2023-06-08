SUMMARY = "The 'Fixedsys Excelsior' font"
DESCRIPTION = "A TrueType (vector) font similar to Windows 2.x/3.x Fixedsys, \
enhanced with Unicode symbols."
LICENSE = "SUSE-Public-Domain"

PV = "3.02.9"

RPM_NAME = "kika-fixedsys-fonts-3.02.9-1.2.noarch.rpm"
RPM_HASH = "8b3b8b2aad925c7886fb7b317bf3f0c6c51c3cb4c6abeb0125f8be96a2e75dfe9f120ac74a4c903a3dc4896c97b9550dd1392008052f6fb4880b7a2155f7d1ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kika-fixedsys-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
