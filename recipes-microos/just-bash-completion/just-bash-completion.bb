SUMMARY = "Bash Completion for just"
DESCRIPTION = "Bash command-line completion support for just."
LICENSE = "(Apache-2.0 | MIT) & Unicode-DFS-2016 & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | MIT) & (Apache-2.0 | Apache-2.0-WITH-LLVM-exception | MIT) & (MIT | Unlicense) & Apache-2.0 & BSD-3-Clause & CC0-1.0 & MIT & CC0-1.0"

PV = "1.13.0"

RPM_NAME = "just-bash-completion-1.13.0-1.2.noarch.rpm"
RPM_HASH = "126470e4691a726916b3dae0286f6b652be16780f2aa76e1c8bb5bfbbf4699ed113550644b269dace39f6883550298beea62be37bc68758c6b1750f9f2422158"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "just-bash-completion"
RDEPENDS:${PN} += "bash-completion"

inherit rpm
