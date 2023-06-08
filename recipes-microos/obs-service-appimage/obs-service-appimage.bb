SUMMARY = "Handles source downloads defined in appimage.yml files"
DESCRIPTION = "Experimental appimage support: This parses appimage.yml files for SCM \
resources and packages them."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.34.1667392550.026bf0e"

RPM_NAME = "obs-service-appimage-0.10.34.1667392550.026bf0e-1.2.noarch.rpm"
RPM_HASH = "304d2767497d034f29483f1262a6a54d2db9e3a33bbbadb902962c214775a9e85973d0fceb654ec54b803498d392687c8a93c17781eed20537996e58a265c26b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-appimage"
RDEPENDS:${PN} += "git-core obs-service-obs_scm-common"

inherit rpm
