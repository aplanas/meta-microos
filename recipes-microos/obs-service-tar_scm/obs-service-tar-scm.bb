SUMMARY = "An OBS source service: create tar ball from svn/git/hg"
DESCRIPTION = "This is a source service for openSUSE Build Service. \
 \
It supports downloading from svn, git, hg and bzr repositories."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.36"

RPM_NAME = "obs-service-tar_scm-0.10.36-1.1.noarch.rpm"
RPM_HASH = "11ca78890d463e5cbd5c3a186dbc69a9a725fe398e05799bbe39761e512b541da6b5caf6e0ba292a3db9057aff4d890eea89df2d6c07ec62e676fe8ab108beb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-tar_scm"
RDEPENDS:${PN} += "/usr/bin/python3 git-core obs-service-obs_scm-common"

inherit rpm
