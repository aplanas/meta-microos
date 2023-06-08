SUMMARY = "Documentation for the libwpd API"
DESCRIPTION = "This package contains documentation for the libwpd API."
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.10.3"

RPM_NAME = "libwpd-devel-doc-0.10.3-3.8.noarch.rpm"
RPM_HASH = "6165f544ffa3d3911b31fdd04a1ff6459352a80d5d7e76c17ca385232db13eccf0c20ad2174d421973050761949aea5b8d81e09cba7f8516fb78dd1d49b1ebfb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libwpd-devel-doc"
RDEPENDS:${PN} += ""

inherit rpm
