SUMMARY = "Tianocore Edk2 PyTool Library"
DESCRIPTION = "This is a Tianocore maintained project consisting of a python library supporting UEFI firmware development. This package's intent is to provide an easy way to organize and share python code to facilitate reuse across environments, tools, and scripts."
LICENSE = "BSD-2-Clause-Patent"

PV = "0.10.13"

RPM_NAME = "python311-edk2toollib-0.10.13-1.3.noarch.rpm"
RPM_HASH = "011b1c297fc640e00d13a597b98f658dc4d9814beae74e13b897923a8db86ccde807a16acc7920cc3da5d8767ed76ea9864aa4d9506556f1ead099bd0dc2e8c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(edk2-pytool-library) python311-edk2toollib python3dist(edk2-pytool-library)"
RDEPENDS:${PN} += "/bin/sh python(abi)"

inherit rpm
