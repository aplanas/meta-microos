SUMMARY = "Python Chromium HSTS Preload list"
DESCRIPTION = "Chromium HSTS Preload list as a Python package."
LICENSE = "BSD-3-Clause"

PV = "2023.1.1"

RPM_NAME = "python39-hstspreload-2023.1.1-1.3.noarch.rpm"
RPM_HASH = "1e0f7343e1f78656804149221d67cec6a0f8ae45b3d2553148d2f25755b6fec13b19c343e721a41f4eebfccb35b9600cd956b8871e9f0f5955fdae0f8fc40234"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(hstspreload) python39-hstspreload python3dist(hstspreload)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
