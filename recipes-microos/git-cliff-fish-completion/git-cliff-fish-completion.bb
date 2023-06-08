SUMMARY = "Fish Completion for git-cliff"
DESCRIPTION = "Fish command-line completion support for git-cliff."
LICENSE = "(Apache-2.0 | MIT) & Unicode-DFS-2016 & (0BSD | MIT | Apache-2.0) & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | ISC | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | Apache-2.0-WITH-LLVM-exception | MIT) & (Apache-2.0 | MIT | Zlib) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & (Apache-2.0 | Zlib | MIT) & Apache-2.0 & BSD-3-Clause & ISC & MIT & MPL-2.0 & GPL-3.0-only"

PV = "1.1.2"

RPM_NAME = "git-cliff-fish-completion-1.1.2-1.3.noarch.rpm"
RPM_HASH = "ff29817ec6c500aa6f895f2954eab6dbaceb9979123bd54a6b74790a697cb0a9c09983a04a72bc111d9250e0cce772e2b63afdc266a3da4527d68911e02658b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-cliff-fish-completion"
RDEPENDS:${PN} += "fish"

inherit rpm
