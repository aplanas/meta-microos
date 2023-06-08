SUMMARY = "Documentation for python-pyliblo"
DESCRIPTION = "This package contains HTML documentation, including tutorials and API \
reference for python-pyliblo."
LICENSE = "LGPL-2.1-or-later"

PV = "0.10.0"

RPM_NAME = "python310-pyliblo-doc-0.10.0-2.11.aarch64.rpm"
RPM_HASH = "c62d91323215c2bd0fad2b4e80b0e3a21e4510e6ba5f49c84a39aa459e9b6c5170db92d8b42c9bfb9332e7484d7495fb896997674a3750ce342e741e4c544529"

RPROVIDES:${PN} += "python3-pyliblo-doc python310-pyliblo-doc python310-pyliblo-doc(aarch-64)"
RDEPENDS:${PN} += "python310-pyliblo"

inherit rpm
