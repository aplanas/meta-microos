SUMMARY = "Creates a tar archive from local directory"
DESCRIPTION = "Creates a tar archive from local directory"
LICENSE = "GPL-2.0-or-later"

PV = "0.10.34.1667392550.026bf0e"

RPM_NAME = "obs-service-tar-0.10.34.1667392550.026bf0e-1.2.noarch.rpm"
RPM_HASH = "cd2d8e7fd16c02bfd2cd902682c4368779a8ec4729022a465244bbe3ffd744cd9df7042ee2fc147ce45e84076dac0d700d4ba705ff986e4a25ebb1a377653a0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-tar obs-service-tar_scm:/usr/lib/obs/service/tar.service"
RDEPENDS:${PN} += "obs-service-obs_scm-common"

inherit rpm
