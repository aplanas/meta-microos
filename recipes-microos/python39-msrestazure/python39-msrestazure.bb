SUMMARY = "AutoRest swagger generator - Azure-specific module"
DESCRIPTION = "AutoRest swagger generator Python client runtime. Azure-specific module."
LICENSE = "MIT"

PV = "0.6.4"

RPM_NAME = "python39-msrestazure-0.6.4-2.11.noarch.rpm"
RPM_HASH = "e1117a860e21814b252620098a3d49919209cf1942dd8a33314aee2ffbc11377a6e4bfaf8ab9b16ebb70663fcf08768e596812f6ba8df5a2cfbd05af3fc69c83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(msrestazure) python39-msrestazure python3dist(msrestazure)"
RDEPENDS:${PN} += "python(abi) python39-adal python39-msrest python39-six"

inherit rpm
