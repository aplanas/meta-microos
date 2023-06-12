SUMMARY = "Protect and discover secrets using Gitleaks"
DESCRIPTION = "Gitleaks is a SAST tool for detecting and preventing hardcoded secrets like passwords, api keys, and tokens in git repos. Gitleaks is an easy-to-use, all-in-one solution for detecting secrets, past or present, in your code."
LICENSE = "MIT"

PV = "8.16.0"

RPM_NAME = "gitleaks-8.16.0-1.4.aarch64.rpm"
RPM_HASH = "3b2f1e859f81e275ea6f8471cfb7fca5c460990fcc3637d2a079898aeef183751f39f00d6c3282bdd7a5bd8aa7f88ad8af67ffb0cb7041f8cfc4242503d40794"

RPROVIDES:${PN} += "gitleaks gitleaks(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
