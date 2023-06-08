SUMMARY = "Microsoft Azure Mixed Reality Authentication Client Library for Python"
DESCRIPTION = "Mixed Reality services, like Azure Spatial Anchors, Azure Remote Rendering, and \
others, use the Mixed Reality security token service (STS) for authentication. \
 \
This package supports exchanging Mixed Reality account credentials for an access \
token from the STS that can be used to access Mixed Reality services."
LICENSE = "MIT"

PV = "1.0.0b1"

RPM_NAME = "python39-azure-mixedreality-authentication-1.0.0b1-1.8.noarch.rpm"
RPM_HASH = "3277544d91a3be76e080e9732fbe2159e30b50dd09dd2bcf860c013fb399b62def7d0024bee394a3743854050a8ba88d977094b8f2219b9fe6934129ec5b7256"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mixedreality-authentication) python39-azure-mixedreality-authentication python3dist(azure-mixedreality-authentication)"
RDEPENDS:${PN} += "python(abi) python39-azure-core python39-azure-mixedreality-nspkg python39-msrest"

inherit rpm
