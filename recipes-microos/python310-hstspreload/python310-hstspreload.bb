SUMMARY = "Python Chromium HSTS Preload list"
DESCRIPTION = "Chromium HSTS Preload list as a Python package."
LICENSE = "BSD-3-Clause"

PV = "2023.1.1"

RPM_NAME = "python310-hstspreload-2023.1.1-1.3.noarch.rpm"
RPM_HASH = "b64770f8d40e4e56eb7b11cd5e6c26a5204594e48c876d2730bc9617917929f6e41e38161fa14b0d3c24fbc2af64f3166d14b538797fe41ff6d5f5cd85a34653"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hstspreload python3.10dist(hstspreload) python310-hstspreload python3dist(hstspreload)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
