SUMMARY = "Bash Completion for helix"
DESCRIPTION = "Bash command-line completion support for helix."
LICENSE = "(Apache-2.0 | MIT) & BSD-3-Clause & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | MIT) & (MIT | Apache-2.0 | Zlib) & (MIT | Unlicense) & (Zlib | Apache-2.0 | MIT) & Apache-2.0 & BSL-1.0 & ISC & MIT & MPL-2.0 & Zlib & MPL-2.0"

PV = "23.03"

RPM_NAME = "helix-bash-completion-23.03-2.1.noarch.rpm"
RPM_HASH = "5738e799d34c6589e120882b31cbd9e8ba013bb20991d811500f10771c814e6731d65f6e0fd845a261b3c40ab2029f02e408313dbf2c352d667d493e447c4285"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "helix-bash-completion"
RDEPENDS:${PN} += ""

inherit rpm
