SUMMARY = "NVM Express user space tools bash completion"
DESCRIPTION = "Optional dependency offering bash completion for NVM Express user space tools"
LICENSE = "GPL-2.0-only"

PV = "2.4"

RPM_NAME = "nvme-cli-bash-completion-2.4-1.1.noarch.rpm"
RPM_HASH = "4905b79d566c718db52adb26da2b41f3740595820740dad3eabe9863b66a644b35c5c84083e371bba640a46a16f2cabbee69bf7f3e2c896b02a88d66932618b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nvme-cli-bash-completion"
RDEPENDS:${PN} += "/bin/sh \
bash-completion \
nvme-cli"

inherit rpm
