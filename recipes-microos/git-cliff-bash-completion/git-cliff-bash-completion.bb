SUMMARY = "Bash Completion for git-cliff"
DESCRIPTION = "Bash command-line completion support for git-cliff."
LICENSE = "(Apache-2.0 | MIT) & Unicode-DFS-2016 & (0BSD | MIT | Apache-2.0) & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | ISC | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | Apache-2.0-WITH-LLVM-exception | MIT) & (Apache-2.0 | MIT | Zlib) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & (Apache-2.0 | Zlib | MIT) & Apache-2.0 & BSD-3-Clause & ISC & MIT & MPL-2.0 & GPL-3.0-only"

PV = "1.1.2"

RPM_NAME = "git-cliff-bash-completion-1.1.2-1.3.noarch.rpm"
RPM_HASH = "9f1435ce5ed4ea2a7416f006af51cf2e65d279f73859c871afb7625ebf651a7f3963c50461fc61d94ef3684e55dc3f4f09fa9da76bf7184d5e77147a5fc4a2ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-cliff-bash-completion"
RDEPENDS:${PN} += "bash-completion"

inherit rpm
