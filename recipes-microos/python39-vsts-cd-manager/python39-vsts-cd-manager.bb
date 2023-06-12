SUMMARY = "Python wrapper around some of the VSTS APIs"
DESCRIPTION = "Python wrapper around some of the VSTS APIs"
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "python39-vsts-cd-manager-1.0.2-4.4.noarch.rpm"
RPM_HASH = "12489bfab60588e43b529aae6aa53729f5d9367d67c1e4c36caa6923550d6ff62369c0df551b6bada5ff45cc35debb065d2873cc490a30bb9bf9f4a0e9e85d07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(vsts-cd-manager) \
python39-vsts-cd-manager \
python3dist(vsts-cd-manager)"
RDEPENDS:${PN} += "python(abi) \
python39-msrest"

inherit rpm
