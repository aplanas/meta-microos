SUMMARY = "Ordered Multivalue Dictionary"
DESCRIPTION = "Ordered Multivalue Dictionary - omdict."
LICENSE = "Unlicense"

PV = "1.0.1"

RPM_NAME = "python39-orderedmultidict-1.0.1-3.1.noarch.rpm"
RPM_HASH = "dfe78e09c63b27c7d29a5386dff7bcae9cfca03d1ab6926f5dc4fae839d4f41653301ab4623d01a30e725eb41a74741db53546f7ee7bb53dba562dddfe12cb10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(orderedmultidict) python39-orderedmultidict python3dist(orderedmultidict)"
RDEPENDS:${PN} += "python(abi) python39-six"

inherit rpm
