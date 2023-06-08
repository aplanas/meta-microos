SUMMARY = "Zsh completion for nvimpager"
DESCRIPTION = "Zsh command line completion support for nvimpager."
LICENSE = "BSD-2-Clause"

PV = "0.11.0"

RPM_NAME = "nvimpager-zsh-completion-0.11.0-1.2.noarch.rpm"
RPM_HASH = "5dfc77ad8c95eff47e11db07defbf52b99d985548c36d9148e59e286a6448a40daf347cae986bf4877f6e1d3f1b8e3865b03a0865374c35fc7bcbad6551a2aa5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nvimpager-zsh-completion"
RDEPENDS:${PN} += "nvimpager zsh"

inherit rpm
