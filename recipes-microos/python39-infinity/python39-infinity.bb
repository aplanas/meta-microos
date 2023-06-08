SUMMARY = "All-in-one infinity value for Python"
DESCRIPTION = "All-in-one infinity value for Python. Can be compared to any object."
LICENSE = "BSD-3-Clause"

PV = "1.5"

RPM_NAME = "python39-infinity-1.5-2.3.noarch.rpm"
RPM_HASH = "2961247ef4049bb3f21caea774f9feeed0b8ab43e2dbe90fd383966998c72c5d2a5c8f4a204a8601a275e962a773141374200bda401967d96989d0fa93df72f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(infinity) python39-infinity python3dist(infinity)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
