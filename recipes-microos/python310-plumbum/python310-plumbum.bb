SUMMARY = "Shell combinators library"
DESCRIPTION = "Plumbum is a library for shell script-like programs in Python. \
 \
Apart from shell-like syntax and handy shortcuts, the library \
provides local and remote command  execution (over SSH), local and \
remote file-system paths, working-directory and environment \
manipulation, and a programmatic Command-Line Interface (CLI) \
application toolkit."
LICENSE = "MIT"

PV = "1.7.2"

RPM_NAME = "python310-plumbum-1.7.2-1.6.noarch.rpm"
RPM_HASH = "c549a6ebeaaae3dea7ed35f640c3fbcc83b6ba327cae8e0a33b8de3e321dbd9be2dcbfd70b6c6f8a68b11464fa64bc62b738349d70ff4b1c26ac3f2ab94b08d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-plumbum python3.10dist(plumbum) python310-plumbum python3dist(plumbum)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
