SUMMARY = "MPI Benchmarks common files"
DESCRIPTION = "Set of popular MPI benchmarks: IMB v2021.3 OSU benchmarks ver 6.1"
LICENSE = "BSD-3-Clause & CPL-1.0"

PV = "3.2"

RPM_NAME = "mpitests-3.2-11.2.aarch64.rpm"
RPM_HASH = "fedb89f9505f739821939814f3fa8dfb0f27b3fa9c137988eafb1a46a6cf6b9828433cc52ac4c23f51095ce388284b579c14d5a9d6ce5c96f1cdebd442435778"

RPROVIDES:${PN} += "mpitests mpitests(aarch-64)"
RDEPENDS:${PN} += "/bin/bash"

inherit rpm
