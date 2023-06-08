SUMMARY = "Pytest plugin for echoing build environment attributes"
DESCRIPTION = "pytest plugin with mechanisms for echoing environment variables, \
package version and generic attributes."
LICENSE = "MIT"

PV = "1.7.1"

RPM_NAME = "python310-pytest-echo-1.7.1-1.11.noarch.rpm"
RPM_HASH = "f24bbe973ee8a986fe80bcf74d021d771e2ad5fa68b3e59abe85dc14eae8c0fb3cc1de8419ab1580d1f4d7a50779801b15087f217912efe1297f624a7b740a6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-echo python3.10dist(pytest-echo) python310-pytest-echo python3dist(pytest-echo)"
RDEPENDS:${PN} += "python(abi) python310-pytest"

inherit rpm
