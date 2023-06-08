SUMMARY = "A wrapper for the user, group and hosts NSS API"
DESCRIPTION = "There are projects which provide daemons that need to be able to create, modify \
and delete Unix users, or just switch user IDs to interact with the system, e.g. \
a user space file server. To be able to test that, you need the privilege to \
modify the passwd and groups files. With nss_wrapper, it is possible to define \
your own passwd and groups files which will be used by software to act correctly \
while under test. \
 \
If you have a client and server under test, they normally use functions to \
resolve network names to addresses (DNS) or vice versa. The nss_wrappers allow \
you to create a hosts file to setup name resolution for the addresses you use \
with socket_wrapper. \
 \
To use it, set the following environment variables: \
 \
LD_PRELOAD=libuid_wrapper.so \
NSS_WRAPPER_PASSWD=/path/to/passwd \
NSS_WRAPPER_GROUP=/path/to/group \
NSS_WRAPPER_HOSTS=/path/to/host \
 \
This package does not have a devel package, because this project is for \
development/testing."
LICENSE = "BSD-3-Clause"

PV = "1.1.15"

RPM_NAME = "nss_wrapper-1.1.15-3.3.aarch64.rpm"
RPM_HASH = "ddaa1513917d259559a8c5b997d270e4e977b6fa6d200a0502f383013ecf59bec8bdb0c1e530d8da66bd452f06ae759623ad3f28618b600310cbb3278e0ced0c"

RPROVIDES:${PN} += "cmake(nss_wrapper) libnss_wrapper.so.0()(64bit) nss_wrapper nss_wrapper(aarch-64) pkgconfig(nss_wrapper)"
RDEPENDS:${PN} += "/sbin/ldconfig /usr/bin/perl /usr/bin/pkg-config ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
