SUMMARY = "Ordered Multivalue Dictionary"
DESCRIPTION = "Ordered Multivalue Dictionary - omdict."
LICENSE = "Unlicense"

PV = "1.0.1"

RPM_NAME = "python310-orderedmultidict-1.0.1-3.1.noarch.rpm"
RPM_HASH = "9e43560179465963d7bec373115ebb3b191a094bfac00b8602b33979a0f323ea0e7c7d3d21e4663025368348f8af5ba27213ee3bcf38925bacf40deb3202fe63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-orderedmultidict \
python3.10dist(orderedmultidict) \
python310-orderedmultidict \
python3dist(orderedmultidict)"
RDEPENDS:${PN} += "python(abi) \
python310-six"

inherit rpm
