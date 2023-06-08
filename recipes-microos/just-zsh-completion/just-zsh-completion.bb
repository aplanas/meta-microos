SUMMARY = "Zsh Completion for just"
DESCRIPTION = "Zsh command-line completion support for just."
LICENSE = "(Apache-2.0 | MIT) & Unicode-DFS-2016 & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | MIT) & (Apache-2.0 | Apache-2.0-WITH-LLVM-exception | MIT) & (MIT | Unlicense) & Apache-2.0 & BSD-3-Clause & CC0-1.0 & MIT & CC0-1.0"

PV = "1.13.0"

RPM_NAME = "just-zsh-completion-1.13.0-1.2.noarch.rpm"
RPM_HASH = "1046f8b998e06b80ec7eaadfb18a3739554e2ba9100cd1be47638ed9c54c101930cc44ed7c5d71973549dc32e27877057bcf27860b627e378c7c29317d0dcf18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "just-zsh-completion"
RDEPENDS:${PN} += "zsh"

inherit rpm
