SUMMARY = "Headers and library links for libHYPRE2_20_0-openmpi2"
DESCRIPTION = "HYPRE headers and libraries files needed for development \
This package contains development files of the openmpi2 version of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "hypre-openmpi2-devel-2.20.0-1.9.aarch64.rpm"
RPM_HASH = "41fe0ddd136fcee60e79902ece5e5e3ccb7ffdf59151ee24881775502151239a96849c809f1ef6f4e087df9aff9b442db081bb36483ce7e7fc361826af8b3226"

RPROVIDES:${PN} += "hypre-openmpi2-devel hypre-openmpi2-devel(aarch-64)"
RDEPENDS:${PN} += "lapack-devel libHYPRE2_20_0-openmpi2 superlu-devel"

inherit rpm
