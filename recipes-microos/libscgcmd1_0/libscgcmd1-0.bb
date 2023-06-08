SUMMARY = "SCSI command function library"
DESCRIPTION = "A library to create and parse SCSI commands (at the byte level)."
LICENSE = "CDDL-1.0"

PV = "2022.10.16"

RPM_NAME = "libscgcmd1_0-2022.10.16-47.3.aarch64.rpm"
RPM_HASH = "f24e109aa1b78ed160c6dffca2321bd1baea62fbc7efd58d4cbbcd32fa3ebd57a1bbc5f5aebe7c79cb0df9f03c1039ee3c1a2b3bb7c092da25af6d7275fa63da"

RPROVIDES:${PN} += "libscgcmd.so.1.0()(64bit) libscgcmd.so.1.0(SCHILY_1.0)(64bit) libscgcmd1_0 libscgcmd1_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libscg.so.1.0()(64bit) libscg.so.1.0(SCHILY_1.0)(64bit) libschily.so.2.0()(64bit) libschily.so.2.0(SCHILY_1.0)(64bit)"

inherit rpm
