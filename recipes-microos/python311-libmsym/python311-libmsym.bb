SUMMARY = "Python bindings for libmsym"
DESCRIPTION = "This package contains the python bindings needed to develop \
python applications that require libmsym."
LICENSE = "MIT"

PV = "0.2.3"

RPM_NAME = "python311-libmsym-0.2.3-2.5.noarch.rpm"
RPM_HASH = "3516b35025ad355eb6c57948c7c1c878231e9ad7188b25e49aeb32a1392d3cabd03a891267b319a0f3e815f845babc6b82e9bb6ad621e2c07e5f69944f76897a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(libmsym) python311-libmsym python3dist(libmsym)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
