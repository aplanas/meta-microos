SUMMARY = "Hatch plugin for versioning with your preferred VCS"
DESCRIPTION = "This provides a plugin for Hatch that uses your preferred version control system (like Git) to determine project versions."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python311-hatch_vcs-0.3.0-5.1.noarch.rpm"
RPM_HASH = "cc3039afb5be6d09beb6721dbcd3c2b8031f292a8cbdd3f8fec2536e4db134bbd4973f99ee3cd173a2015bc3d9189baaf8798f7c4e9cf97503336f836459e7e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(hatch-vcs) \
python311-hatch-vcs \
python311-hatch_vcs \
python3dist(hatch-vcs)"
RDEPENDS:${PN} += "(python311-setuptools_scm >= 6.4.0) \
python(abi) \
python311-hatchling"

inherit rpm
