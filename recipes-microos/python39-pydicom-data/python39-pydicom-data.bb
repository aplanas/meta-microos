SUMMARY = "Test files for pydicom"
DESCRIPTION = "Test files used by pydicom and other packages by the same organisation."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-pydicom-data-1.0.0-1.3.noarch.rpm"
RPM_HASH = "a8987fbdce72b9fa0c83cf6b43a59a1777c80aa6997e063ea4b99210f2d6dd8586c9c3f6acc9297cd885c512bc52160c5a110fdb749054dcae22964955bded90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pydicom-data) python39-pydicom-data python3dist(pydicom-data)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
