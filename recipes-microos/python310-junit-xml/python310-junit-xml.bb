SUMMARY = "Module that creates JUnit XML test result documents"
DESCRIPTION = "Creates JUnit XML test result documents \
that can be read by tools such as Jenkins."
LICENSE = "MIT"

PV = "1.9"

RPM_NAME = "python310-junit-xml-1.9-1.13.noarch.rpm"
RPM_HASH = "0cf57e0ab32d68d580bd7919f680f244f47340ced83050720abde3e5c844dcf252167d968249a04cb7be5e5103c9a73289b9c240b242a01b7af829ad6b32cd13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-junit-xml python3.10dist(junit-xml) python310-junit-xml python3dist(junit-xml)"
RDEPENDS:${PN} += "python(abi) python310-six"

inherit rpm
