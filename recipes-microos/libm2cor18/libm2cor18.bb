SUMMARY = "GNU Modula-2 compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Modula-2 language."
LICENSE = "BSL-1.0"

PV = "13.0.1+git7231"

RPM_NAME = "libm2cor18-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "0fb8b2dbed9c14550f06668c67bf7bff126af87740dc7dfd9c63ddfadfc7ce4987d9af247c8f0c84b84c8327146d7e7ca99a3e75663542b4bee4779ae4750053"

RPROVIDES:${PN} += "libm2cor.so.18()(64bit) libm2cor18 libm2cor18(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
