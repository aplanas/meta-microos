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

RPM_NAME = "libblacs2-openmpi2-2.1.0-9.11.aarch64.rpm"
RPM_HASH = "d7aecaf8918be8b535a06ac6a31aea9ad60b7429c91ba98fc9a4467ddf4158c89a82c9e7966b3fe78addd762e469e6620d75517500ec1bddc52d5520f1ef8b91"

RPROVIDES:${PN} += "libblacs.so.2.1.0()(64bit) libblacs2-openmpi2 libblacs2-openmpi2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libmpi.so.20()(64bit)"

inherit rpm
