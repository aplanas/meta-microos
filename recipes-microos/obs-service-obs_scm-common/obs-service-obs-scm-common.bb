SUMMARY = "Common parts of SCM handling services"
DESCRIPTION = "This is a source service for openSUSE Build Service. \
 \
It supports downloading from svn, git, hg and bzr repositories. \
 \
This package holds the shared files for different services."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.34.1667392550.026bf0e"

RPM_NAME = "obs-service-obs_scm-common-0.10.34.1667392550.026bf0e-1.2.noarch.rpm"
RPM_HASH = "3812341c0bdebcc017818d00f06c7097dd44aec4991d3f8cbe16abc6523570cb30b6e8b42de14602bdf674b3ff561289f489a75502b1d83295518bcbfe2af656"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(obs-service-obs_scm-common) obs-service-obs_scm-common"
RDEPENDS:${PN} += "/usr/bin/python3 glibc-locale-base python3-PyYAML python3-dateutil"

inherit rpm
