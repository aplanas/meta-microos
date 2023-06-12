SUMMARY = "Bidirectional map implementation for Python"
DESCRIPTION = "Bidirectional map implementation and related functionality."
LICENSE = "MPL-2.0"

PV = "0.22.1"

RPM_NAME = "python39-bidict-0.22.1-1.1.noarch.rpm"
RPM_HASH = "5c50612dd2d405ab25c228401413268e3ce1d4d02be55ff540d07d240c43f20245e2ca29777d43391cace9c41ea1e9553262af69cb734168382321888d7f981e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(bidict) \
python39-bidict \
python3dist(bidict)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
