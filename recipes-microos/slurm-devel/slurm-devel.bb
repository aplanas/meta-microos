SUMMARY = "Development package for SLURM"
DESCRIPTION = "This package includes the header files for the SLURM API."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-devel-23.02.2-1.1.aarch64.rpm"
RPM_HASH = "057476f09a8f46711c2a906b711d80bd7c8a6784e690a37dccfe34cca4485d40020244dc817957f41eb3c168d5953c96378a40310db3b07eff9088b205fa7705"

RPROVIDES:${PN} += "pkgconfig(slurm) slurm-devel slurm-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libpmi0 libslurm39 slurm"

inherit rpm
