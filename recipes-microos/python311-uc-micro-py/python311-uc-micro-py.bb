SUMMARY = "Micro subset of unicode data files for linkify-it-py projects"
DESCRIPTION = "Micro subset of unicode data files for linkify-it-py projects."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python311-uc-micro-py-1.0.1-2.1.noarch.rpm"
RPM_HASH = "c56ad1f6509a82dcb365fa85667beaba1dc87e5f0059cf7faef7e20e5fd0c1ae5d1da9d49800dcb021bfefb0b13639ca5b034a72f9f30b47eec037e02d589a92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(uc-micro-py) python311-uc-micro-py python3dist(uc-micro-py)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
