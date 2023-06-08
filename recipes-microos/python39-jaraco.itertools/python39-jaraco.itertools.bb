SUMMARY = "Tools to work with iterables"
DESCRIPTION = "jaraco.itertools Tools for working with iterables. \
Complements itertools and more_itertools."
LICENSE = "MIT"

PV = "6.2.1"

RPM_NAME = "python39-jaraco.itertools-6.2.1-2.1.noarch.rpm"
RPM_HASH = "c0cd3051db10d9a3dba7e05ac462dde1b01f5c80a944dc5b414833c1a1cdf7e851c901774f3389e87b8668a6e16444665edaf133aeaa7fcd2c7a21e2ad45de83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jaraco.itertools) python39-jaraco.itertools python3dist(jaraco.itertools)"
RDEPENDS:${PN} += "python(abi) python39-inflect python39-more-itertools"

inherit rpm
