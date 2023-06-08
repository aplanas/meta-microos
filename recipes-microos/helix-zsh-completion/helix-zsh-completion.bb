SUMMARY = "Zsh Completion for helix"
DESCRIPTION = "Zsh command-line completion support for helix."
LICENSE = "(Apache-2.0 | MIT) & BSD-3-Clause & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | MIT) & (MIT | Apache-2.0 | Zlib) & (MIT | Unlicense) & (Zlib | Apache-2.0 | MIT) & Apache-2.0 & BSL-1.0 & ISC & MIT & MPL-2.0 & Zlib & MPL-2.0"

PV = "23.03"

RPM_NAME = "helix-zsh-completion-23.03-2.1.noarch.rpm"
RPM_HASH = "183428f4d0ac2f4e2994e2466bd22313495c8d0a95c5ec3ce6fa41dbd43880edadabb0cad73c65fc4febd01b36664624fc65bbc1fda6fefb743a553876e5dbba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "helix-zsh-completion"
RDEPENDS:${PN} += ""

inherit rpm
