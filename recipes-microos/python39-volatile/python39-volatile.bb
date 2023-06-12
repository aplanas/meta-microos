SUMMARY = "Python extension for the tempfile module"
DESCRIPTION = "A small Python extension for the tempfile module."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python39-volatile-2.1.0-1.11.noarch.rpm"
RPM_HASH = "fd5d79bd5dd02762526779986e4841ebd314c6d945e89ecf68825af12386ac668cc2721b0811278f9db29c22d3b6c1f89d57f2779e7d34c0cfa53a727668311e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(volatile) \
python39-volatile \
python3dist(volatile)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
