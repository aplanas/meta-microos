SUMMARY = "Python library to apply true color for terminal text"
DESCRIPTION = "A Python library to apply true color for terminal text."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python311-tcolorpy-0.1.2-1.3.noarch.rpm"
RPM_HASH = "b0e3915f46775d102eb91fc3f22c95e9cd23e3db434be694b6085690764f0ae31308da1f8a63a2ca4bcbf229621778d5e70eaa04c30557e167f46e7212344d9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(tcolorpy) \
python311-tcolorpy \
python3dist(tcolorpy)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
