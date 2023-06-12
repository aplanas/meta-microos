SUMMARY = "Utility to switch between SLES and SLE-HPC on SLE-12"
DESCRIPTION = "This tool is intended for users who are SLES subscribers but would like \
to migrate to the new SLE-HPC subscription."
LICENSE = "MIT"

PV = "0.2"

RPM_NAME = "switch_sles_sle-hpc-0.2-4.1.noarch.rpm"
RPM_HASH = "100709130e35861716c2bed45da3ce33ac9250e77e639ca79565a7614cdb405c385ff54e07e839ca85cf1df939c2f9cb4bb9e799744e0d16b1c9203ffcb201d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "switch_sles_sle-hpc"
RDEPENDS:${PN} += "/bin/bash \
SUSEConnect \
bash \
coreutils \
rpm \
sed \
zypper"

inherit rpm
