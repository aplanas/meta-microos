SUMMARY = "Fish Completion for just"
DESCRIPTION = "Fish command-line completion support for just."
LICENSE = "(Apache-2.0 | MIT) & Unicode-DFS-2016 & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | MIT) & (Apache-2.0 | Apache-2.0-WITH-LLVM-exception | MIT) & (MIT | Unlicense) & Apache-2.0 & BSD-3-Clause & CC0-1.0 & MIT & CC0-1.0"

PV = "1.13.0"

RPM_NAME = "just-fish-completion-1.13.0-1.2.noarch.rpm"
RPM_HASH = "a0f28475312d36bd831fb288676476a1d4c15a483f5229ed5047490fdbadaecea869c6be328e25d63b4e9a0d174feb29fe1dd5e029ad978c0c078e357f630f47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "just-fish-completion"
RDEPENDS:${PN} += "fish"

inherit rpm
