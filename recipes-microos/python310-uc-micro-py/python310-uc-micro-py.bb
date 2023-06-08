SUMMARY = "Micro subset of unicode data files for linkify-it-py projects"
DESCRIPTION = "Micro subset of unicode data files for linkify-it-py projects."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python310-uc-micro-py-1.0.1-2.1.noarch.rpm"
RPM_HASH = "c512a7ba162058c5f360fec163db622f377557859005e8eb1a034b7dfebcfa35c6cbc73e5f830031a528a3a6babec4d3ca6313d467d56c03ffff72352bf2b52b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-uc-micro-py python3.10dist(uc-micro-py) python310-uc-micro-py python3dist(uc-micro-py)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
