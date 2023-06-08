SUMMARY = "Adds a command to dynamically get the version from the VCS of choice"
DESCRIPTION = "Adds a command to dynamically get the version from the VCS of choice."
LICENSE = "MIT"

PV = "99.9"

RPM_NAME = "python310-setuptools-version-command-99.9-1.3.noarch.rpm"
RPM_HASH = "bfe33c4285d36cc8767e66614a882fe5a7644ca99143502603f335d3cf102e5dfc433e0f5d1e817f3167932f1e25f1bb9941d6eeefe60be9613105c31107d326"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-setuptools-version-command python3.10dist(setuptools-version-command) python310-setuptools-version-command python3dist(setuptools-version-command)"
RDEPENDS:${PN} += "python(abi) python310-setuptools"

inherit rpm
