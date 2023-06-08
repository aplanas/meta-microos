SUMMARY = "Python library for parsing Java properties"
DESCRIPTION = "A python library for parsing Java properties files."
LICENSE = "MIT"

PV = "0.7"

RPM_NAME = "python311-pyjavaproperties-0.7-2.15.noarch.rpm"
RPM_HASH = "4903309291180a7ee00414d0ec0a4f5e7308b21272f76eb3a988b1ed684341a4641008d0eef04c96908c6c9e95c681d8424f420215c60984a47222b615cceb4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyjavaproperties) python311-pyjavaproperties python3dist(pyjavaproperties)"
RDEPENDS:${PN} += "python(abi) python311-base"

inherit rpm
