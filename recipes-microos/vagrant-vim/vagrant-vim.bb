SUMMARY = "Vagrantfile syntax files for the vim editor"
DESCRIPTION = "Optional dependency offering vim syntax files for Vagrantfile"
LICENSE = "MIT"

PV = "2.3.4"

RPM_NAME = "vagrant-vim-2.3.4-4.1.noarch.rpm"
RPM_HASH = "df85e1e0c337bd59e4c2e988ea1b2686e16497c387910853794d26885f1bbe26c81035361420bc3892f1f35ea8d2f728044fa51b4d61d114246b6da7e1bcf929"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vagrant-vim"
RDEPENDS:${PN} += "vagrant vim"

inherit rpm
