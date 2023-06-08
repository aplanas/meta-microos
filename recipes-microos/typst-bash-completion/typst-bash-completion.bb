SUMMARY = "Bash Completion for typst"
DESCRIPTION = "Bash command-line completion support for typst."
LICENSE = "Apache-2.0"

PV = "0.3.0"

RPM_NAME = "typst-bash-completion-0.3.0-1.1.noarch.rpm"
RPM_HASH = "30608648fe8839a06d9e571dc0467cae3e3e6d76799012a940b9f7dfdc4b94cded26644ed0f4f45dd0ca063bf29dcce28659d6cf1c09a03bbe6da29c2fe719cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "typst-bash-completion"
RDEPENDS:${PN} += ""

inherit rpm
