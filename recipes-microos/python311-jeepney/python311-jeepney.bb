SUMMARY = "Low-level, pure Python DBus protocol wrapper"
DESCRIPTION = "This is a low-level, pure Python DBus protocol client. It has an I/O-free \
core, and integration modules for different event loops."
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "python311-jeepney-0.8.0-2.1.noarch.rpm"
RPM_HASH = "f6942bd9598dfc1ec13dc3914bfccd3f5612f13b727517dc132c50f5c3a4fda49b958ca2bccdbf0884d8b92d79c89e3fae1cd93c39619324386748b323f842f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(jeepney) \
python311-jeepney \
python3dist(jeepney)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
