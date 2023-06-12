SUMMARY = "Extensible schema and data validation tool for Python dictionaries"
DESCRIPTION = "Cerberus provides type checking and other base functionality out of the box and \
is designed to be non-blocking and extensible, allowing for custom \
validation."
LICENSE = "ISC"

PV = "1.3.2"

RPM_NAME = "python310-Cerberus-1.3.2-6.3.noarch.rpm"
RPM_HASH = "7b428e405aac7978ef6d62e3f08a8ea1228957dcb8dc668ec1bce2861b3403adf3d820feee652ae847704ef2f4520e3325e2035f04d63ce40c69c39be70be989"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Cerberus \
python3.10dist(cerberus) \
python310-Cerberus \
python3dist(cerberus)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
