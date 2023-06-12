SUMMARY = "Regression tests from Slurm sources"
DESCRIPTION = "NOTE: THIS PACKAGE IS FOR TESTING PURPOSES ONLY. IT REQUIRES A \
DEDICATED TESTING ENVIRONMENT. \
 \
DO NOT INSTALL ON A PRODUCTION SYSTEM! \
 \
Slurm provides a test set implemented as 'expect' scripts. \
Not all of the tests are expected to pass, some require a modified \
configuration. This test package is meant for internal purposes. \
Do not run test suite and file bug reports for each failed test!"
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-testsuite-23.02.2-1.1.aarch64.rpm"
RPM_HASH = "471188ca9509e4af843f8ee1eb9ce602b70cf3b3055cde6e5089d2e722c372ec669944e69fccf771b5c4dd6928680c4a072f55eb8eabae722b278fe89c77ce88"

RPROVIDES:${PN} += "config(slurm-testsuite) \
slurm-testsuite \
slurm-testsuite(aarch-64)"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
bind-utils \
bzip2 \
expect \
gcc-c++ \
libnuma-devel \
mariadb \
openmpi4-gnu-hpc-devel \
pam \
pdsh \
perl-slurm \
pmix-devel \
slurm \
slurm-auth-none \
slurm-cray \
slurm-devel \
slurm-hdf5 \
slurm-lua \
slurm-munge \
slurm-node \
slurm-openlava \
slurm-rest \
slurm-seff \
slurm-sjstat \
slurm-slurmdbd \
slurm-sql \
slurm-torque \
sudo \
tar"

inherit rpm
