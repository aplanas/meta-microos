SUMMARY = "Translations for package nextcloud-desktop"
DESCRIPTION = "Provides translations for the 'nextcloud-desktop' package."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "3.8.2"

RPM_NAME = "nextcloud-desktop-lang-3.8.2-1.1.noarch.rpm"
RPM_HASH = "2c8d072ddc0a9d3e5bf3f2dfe737e571495a40d25149c4564222f0794f7531080442d9cb7cb5bdb59c8c8bde81c8896816ca73c1e5921b059fd18fe2aa348646"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nextcloud-desktop-lang nextcloud-desktop-lang-all"
RDEPENDS:${PN} += "nextcloud-desktop"

inherit rpm
