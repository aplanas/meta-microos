SUMMARY = "Python time mocking"
DESCRIPTION = "A python library that helps users write deterministic tests for time sensitive and I/O intensive code."
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "python310-time-travel-1.1.2-3.5.noarch.rpm"
RPM_HASH = "918336546ff6c550837b1fc4f01999885e3a71ae4626f7499dfa5f6055aaa0da2318b6cfd3290491a77848d84762d718bfbb30e5879a22e8e99d977d7b8688fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-time-travel python3.10dist(time-travel) python310-time-travel python3dist(time-travel)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
