SUMMARY = "Tools for testing processes"
DESCRIPTION = "Testcase classes and assertions for testing processes."
LICENSE = "BSD-2-Clause"

PV = "2.1.2"

RPM_NAME = "python310-process-tests-2.1.2-2.1.noarch.rpm"
RPM_HASH = "19fa54e58c98a2fb48c8da38e88658bf65b10d7f390ee9dd547b385eedc0d36ddc770c6048011e88fc6fd9efa8ac623a548c510a1a0e5c306dbf5323eb2e6e0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-process-tests python3.10dist(process-tests) python310-process-tests python3dist(process-tests)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
