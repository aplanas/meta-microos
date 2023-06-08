SUMMARY = "Config files and directories for slurm services"
DESCRIPTION = "This package contains the slurm config files necessary direcories \
for the slurm daemons."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-config-23.02.2-1.1.noarch.rpm"
RPM_HASH = "cbfcaf8be745991547334adf52d7b9aca1625c05587c19b3852dbfefad31f6e3eb6b92f2374ff6b36a438660e5ac5d9bde4e4b0f485d85a1bb2ac29fc837a9e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(slurm-config) group(slurm) slurm-config user(slurm)"
RDEPENDS:${PN} += "/bin/sh logrotate shadow"

inherit rpm
