SUMMARY = "Development files for river"
DESCRIPTION = "Modules for interacting or modifying the River Wayland compositor."
LICENSE = "GPL-3.0-only"

PV = "0.2.4+g109"

RPM_NAME = "river-devel-0.2.4+g109-3.1.noarch.rpm"
RPM_HASH = "3635592852968defe2c3a075eb8e8b297be11fcb9c4668273894d9b537a7ac901b1f0ef4847b2c410b32569fc4c90c32d196a167bd816a0d62c54a55d24fa772"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pkgconfig(river-protocols) river-devel"
RDEPENDS:${PN} += "/usr/bin/pkg-config river"

inherit rpm
