SUMMARY = "SDK for MPICH  version 4.0.2"
DESCRIPTION = "MPICH is a freely available, portable implementation of MPI, the \
Standard for message-passing libraries. This package contains manpages, \
headers and libraries needed for developing MPI applications. \
 \
This RPM contains all the wrappers necessary to compile, link, and run \
Open MPI jobs."
LICENSE = "MIT"

PV = "4.0.2"

RPM_NAME = "mpich-devel-4.0.2-3.3.aarch64.rpm"
RPM_HASH = "a024112e387d429cf353947ec7a405a8ad85da31d1a905a9f20914c17b43bc224318cb02c72c46d59cf4b8d910c58b691c0a7e90d5a4840fc92a3e1209034076"

RPROVIDES:${PN} += "mpich-devel mpich-devel(aarch-64)"
RDEPENDS:${PN} += "libstdc++-devel mpich"

inherit rpm
