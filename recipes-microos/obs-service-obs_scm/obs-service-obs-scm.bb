SUMMARY = "Creates a OBS cpio from a remote SCM resource"
DESCRIPTION = "Creates a OBS cpio from a remote SCM resource. \
 \
This can be used to work directly in local git checkout and can be packaged \
into a tar ball during build time."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.34.1667392550.026bf0e"

RPM_NAME = "obs-service-obs_scm-0.10.34.1667392550.026bf0e-1.2.noarch.rpm"
RPM_HASH = "ad9a1293cced547159cafcaf6fa03433aec8e7978f6b31899ba45b9f1e1b78a86e599edb3c2821d550e1be84f2dc74483ca639e94bf8823962698ea8069771cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-obs_scm obs-service-tar_scm:/usr/lib/obs/service/obs_scm.service"
RDEPENDS:${PN} += "git-core obs-service-obs_scm-common"

inherit rpm
