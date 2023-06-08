SUMMARY = "Zsh completion for skopeo"
DESCRIPTION = "This package contains the zsh completion for skopeo."
LICENSE = "Apache-2.0"

PV = "1.11.1"

RPM_NAME = "skopeo-zsh-completion-1.11.1-1.3.noarch.rpm"
RPM_HASH = "ed7f9c7d735801bfa3a03dc131a3f4b118ce3a47da6b6961bf5f857defd1f33c1c2a201ced40926de9dce98deb138c340d33d9f10c07e931b45ea0d2a854012b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "skopeo-zsh-completion"
RDEPENDS:${PN} += "skopeo zsh"

inherit rpm
