SUMMARY = "Zsh Completion for rage-encryption"
DESCRIPTION = "Zsh command-line completion support for rage-encryption."
LICENSE = "(0BSD | MIT | Apache-2.0) & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | MIT) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & (Apache-2.0 | Zlib | MIT) & Apache-2.0 & BSD-3-Clause & CDDL-1.0 & MIT"

PV = "0.9.1+0"

RPM_NAME = "rage-encryption-zsh-completion-0.9.1+0-2.1.noarch.rpm"
RPM_HASH = "4961642c05c7b61690453e1d4f27b53df7a95da8b49057ef105a410c7886fac89e7478ad6b53bd510c57a111375f9390fd4fc1873efae2185a06ff8fa546ccb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rage-encryption-zsh-completion"
RDEPENDS:${PN} += "zsh"

inherit rpm
