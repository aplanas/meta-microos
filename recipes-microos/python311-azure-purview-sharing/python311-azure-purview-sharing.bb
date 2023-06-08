SUMMARY = "Microsoft Azure Purview Sharing Client Library for Python"
DESCRIPTION = "Microsoft Purview Share is a fully managed cloud service."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python311-azure-purview-sharing-1.0.0~b1-1.2.noarch.rpm"
RPM_HASH = "f6a6e28daee11096e2b0188084a7318551d444a5427b3b18798dde91c3629b691e6f6c88c3e7120ff91311dc8f05c8565e3452cc97bfa2437616ec0d53d0011f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-purview-sharing) python311-azure-purview-sharing python3dist(azure-purview-sharing)"
RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) python(abi) python311-azure-core python311-azure-nspkg python311-azure-purview-nspkg python311-isodate"

inherit rpm
