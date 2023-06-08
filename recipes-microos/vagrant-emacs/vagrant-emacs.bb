SUMMARY = "Vagrantfile syntax files for the emacs editor"
DESCRIPTION = "Optional dependency offering emacs syntax files for Vagrantfile"
LICENSE = "MIT"

PV = "2.3.4"

RPM_NAME = "vagrant-emacs-2.3.4-4.1.noarch.rpm"
RPM_HASH = "98301ab8d45b189b485bcaf61705cf8f4b7d7940bd3e75640bdfcca1c51fa167bf3141f09462ee23525be65331e5b0fefe3f52d9608f7be0134465c7e4b9abb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vagrant-emacs"
RDEPENDS:${PN} += "emacs_program vagrant"

inherit rpm
