SUMMARY = "WSDL parsing services package for Web Services for Python"
DESCRIPTION = "Python module for WSDL parsing services package for Web Services."
LICENSE = "ZPL-2.0"

PV = "0.4.8"

RPM_NAME = "python39-wstools-0.4.8-7.6.noarch.rpm"
RPM_HASH = "dc2db34df35a85b4f07c2cbf2d2d178b9cfb80fcbb8466f4ae59b5b19603b54ee228711542c54d169406465a0ebdb44405e7887085f3f9ba0bcd82fdf4d87c35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(wstools) python39-wstools python3dist(wstools)"
RDEPENDS:${PN} += "python(abi) python39-six"

inherit rpm
