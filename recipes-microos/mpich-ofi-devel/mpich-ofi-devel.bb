SUMMARY = "SDK for MPICH  version 4.0.2"
DESCRIPTION = "MPICH is a freely available, portable implementation of MPI, the \
Standard for message-passing libraries. This package contains manpages, \
headers and libraries needed for developing MPI applications. \
 \
This RPM contains all the wrappers necessary to compile, link, and run \
Open MPI jobs."
LICENSE = "MIT"

PV = "4.0.2"

RPM_NAME = "mpich-ofi-devel-4.0.2-3.3.aarch64.rpm"
RPM_HASH = "e77740b093e39ca1825c531fb6f4e1dc6939bd5adcba268f35ed0d248156dfa9a8f2757aa713f691266bff494bda94b952b7dea615f7400b04ea2854c970d91c"

RPROVIDES:${PN} += "mpich-ofi-devel \
mpich-ofi-devel(aarch-64)"
RDEPENDS:${PN} += "libstdc++-devel \
mpich-ofi"

inherit rpm
