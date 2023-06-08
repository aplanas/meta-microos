SUMMARY = "A screenshot Python module"
DESCRIPTION = "PyScreeze is a screenshot module for Python 2 and 3."
LICENSE = "BSD-3-Clause"

PV = "0.1.28"

RPM_NAME = "python311-PyScreeze-0.1.28-1.3.noarch.rpm"
RPM_HASH = "d55258317d925a5c964bf3bdefd9c7b1edc3478320dc75360533c35666deddf1a378de8500e54b641cba9a5db979b14d34647311db3bee980ffd2ca380d36968"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyscreeze) python311-PyScreeze python3dist(pyscreeze)"
RDEPENDS:${PN} += "python(abi) python311-Pillow"

inherit rpm
