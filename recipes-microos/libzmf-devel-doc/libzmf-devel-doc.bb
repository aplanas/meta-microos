SUMMARY = "Documentation of libzmf API"
DESCRIPTION = "The libzmf-doc package contains documentation files for libzmf."
LICENSE = "MPL-2.0"

PV = "0.0.2"

RPM_NAME = "libzmf-devel-doc-0.0.2-1.43.noarch.rpm"
RPM_HASH = "a02df15855518d0c315fbe2d96d294b7cf971fb76bb64fdf8137dab7c4a797d94deb7cb9859ba91a38187c7b7a3b0edcd1883ea7ad2f6e048c1de5a5302f989b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libzmf-devel-doc"
RDEPENDS:${PN} += ""

inherit rpm
