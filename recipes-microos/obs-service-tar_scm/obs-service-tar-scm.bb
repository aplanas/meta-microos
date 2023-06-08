SUMMARY = "An OBS source service: create tar ball from svn/git/hg"
DESCRIPTION = "This is a source service for openSUSE Build Service. \
 \
It supports downloading from svn, git, hg and bzr repositories."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.34.1667392550.026bf0e"

RPM_NAME = "obs-service-tar_scm-0.10.34.1667392550.026bf0e-1.2.noarch.rpm"
RPM_HASH = "a2ef24dbacd29a19c4e2415eaa8902efa5b03e6f7450c5cad5a1c1f628e644f16634c6f836186d2df085a5363966509ab6570e239eabc92b812b565b0d10ed78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-tar_scm"
RDEPENDS:${PN} += "/usr/bin/python3 git-core obs-service-obs_scm-common"

inherit rpm
