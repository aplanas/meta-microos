SUMMARY = "Helper to build testable command line interfaces"
DESCRIPTION = "CliKit is a group of utilities to build beautiful and testable \
command line interfaces."
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "python311-clikit-0.6.2-2.16.noarch.rpm"
RPM_HASH = "522366cfadf6de64f11f99cd1450f0ca7a32f80103d559dbe7ec108fbb3ce4db7be732681357245774b2b73725ef87241d7ae6f5c52c891d2918142d950b7602"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(clikit) python311-clikit python3dist(clikit)"
RDEPENDS:${PN} += "python(abi) python311-crashtest python311-pastel python311-pylev"

inherit rpm
