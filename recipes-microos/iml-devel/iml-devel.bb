SUMMARY = "Development files for IML, an Integer Matrix Library"
DESCRIPTION = "IML package provides routines to solve nonsingular systems of linear \
equations, solve any shape systems of linear equations, and perform \
mod p matrix operations, such as computing row-echelon form, \
determinant, rank profile, inverse of a mod p matrix. \
 \
This subpackage contains the include files and library links for \
developing against the IML library."
LICENSE = "BSD-3-Clause"

PV = "1.0.5"

RPM_NAME = "iml-devel-1.0.5-5.11.aarch64.rpm"
RPM_HASH = "2e2582ac1b3019c9de08a918c7f6ea58f297fd118f5385a0e89ea44c094253cc9f8d9e7f82afca0a392f39fe83ef0cef26be4d64701efcc4bebf8cf4b4864a72"

RPROVIDES:${PN} += "iml-devel \
iml-devel(aarch-64)"
RDEPENDS:${PN} += "gmp-devel \
libiml0"

inherit rpm
