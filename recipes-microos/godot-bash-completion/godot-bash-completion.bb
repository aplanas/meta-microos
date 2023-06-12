SUMMARY = "Godot command line completion for Bash"
DESCRIPTION = "Bash command line completion support for godot and godot-runner"
LICENSE = "MIT"

PV = "4.0.3"

RPM_NAME = "godot-bash-completion-4.0.3-1.1.noarch.rpm"
RPM_HASH = "8e977eeda5e10e361afca3c22b02f9e5ec451a751ede0848fcc1fce163afafb543cf3ecad29608cd3efba529b10e571da4296dfcf9045ebfb501b33900e778b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "godot-bash-completion"
RDEPENDS:${PN} += "bash-completion"

inherit rpm
