SUMMARY = "All-in-one infinity value for Python"
DESCRIPTION = "All-in-one infinity value for Python. Can be compared to any object."
LICENSE = "BSD-3-Clause"

PV = "1.5"

RPM_NAME = "python310-infinity-1.5-2.3.noarch.rpm"
RPM_HASH = "dcb6e3f0756aea37e778192081b54ac2758ec590d6f697f660224d23cc1cdf25559f35b223423663079a43b71beb0ffa5d473d0d6cdf1fdbdfd0f88d3d33c33e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-infinity \
python3.10dist(infinity) \
python310-infinity \
python3dist(infinity)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
