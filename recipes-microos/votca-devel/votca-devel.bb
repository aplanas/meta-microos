SUMMARY = "Development headers and libraries for votca"
DESCRIPTION = " \
VOTCA is a software package which focuses on the analysis of molecular \
dynamics data, the development of systematic coarse-graining techniques as \
well as methods used for simulating microscopic charge (and exciton) transport \
in disordered semiconductors. \
 \
This package contains development headers and libraries for votca."
LICENSE = "Apache-2.0"

PV = "2022.1"

RPM_NAME = "votca-devel-2022.1-3.6.aarch64.rpm"
RPM_HASH = "8e09ae5954ca02280f89dec64bb6637f2630ce631475321930eefd09218eb8e42a08fc213d54e6ea4b92ffbdd5a3bbd7e74ab6f4726cbf2e3d596a49bb1e2ee2"

RPROVIDES:${PN} += "cmake(VOTCA_CSG) cmake(VOTCA_TOOLS) cmake(VOTCA_XTP) votca-csg-devel votca-devel votca-devel(aarch-64) votca-tools-devel votca-xtp-devel"
RDEPENDS:${PN} += "eigen3-devel fftw3-devel libexpat-devel libvotca2022 votca"

inherit rpm
