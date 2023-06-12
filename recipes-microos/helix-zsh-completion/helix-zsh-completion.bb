SUMMARY = "Zsh Completion for helix"
DESCRIPTION = "Zsh command-line completion support for helix."
LICENSE = "(Apache-2.0 | MIT) & BSD-3-Clause & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | MIT) & (MIT | Apache-2.0 | Zlib) & (MIT | Unlicense) & (Zlib | Apache-2.0 | MIT) & Apache-2.0 & BSL-1.0 & ISC & MIT & MPL-2.0 & Zlib & MPL-2.0"

PV = "23.05"

RPM_NAME = "helix-zsh-completion-23.05-1.1.noarch.rpm"
RPM_HASH = "65d253d1fd842d33264d18feccc207bcf9e16f7862c1fdba3193cbd37c07d50c8fec00c3a2acf9812a949ebd843b548ad3893f76a1a5cc8045e8016c2d7ad6bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "helix-zsh-completion"
RDEPENDS:${PN} += ""

inherit rpm
