SUMMARY = "Python tools to interact with SAP HANA utilities"
DESCRIPTION = "API to expose SAP HANA functionalities"
LICENSE = "Apache-2.0"

PV = "0.3.13+git.1673855974.f208fad"

RPM_NAME = "python39-shaptools-0.3.13+git.1673855974.f208fad-1.4.noarch.rpm"
RPM_HASH = "8dc5881fbe79831c17ff2a9c094596826350a8d366dc40b7f53d7e274f0a48ce74cabdf2a3e608e5f39239efcaafcdf961d5be9840b24b94c181eadacea5c873"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(shaptools) python39-shaptools python3dist(shaptools)"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/python3.9 python(abi) update-alternatives"

inherit rpm
