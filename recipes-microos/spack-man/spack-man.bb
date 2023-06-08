SUMMARY = "Man Page for Spack - Package manager for HPC systems"
DESCRIPTION = "Spack is a configurable Python-based HPC package manager, automating \
the installation and fine-tuning of simulations and libraries. \
It operates on a wide variety of HPC platforms and enables users \
to build many code configurations. Software installed by Spack \
runs correctly regardless of environment, and file management \
is streamlined. Spack can install many variants of the same build \
using different compilers, options, and MPI implementations. \
 \
This package contains the man page."
LICENSE = "Apache-2.0 & MIT & Python-2.0 & BSD-3-Clause"

PV = "0.19.2"

RPM_NAME = "spack-man-0.19.2-1.1.noarch.rpm"
RPM_HASH = "31de822b16bb84c2e7ef750f42eb0c948065d1a267f8b7ac5d3969cd9b1a17d3a0022920effc1e5eabeb31dae1f69c9847ce0ef4c5162fa2fb5c06a8de81e7d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "spack-man"
RDEPENDS:${PN} += "man"

inherit rpm
