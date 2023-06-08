SUMMARY = "Python library for extract property from data"
DESCRIPTION = "Python library for extract property from data."
LICENSE = "MIT"

PV = "0.55.0"

RPM_NAME = "python311-DataProperty-0.55.0-2.3.noarch.rpm"
RPM_HASH = "289ab3cb273a540e940860bc128c77d8b7522b7a7b205545144d3a452098b6ef9910a937b04d448e76dd78288332df416ebd082ed66a36d59d0ae576ab6dff27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(dataproperty) python311-DataProperty python3dist(dataproperty)"
RDEPENDS:${PN} += "python(abi) python311-mbstrdecoder python311-typepy"

inherit rpm
