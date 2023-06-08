SUMMARY = "Spack built-in package recipes"
DESCRIPTION = "Spack is a configurable Python-based HPC package manager, automating \
the installation and fine-tuning of simulations and libraries. \
It operates on a wide variety of HPC platforms and enables users \
to build many code configurations. Software installed by Spack \
runs correctly regardless of environment, and file management \
is streamlined. Spack can install many variants of the same build \
using different compilers, options, and MPI implementations. \
 \
This package contains the built-in package recipes."
LICENSE = "Apache-2.0 & MIT & Python-2.0 & BSD-3-Clause"

PV = "0.19.2"

RPM_NAME = "spack-recipes-0.19.2-1.1.noarch.rpm"
RPM_HASH = "da3e2e3de908b6d85678b399b8477a1883cc6ccfd64910946c3fb14be0f7dba3c588a0048b18c5a53ab95eb6570235b7b08670b374db6cc934c7bf8f27debfa6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "spack-recipes"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/sh spack"

inherit rpm
