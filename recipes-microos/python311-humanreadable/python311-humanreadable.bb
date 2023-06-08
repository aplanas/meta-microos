SUMMARY = "A Python library to convert from human-readable values to Python values"
DESCRIPTION = "humanreadable is a Python library to convert from human-readable \
values to Python values."
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "python311-humanreadable-0.1.0-1.12.noarch.rpm"
RPM_HASH = "e22eadb648cb494ed2632dfd43b7f31b0ae284f925f81856025ea4d48a60e168f450509a83882236392ee9b9aae1d85d415375710230d5b03a9d4bf1e3b047dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(humanreadable) python311-humanreadable python3dist(humanreadable)"
RDEPENDS:${PN} += "python(abi) python311-setuptools python311-typepy"

inherit rpm
