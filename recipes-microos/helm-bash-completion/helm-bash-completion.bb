SUMMARY = "Bash Completion for helm"
DESCRIPTION = "Bash command line completion support for helm."
LICENSE = "Apache-2.0"

PV = "3.11.3"

RPM_NAME = "helm-bash-completion-3.11.3-2.1.noarch.rpm"
RPM_HASH = "90616291187a8ed72c6788e8186ad3d0c578dfd68af5dd425f9136ad7a470536c0ae0a0c12ca2e721325e6e2025430052fb4d430e41845a8f2b1303184533524"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "helm-bash-completion"
RDEPENDS:${PN} += "helm"

inherit rpm
