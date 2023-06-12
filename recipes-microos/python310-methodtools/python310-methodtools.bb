SUMMARY = "Expand Standard Functools to Methods"
DESCRIPTION = "Expand functools features to methods, classmethods, \
staticmethods and even for (unofficial) hybrid methods."
LICENSE = "BSD-2-Clause"

PV = "0.4.2"

RPM_NAME = "python310-methodtools-0.4.2-1.12.noarch.rpm"
RPM_HASH = "2685c36ccd8dc68ef0b3857d62468b3b0320eb546c3e012ead93be0035e4d91d8b65596174570a1efdb8a1ed5cf9cc0dd4ad0448d25f351c871c4e5ebe92b8a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-methodtools \
python3.10dist(methodtools) \
python310-methodtools \
python3dist(methodtools)"
RDEPENDS:${PN} += "python(abi) \
python310-wirerope"

inherit rpm
