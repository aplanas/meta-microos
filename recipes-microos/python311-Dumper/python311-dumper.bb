SUMMARY = "Tool to conveniently describe any Python datastructure"
DESCRIPTION = "Tool to conveniently describe any Python datastructure"
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python311-Dumper-1.2.0-2.6.noarch.rpm"
RPM_HASH = "3104ec2c6177222c8aa189a8110f8e6c1bc0dccc85ad37e020f62d6c4aeb472b54d6ad3d6653a362db2c38e67310364f2e03a4b33e315e50bd1d4803292269c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(dumper) python311-Dumper python3dist(dumper)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
