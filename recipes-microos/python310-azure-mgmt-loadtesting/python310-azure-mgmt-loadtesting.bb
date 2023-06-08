SUMMARY = "Microsoft Azure Loadtesting Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Loadtesting Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-mgmt-loadtesting-1.0.0-1.3.noarch.rpm"
RPM_HASH = "685d98a7592bf709b76085032297a39e138550355fb95b121a670e020844c321b3e7fe797b3216aecd634e6ee31bf4d9372a2d54b94422b40ac51a6238d7386e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-loadtesting python3.10dist(azure-mgmt-loadtesting) python310-azure-mgmt-loadtesting python3dist(azure-mgmt-loadtesting)"
RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) python(abi) python310-azure-common python310-azure-mgmt-core python310-azure-mgmt-nspkg python310-azure-nspkg python310-msrest"

inherit rpm
