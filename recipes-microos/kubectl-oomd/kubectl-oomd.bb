SUMMARY = "Show pods/containers which have recently been 'OOMKilled'"
DESCRIPTION = "kubectl plugin to display the pods and containers which have recently been OOMKilled."
LICENSE = "Apache-2.0"

PV = "0.0.7"

RPM_NAME = "kubectl-oomd-0.0.7-1.3.aarch64.rpm"
RPM_HASH = "c52154f69be587eafb614574555af6b69857a9b4ef55cc99388d96caf9b3b680ab07bb61426d16ae430282ef3075ae7183dad8e104f4cc9cd79025eefd8d9227"

RPROVIDES:${PN} += "kubectl-oomd kubectl-oomd(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
