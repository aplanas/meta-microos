SUMMARY = "Zsh config used by grml"
DESCRIPTION = "Zsh configuration files used by grml."
LICENSE = "GPL-2.0-only"

PV = "0.19.5"

RPM_NAME = "grml-zsh-config-0.19.5-2.1.noarch.rpm"
RPM_HASH = "0303d19a5d140ae88ac815113803f41aa2f96feddcdfc9d435e717531d24ec295342ad1ddfabb5ac725195426ae0f2fb531128ebd580e7b19cb6a681fbded7d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(grml-zsh-config) \
grml-zsh-config"
RDEPENDS:${PN} += "grep \
procps \
sed \
zsh"

inherit rpm
