SUMMARY = "Python bindings for the Vulkan API"
DESCRIPTION = "Python extension which supports the Vulkan API. \
It keeps the original Vulkan API and focuses on minimizing \
the differences induced by the Python language."
LICENSE = "Apache-2.0"

PV = "1.1.99.1"

RPM_NAME = "python310-vulkan-1.1.99.1-1.15.noarch.rpm"
RPM_HASH = "573bbe5d87aa4ad673fb97a88f762df76cefb379e4891f80a705df0c4756843b20c6d45c33b14451f040161c5e33e34a50e6fcbea87c5638de130044afb28d35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-vulkan python3.10dist(vulkan) python310-vulkan python3dist(vulkan)"
RDEPENDS:${PN} += "python(abi) python310-cffi vulkan"

inherit rpm
