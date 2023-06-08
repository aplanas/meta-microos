SUMMARY = "AppArmor"
DESCRIPTION = "AppArmor is an application security framework that provides mandatory access control for programs. It protects from exploitation of software flaws and compromised systems. It offers an advanced tool set that automates the development of per-program application security without requiring additional knowledge."
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-apparmor-20200505-40.1.aarch64.rpm"
RPM_HASH = "bccca75242eed8d6636fbed618886dcc154add9dc49e8f74dd417025cb2b6e4adbd36692c3e208f15745b21484a3e19cac16f9e4d07e51be31662b5a70c7288b"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() pattern-visible() patterns-base-apparmor patterns-base-apparmor(aarch-64) patterns-openSUSE-apparmor"
RDEPENDS:${PN} += "apparmor-abstractions apparmor-parser apparmor-profiles audit pattern()"

inherit rpm
