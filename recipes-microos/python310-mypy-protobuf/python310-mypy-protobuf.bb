SUMMARY = "Generate mypy stub files from protobuf specs"
DESCRIPTION = "Generate mypy stub files from protobuf specs."
LICENSE = "MIT"

PV = "3.2.0"

RPM_NAME = "python310-mypy-protobuf-3.2.0-1.13.noarch.rpm"
RPM_HASH = "3667ecbedeff5c2375b87114c44fdd881522ea2fb26e5d6679b6deed651ad32d9f269c2ebfcd9530fb85ac01063aef55600c664571713bcf367534792e9f2500"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mypy-protobuf python3.10dist(mypy-protobuf) python310-mypy-protobuf python3dist(mypy-protobuf)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-protobuf update-alternatives"

inherit rpm
