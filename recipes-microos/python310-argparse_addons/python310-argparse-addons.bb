SUMMARY = "Additional argparse types and actions"
DESCRIPTION = "Additional argparse types and actions."
LICENSE = "MIT"

PV = "0.12.0"

RPM_NAME = "python310-argparse_addons-0.12.0-1.1.noarch.rpm"
RPM_HASH = "4cf7616aa766ae65724393ee4513e748cb3f0ebb440e4401fd6f69d3ffe3bdcb8721394d33101a74a41a9108f5862553b8db65631cba27a4efaf049f1537e7ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-argparse_addons python3.10dist(argparse-addons) python310-argparse_addons python3dist(argparse-addons)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
