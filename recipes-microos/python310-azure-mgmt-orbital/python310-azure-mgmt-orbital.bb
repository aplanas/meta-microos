SUMMARY = "Microsoft Azure Orbital Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Orbital Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python310-azure-mgmt-orbital-2.0.0-1.2.noarch.rpm"
RPM_HASH = "076767ebcaebd210b0aec24657b5205ce474813e0326ecb5b6dbd941315b62bbabaf1fd099d564eb654b911614c1494a49250710403b61ed0ed3233df82d9db3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-orbital python3.10dist(azure-mgmt-orbital) python310-azure-mgmt-orbital python3dist(azure-mgmt-orbital)"
RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) python(abi) python310-azure-common python310-azure-mgmt-core python310-azure-mgmt-nspkg python310-azure-nspkg python310-msrest"

inherit rpm
