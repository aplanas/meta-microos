SUMMARY = "Zsh Completion for nova"
DESCRIPTION = "zsh command line completion support for nova."
LICENSE = "Apache-2.0"

PV = "3.6.2"

RPM_NAME = "nova-zsh-completion-3.6.2-2.1.noarch.rpm"
RPM_HASH = "10eeb0c9997a9b7f477b35ae7e918910efe2009f28d9070101aab3c4c98b74c22a60c8de3b55313bba1a8e481978cf1051bae87709b04fe049005845f6bbd2f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nova-zsh-completion"
RDEPENDS:${PN} += "nova"

inherit rpm
