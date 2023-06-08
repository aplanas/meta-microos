SUMMARY = "ZSH completion for git-bug"
DESCRIPTION = "zsh shell completions for git-bug"
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "git-bug-zsh-completion-0.8.0-1.3.noarch.rpm"
RPM_HASH = "297b2df3f8f73b12158972c27ec3ad51aa943a385246d41357b92bdbf15184102373f52098dfc4d74a35c0ba6576751c2a7cdc59d347a6b69c4a26e8f4e48b50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(git-bug-zsh-completion) git-bug-zsh-completion"
RDEPENDS:${PN} += ""

inherit rpm
