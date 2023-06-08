SUMMARY = "Info Page for Spack - Package manager for HPC systems"
DESCRIPTION = "Spack is a configurable Python-based HPC package manager, automating \
the installation and fine-tuning of simulations and libraries. \
It operates on a wide variety of HPC platforms and enables users \
to build many code configurations. Software installed by Spack \
runs correctly regardless of environment, and file management \
is streamlined. Spack can install many variants of the same build \
using different compilers, options, and MPI implementations. \
 \
This package contains the info page."
LICENSE = "Apache-2.0 & MIT & Python-2.0 & BSD-3-Clause"

PV = "0.19.2"

RPM_NAME = "spack-info-0.19.2-1.1.noarch.rpm"
RPM_HASH = "8fddbed3614366ce72bae94e8f57f72266ffd8315e8d969aa0fca794989b1adafc540cf04269bc33cc9d7bf897323bd8578c86457af82960dfbef46ab20af887"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "spack-info"
RDEPENDS:${PN} += "info"

inherit rpm
