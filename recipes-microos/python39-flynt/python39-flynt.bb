SUMMARY = "CLI tool to convert a python project's  strings to f-strings"
DESCRIPTION = "CLI tool to convert a python project's  strings to f-strings."
LICENSE = "MIT"

PV = "0.76"

RPM_NAME = "python39-flynt-0.76-1.8.noarch.rpm"
RPM_HASH = "208591c78c5d664769170528616d29fbfee8019dc04c1d6d7c8ed68500568526a3689cbc6405d4f281bffe433fe626002267663309348a5b81e9d211f9004b12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(flynt) python39-flynt python3dist(flynt)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-astor python39-tomli"

inherit rpm
