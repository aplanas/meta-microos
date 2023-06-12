SUMMARY = "Handles source downloads defined in appimage.yml files"
DESCRIPTION = "Experimental appimage support: This parses appimage.yml files for SCM \
resources and packages them."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.36"

RPM_NAME = "obs-service-appimage-0.10.36-1.1.noarch.rpm"
RPM_HASH = "bd9a9b638d36d106cd0be0bdf6271302413a1793ea196f3a81b9f199e33e918dd770e7a9349ced7208052178a38469e1752f74f43090f8b342452ce3e9b43a9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-appimage"
RDEPENDS:${PN} += "git-core obs-service-obs_scm-common"

inherit rpm
