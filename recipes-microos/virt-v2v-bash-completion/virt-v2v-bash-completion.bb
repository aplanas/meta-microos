SUMMARY = "Bash tab-completion for virt-v2v"
DESCRIPTION = "Install this package if you want intelligent bash tab-completion \
for virt-v2v."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.7"

RPM_NAME = "virt-v2v-bash-completion-2.0.7-2.3.noarch.rpm"
RPM_HASH = "18a83209f730606d066d50c4e1372537469ab50730d07b09a0bfd50436f7d95064e5cad427850911843d734ae2edc41fe8116046dd07b30fe50376d2fdd8da1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "virt-v2v-bash-completion"
RDEPENDS:${PN} += "bash-completion virt-v2v"

inherit rpm
