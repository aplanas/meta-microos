SUMMARY = "Fish, Bash, Zsh and PowerShell completion for Click"
DESCRIPTION = "Fish, Bash, Zsh and PowerShell completion for Click."
LICENSE = "MIT"

PV = "0.5.2"

RPM_NAME = "python39-click-completion-0.5.2-1.13.noarch.rpm"
RPM_HASH = "6e94de31276e33be8a0d3cb5a90040c8875a24fb8b76f2685c2987367d7f1df46a29230dd0ea24d2f332216f6259fba32a249d380bbc1898351db4af9ed7b49c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(click-completion) \
python39-click-completion \
python3dist(click-completion)"
RDEPENDS:${PN} += "python(abi) \
python39-Jinja2 \
python39-click \
python39-shellingham \
python39-six"

inherit rpm
