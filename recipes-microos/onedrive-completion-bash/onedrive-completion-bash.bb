SUMMARY = "OneDrive Bash completition"
DESCRIPTION = "OneDrive shell completions for Bash."
LICENSE = "GPL-3.0-only"

PV = "2.4.23"

RPM_NAME = "onedrive-completion-bash-2.4.23-1.4.aarch64.rpm"
RPM_HASH = "ba6a39c7993990fd69911aa46fe59548dbb36bec43dc9c51d84586484797f76e4701f22497921ae5d060f7c7121ed24eecbab04bcaffd7edc5b42c9bb5c69b6c"

RPROVIDES:${PN} += "onedrive-completion-bash onedrive-completion-bash(aarch-64)"
RDEPENDS:${PN} += "bash bash-completion onedrive"

inherit rpm
