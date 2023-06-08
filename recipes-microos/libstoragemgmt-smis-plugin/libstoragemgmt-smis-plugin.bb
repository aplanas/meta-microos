SUMMARY = "Files for SMI-S generic array support for libstoragemgmt"
DESCRIPTION = "The libstoragemgmt-smis-plugin package contains plug-in for generic \
Storage Management Initiative Specification (SMI-S) array support."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.9.8"

RPM_NAME = "libstoragemgmt-smis-plugin-1.9.8-1.1.noarch.rpm"
RPM_HASH = "98607b3608017d43feaf7d93a6ae816533b8e9f079bde48ba7149e1ea7aa4ce3d4e9472c00bcda00baa656c4807149d3b21224657142e2dcdd0951e07073abfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libstoragemgmt-smis-plugin"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3 python(abi) python3-libstoragemgmt python3-pywbem"

inherit rpm
