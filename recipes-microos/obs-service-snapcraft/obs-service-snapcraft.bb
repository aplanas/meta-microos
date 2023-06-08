SUMMARY = "Handles source downloads defined in snapcraft.yaml files"
DESCRIPTION = "Experimental snapcraft support: This parses snapcraft.yaml files for SCM \
resources and packages them."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.34.1667392550.026bf0e"

RPM_NAME = "obs-service-snapcraft-0.10.34.1667392550.026bf0e-1.2.noarch.rpm"
RPM_HASH = "eed9bdf4060bb9fd1b5427ca888999c8b898a3b15199e95c288d7f516d20286890f042b82183d75eb4a6cd46f0dd03afa6752a206f8a21ad2267f8e24baa4fa2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-snapcraft obs-service-tar_scm:/usr/lib/obs/service/snapcraft.service"
RDEPENDS:${PN} += "git-core obs-service-obs_scm-common"

inherit rpm
