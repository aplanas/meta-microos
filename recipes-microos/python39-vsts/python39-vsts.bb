SUMMARY = "Python wrapper around the VSTS APIs"
DESCRIPTION = "Python wrapper around the VSTS APIs"
LICENSE = "MIT"

PV = "0.1.25"

RPM_NAME = "python39-vsts-0.1.25-2.14.noarch.rpm"
RPM_HASH = "14da5aad54141ba63dab5eacbde4cc018b6c95ca5734201ea48ffe6b2d6de93b3f06a2fdf3edf5a25344c01de19e423774f2373bd06ffdba5dff33ebf73a9d22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(vsts) python39-vsts python3dist(vsts)"
RDEPENDS:${PN} += "python(abi) python39-msrest"

inherit rpm
