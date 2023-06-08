SUMMARY = "Fish completion for glab"
DESCRIPTION = "Fish command line completion support for glab."
LICENSE = "MIT"

PV = "1.29.1"

RPM_NAME = "glab-fish-completion-1.29.1-1.1.noarch.rpm"
RPM_HASH = "24a4464130a7859e001364576fabee34f2907a65c7238cac03fd75b98b992fd22f3ac93b7d7c5a46ae6960ae09ccbb5667527bd71be22890124189c2bfe8bb3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glab-fish-completion"
RDEPENDS:${PN} += "glab"

inherit rpm
