SUMMARY = "Basic Linear Algebra Communication Subprograms"
DESCRIPTION = "The BLACS (Basic Linear Algebra Communication Subprograms) project \
provides a linear algebra oriented message passing interface for \
a large range of distributed memory platforms. \
 \
The length of time required to implement efficient distributed memory \
algorithms makes it impractical to rewrite programs for every new \
parallel machine. The BLACS exist in order to make linear algebra \
applications both easier to program and more portable."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libblacs2-openmpi1-2.1.0-9.11.aarch64.rpm"
RPM_HASH = "807b39f4df614b78ecabca9115b923d62b8b3fbef1be13a089a7549829c8b8f5e15d6ab9a70d77fb35418048340ad8e22f1ed2002efa07c051984f5d988b7e51"

RPROVIDES:${PN} += "libblacs.so.2.1.0()(64bit) \
libblacs2-openmpi1 \
libblacs2-openmpi1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libmpi.so.12()(64bit)"

inherit rpm
