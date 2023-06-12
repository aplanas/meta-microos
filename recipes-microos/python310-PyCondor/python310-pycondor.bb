SUMMARY = "Python utility for HTCondor"
DESCRIPTION = "PyCondor (Python HTCondor) is a tool to help build and submit workflows to HTCondor in a straight-forward manner with minimal hassle."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python310-PyCondor-0.6.0-1.4.noarch.rpm"
RPM_HASH = "c77f8540605e973c13ce8e35040083e937325a72794d72b54ab30ee6e066e20f6c0707c140404d2a6a558707596d6f21a473d0cef159c8d3aaa5696ed4351838"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyCondor \
python3.10dist(pycondor) \
python310-PyCondor \
python3dist(pycondor)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
update-alternatives"

inherit rpm
