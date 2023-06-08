SUMMARY = "Microsoft Azure common code"
DESCRIPTION = "This is the Microsoft Azure common code. \
 \
This package provides shared code by the Azure packages."
LICENSE = "MIT"

PV = "1.1.28"

RPM_NAME = "python39-azure-common-1.1.28-1.6.noarch.rpm"
RPM_HASH = "d133f552478da84cfed7233b2dad3d96cbe98160182e5424eaa6da33e3027d0be174a76744376aa5ab7ee0146b86d3080a9e061ecd574fd6f34fd01cb2a6495d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-common) python39-azure-common python3dist(azure-common)"
RDEPENDS:${PN} += "python(abi) python39-azure-nspkg"

inherit rpm
