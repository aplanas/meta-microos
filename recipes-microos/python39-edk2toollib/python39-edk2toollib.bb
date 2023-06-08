SUMMARY = "Tianocore Edk2 PyTool Library"
DESCRIPTION = "This is a Tianocore maintained project consisting of a python library supporting UEFI firmware development. This package's intent is to provide an easy way to organize and share python code to facilitate reuse across environments, tools, and scripts."
LICENSE = "BSD-2-Clause-Patent"

PV = "0.10.13"

RPM_NAME = "python39-edk2toollib-0.10.13-1.3.noarch.rpm"
RPM_HASH = "f1cf7f876bc929dfe77aeb0ec72367fc273ff2df07a93b894ea032c16bd97cc70ce723214e545c392dba5884002b5e5a30ae7006f48dd8e19dec463b60893077"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(edk2-pytool-library) python39-edk2toollib python3dist(edk2-pytool-library)"
RDEPENDS:${PN} += "/bin/sh python(abi)"

inherit rpm
