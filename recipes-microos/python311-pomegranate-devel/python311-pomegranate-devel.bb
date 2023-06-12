SUMMARY = "Development files for python311-pomegranate"
DESCRIPTION = "Pomegranate is a graphical models library for Python, implemented in Cython for speed. \
 \
This package provides development files needed to run software that depends on \
Pomegranate."
LICENSE = "MIT"

PV = "0.12.0"

RPM_NAME = "python311-pomegranate-devel-0.12.0-2.13.aarch64.rpm"
RPM_HASH = "e23a48cac3ebe5dd24caa9197900e0d3b52146e7e560d0021625b5e3cac0e6ba107c1818efa4c575eedac2484ed049e5c0c6a7bceafb5eaf0a862a66b9fd0051"

RPROVIDES:${PN} += "python311-pomegranate-devel \
python311-pomegranate-devel(aarch-64)"
RDEPENDS:${PN} += "python311-pomegranate"

inherit rpm
