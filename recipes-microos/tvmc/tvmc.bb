SUMMARY = "TVM command line driver"
DESCRIPTION = "TVMC is a tool that exposes TVM features such as auto-tuning, compiling, \
profiling and execution of models, via a command line interface."
LICENSE = "Apache-2.0"

PV = "0.11.0"

RPM_NAME = "tvmc-0.11.0-2.5.aarch64.rpm"
RPM_HASH = "317966fa2536df92c836e85a638667fd070456031c06291237a97d59ba108c6fd556ca0571dbbd5bd35c5b29cd7de0a03026e155147253894b5ee40a0667119a"

RPROVIDES:${PN} += "tvmc tvmc(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3 libtvm python3-scipy python3-setuptools python3-tvm python3-typed-ast"

inherit rpm
