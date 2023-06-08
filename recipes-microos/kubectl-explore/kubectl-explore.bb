SUMMARY = "A better kubectl explain with the fuzzy finder"
DESCRIPTION = "This plugin fuzzy-finds the field explanation from supported API resources. It implements different explanations for particular API version."
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "kubectl-explore-0.7.1-1.3.aarch64.rpm"
RPM_HASH = "2245edfaf997e0864575185d2dd2b0dec7ba9e5029474e79ee28419837576cd0036697d5a1783d0da6c5587d4db0db646a67af4a7512171464e5bf0c3fa42b70"

RPROVIDES:${PN} += "kubectl-explore kubectl-explore(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
