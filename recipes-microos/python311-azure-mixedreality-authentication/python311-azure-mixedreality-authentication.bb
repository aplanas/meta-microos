SUMMARY = "Microsoft Azure Mixed Reality Authentication Client Library for Python"
DESCRIPTION = "Mixed Reality services, like Azure Spatial Anchors, Azure Remote Rendering, and \
others, use the Mixed Reality security token service (STS) for authentication. \
 \
This package supports exchanging Mixed Reality account credentials for an access \
token from the STS that can be used to access Mixed Reality services."
LICENSE = "MIT"

PV = "1.0.0b1"

RPM_NAME = "python311-azure-mixedreality-authentication-1.0.0b1-1.8.noarch.rpm"
RPM_HASH = "b151a0515ef8c82045c0252dd303302157d143223e7d195ceb222ff17991858648d59037048d59bd54e044e79bbaabbe984265f49d0aab26128779f4dff1b135"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mixedreality-authentication) python311-azure-mixedreality-authentication python3dist(azure-mixedreality-authentication)"
RDEPENDS:${PN} += "python(abi) python311-azure-core python311-azure-mixedreality-nspkg python311-msrest"

inherit rpm
