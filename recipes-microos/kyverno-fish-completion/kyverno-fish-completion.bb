SUMMARY = "Fish Completion for kyverno"
DESCRIPTION = "Fish command line completion support for kyverno."
LICENSE = "Apache-2.0"

PV = "1.10.0"

RPM_NAME = "kyverno-fish-completion-1.10.0-1.1.noarch.rpm"
RPM_HASH = "9ccf71e44efbf62504112bc637f36c762b42375add9c6360a0aa87b02163c1850ef596a432c504ff0ac4b6aa6fd8bd8a176a83b4ac5b7faa622f203853b42473"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kyverno-fish-completion"
RDEPENDS:${PN} += "kyverno"

inherit rpm
