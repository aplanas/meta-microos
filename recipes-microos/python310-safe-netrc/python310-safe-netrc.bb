SUMMARY = "Safe netrc file parser"
DESCRIPTION = "This package provides a subclass of the Python standard library netrc.netrc \
class to add some custom behaviors."
LICENSE = "GPL-2.0+"

PV = "1.0.0"

RPM_NAME = "python310-safe-netrc-1.0.0-1.4.noarch.rpm"
RPM_HASH = "a1fa6cebdb1654919e38dcc00dba2fcf9076a1ff69120efa4ae9f4c403dd446a0efc9e4dbe90459a8a50b1e4b1c91b91b486434167fd94c7ba4143729cf18530"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-safe-netrc \
python3.10dist(safe-netrc) \
python310-safe-netrc \
python3dist(safe-netrc)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
