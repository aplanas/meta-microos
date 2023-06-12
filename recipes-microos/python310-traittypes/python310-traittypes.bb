SUMMARY = "Scipy trait types"
DESCRIPTION = "Custom trait types for scientific computing."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "python310-traittypes-0.2.1-9.2.noarch.rpm"
RPM_HASH = "2bcbab98de16348932914e7dbf48aa8e0dff6f1e9d08498a4f5761ad9220d3b0bbc841484cf9f73ec9d00c464243033d911a9080662fe7518618c68190fff440"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-traittypes \
python3.10dist(traittypes) \
python310-traittypes \
python3dist(traittypes)"
RDEPENDS:${PN} += "python(abi) \
python310-traitlets"

inherit rpm
