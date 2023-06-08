SUMMARY = "A library wrapping email authentication header verification and generation"
DESCRIPTION = "A library wrapping email authentication header verification and generation."
LICENSE = "MIT"

PV = "0.14.1"

RPM_NAME = "python310-authheaders-0.14.1-1.6.noarch.rpm"
RPM_HASH = "c2a82c302760320315de7db1798350f9a35cfbb3df2e846e92f80f91c4d4d44ae15f9c4b1062c8543ad4cc8d5c5027a154cf5de24b722520fd9936ea642f705a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-authheaders python3.10dist(authheaders) python310-authheaders python3dist(authheaders)"
RDEPENDS:${PN} += "python(abi) python310-authres python310-dkimpy python310-dnspython python310-publicsuffix2"

inherit rpm
