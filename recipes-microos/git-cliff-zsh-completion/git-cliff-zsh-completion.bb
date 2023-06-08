SUMMARY = "Zsh Completion for git-cliff"
DESCRIPTION = "Zsh command-line completion support for git-cliff."
LICENSE = "(Apache-2.0 | MIT) & Unicode-DFS-2016 & (0BSD | MIT | Apache-2.0) & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | ISC | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | Apache-2.0-WITH-LLVM-exception | MIT) & (Apache-2.0 | MIT | Zlib) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & (Apache-2.0 | Zlib | MIT) & Apache-2.0 & BSD-3-Clause & ISC & MIT & MPL-2.0 & GPL-3.0-only"

PV = "1.1.2"

RPM_NAME = "git-cliff-zsh-completion-1.1.2-1.3.noarch.rpm"
RPM_HASH = "be5f57a3ca6749f90d77af83b935a286ca5a282c420fa872997ae27ce00faacedcc5ad44cd2f23fa33006b271b62ea7e5f203bcc88f78e848043cf03634dd6c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-cliff-zsh-completion"
RDEPENDS:${PN} += "zsh"

inherit rpm
