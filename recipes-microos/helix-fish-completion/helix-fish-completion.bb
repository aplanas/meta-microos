SUMMARY = "Fish Completion for helix"
DESCRIPTION = "Fish command-line completion support for helix."
LICENSE = "(Apache-2.0 | MIT) & BSD-3-Clause & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | MIT) & (MIT | Apache-2.0 | Zlib) & (MIT | Unlicense) & (Zlib | Apache-2.0 | MIT) & Apache-2.0 & BSL-1.0 & ISC & MIT & MPL-2.0 & Zlib & MPL-2.0"

PV = "23.03"

RPM_NAME = "helix-fish-completion-23.03-2.1.noarch.rpm"
RPM_HASH = "d8b23f5c16a5142cdaf8b4ef93949a37e34918879ee7af2ca5165928e07e9dc6a1fdea1951daef8670d7d48eb4bd8574fc906dbbef7a61c3e815b27e1a0176b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "helix-fish-completion"
RDEPENDS:${PN} += ""

inherit rpm
