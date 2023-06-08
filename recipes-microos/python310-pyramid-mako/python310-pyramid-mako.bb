SUMMARY = "Mako template bindings for the Pyramid web framework"
DESCRIPTION = "Mako template bindings for the Pyramid web framework."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "python310-pyramid-mako-1.1.0-3.8.noarch.rpm"
RPM_HASH = "75d57defa38a74a6c186c462555d89a6e01935f372b4dfafa3010867a4b4aed37643fdd660a995bf5b9d4cb8cb5617d34890dc280a1b7ea1ed94773c6b7171fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyramid-mako python3.10dist(pyramid-mako) python310-pyramid-mako python3dist(pyramid-mako)"
RDEPENDS:${PN} += "python(abi) python310-Mako python310-pyramid"

inherit rpm
