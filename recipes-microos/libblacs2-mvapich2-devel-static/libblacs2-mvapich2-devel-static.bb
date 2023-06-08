SUMMARY = "Development libraries for BLACS (mvapich2)"
DESCRIPTION = "This package contains static libraries for BLACS, compiled against mvapich2."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libblacs2-mvapich2-devel-static-2.1.0-9.11.aarch64.rpm"
RPM_HASH = "381b55a23d2762458bd147304d1b09df2b10b872f5216948f5825ef5b08b399cf2c3e6cb6b5fb31de9c076e746807bfa189731654eea9e4e061b585827290d9a"

RPROVIDES:${PN} += "libblacs2-mvapich2-devel-static libblacs2-mvapich2-devel-static(aarch-64)"
RDEPENDS:${PN} += "libblacs2-mvapich2-devel"

inherit rpm
