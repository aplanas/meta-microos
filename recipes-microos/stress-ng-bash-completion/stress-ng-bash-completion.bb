SUMMARY = "Bash Completion for stress-ng"
DESCRIPTION = "Bash completion script for stress-ng."
LICENSE = "GPL-2.0-only"

PV = "0.15.06"

RPM_NAME = "stress-ng-bash-completion-0.15.06-1.2.noarch.rpm"
RPM_HASH = "92db08217656fdb6be6f9229136906f56f24bd367290967e41baeca937800c45b16ad038b99d84dce9990c22f8b130101d1de6e0a8f2389b5f5b7ffbd15e9371"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "stress-ng-bash-completion"
RDEPENDS:${PN} += "bash-completion stress-ng"

inherit rpm
