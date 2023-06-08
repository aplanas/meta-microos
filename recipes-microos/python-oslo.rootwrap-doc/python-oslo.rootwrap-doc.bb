SUMMARY = "Documentation for OpenStack oslo.rootwrap"
DESCRIPTION = "Documentation for the OpenStack oslo.rootwrap library."
LICENSE = "Apache-2.0"

PV = "7.0.1"

RPM_NAME = "python-oslo.rootwrap-doc-7.0.1-1.2.noarch.rpm"
RPM_HASH = "0c341651e143d87f42f803dfdc020730c850a8e7a6e34e12281679f388cd76cc21e6135d07cd733653a54811bfd1b91fec88049973e492280b9d6542705573e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-oslo.rootwrap-doc"
RDEPENDS:${PN} += ""

inherit rpm
