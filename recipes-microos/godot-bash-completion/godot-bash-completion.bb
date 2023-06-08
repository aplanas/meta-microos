SUMMARY = "Godot command line completion for Bash"
DESCRIPTION = "Bash command line completion support for godot and godot-runner"
LICENSE = "MIT"

PV = "4.0.2"

RPM_NAME = "godot-bash-completion-4.0.2-2.1.noarch.rpm"
RPM_HASH = "88072912f97c265037aaa540960d9b461ba0edd1b7014ff89218a5ccf06e08efebb7cfb1ccb75da98f5f17037dcc777572dabf0a22563fe0b69b2bbffd29f101"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "godot-bash-completion"
RDEPENDS:${PN} += "bash-completion"

inherit rpm
