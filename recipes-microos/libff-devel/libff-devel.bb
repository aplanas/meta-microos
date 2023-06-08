SUMMARY = "Development files for libff"
DESCRIPTION = "The libff-devel package contains libraries and header files for developing applications that use libff."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "libff-devel-1.0.0-1.10.aarch64.rpm"
RPM_HASH = "d62439862d7bf7607bf37c36aae8163feffc6e94a727ca48741d5a5b0691eab528b2f7a5431600cbe262ac94b9adb8c08bf166753359cced4f8897f74462f7d2"

RPROVIDES:${PN} += "libff-devel libff-devel(aarch-64)"
RDEPENDS:${PN} += "libff-1_0_0"

inherit rpm
