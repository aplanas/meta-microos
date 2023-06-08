SUMMARY = "SUSE HPC GNU Compiler Toolchain environment"
DESCRIPTION = "Provides HPC-compatible setup and configuration for the GNU compiler toolchain."
LICENSE = "BSD-3-Clause"

PV = "1.4"

RPM_NAME = "gnu-compilers-hpc-1.4-10.2.noarch.rpm"
RPM_HASH = "5e95baff06ba201505142b9661ba32671a3b245080ee4a6324261b6267a7c98ecf7e8d3419ff8bec3e98b64cd3df73e505b812e6d3f450276688ca030022bf08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnu-compilers-hpc gnu13-compilers-hpc"
RDEPENDS:${PN} += "lua-lmod"

inherit rpm
