SUMMARY = "Fish, Bash, Zsh and PowerShell completion for Click"
DESCRIPTION = "Fish, Bash, Zsh and PowerShell completion for Click."
LICENSE = "MIT"

PV = "0.5.2"

RPM_NAME = "python310-click-completion-0.5.2-1.13.noarch.rpm"
RPM_HASH = "01770230dac1503b8ac86457f816aab73ee6b892c2e49a88f47d32e688b0c90c9ae3bdc451fedf6963b04da61f8ab14c9034b3b0626643aa597c7974042dbbda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-click-completion python3.10dist(click-completion) python310-click-completion python3dist(click-completion)"
RDEPENDS:${PN} += "python(abi) python310-Jinja2 python310-click python310-shellingham python310-six"

inherit rpm
