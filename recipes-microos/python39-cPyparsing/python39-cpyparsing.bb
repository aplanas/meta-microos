SUMMARY = "Cython implementation of PyParsing"
DESCRIPTION = "Cython implementation of PyParsing created for use in Coconut and Undebt."
LICENSE = "Apache-2.0"

PV = "2.4.7.1.2.1"

RPM_NAME = "python39-cPyparsing-2.4.7.1.2.1-1.1.aarch64.rpm"
RPM_HASH = "ce974fa7762b8071e0629824dce096d862f93fe503676e34132c08345249de9b65ea3647dbb420f589672be6985f2db63193cf5ada1ab481fb95e05976122e53"

RPROVIDES:${PN} += "python3.9dist(cpyparsing) python39-cPyparsing python39-cPyparsing(aarch-64) python3dist(cpyparsing)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi)"

inherit rpm
