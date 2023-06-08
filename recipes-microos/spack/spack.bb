SUMMARY = "Package manager for HPC systems"
DESCRIPTION = "Spack is a configurable Python-based HPC package manager, automating \
the installation and fine-tuning of simulations and libraries. \
It operates on a wide variety of HPC platforms and enables users \
to build many code configurations. Software installed by Spack \
runs correctly regardless of environment, and file management \
is streamlined. Spack can install many variants of the same build \
using different compilers, options, and MPI implementations. \
 \
This package provides a module file that must be loaded to use spack."
LICENSE = "Apache-2.0 & MIT & Python-2.0 & BSD-3-Clause"

PV = "0.19.2"

RPM_NAME = "spack-0.19.2-1.1.noarch.rpm"
RPM_HASH = "cf3a4b4216a7209e465f9569eb22e58379a81ab491fb2c37b2ec8524919a78c36ed3b9f49e49e2f6c893d396d5387373ca8de8ad4659184eddd2f630997c19f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(spack) group(spack) spack"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/bash awk bzip2 coreutils curl gcc-c++ gcc-fortran git gpg2 gzip libbz2-devel lua-lmod make patch polkit python3-clingo spack-recipes sudo tar unzip xz"

inherit rpm
