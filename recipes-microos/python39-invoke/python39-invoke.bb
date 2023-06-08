SUMMARY = "Pythonic Task Execution"
DESCRIPTION = "Invoke is a Python (2.7 and 3.4+) task execution tool & library, drawing \
inspiration from various sources to arrive at a powerful & clean feature set."
LICENSE = "BSD-2-Clause"

PV = "1.7.3"

RPM_NAME = "python39-invoke-1.7.3-2.1.noarch.rpm"
RPM_HASH = "51b36817ee4d712dbf4897023ffc4b7322c80a6f50e97b297ac94b18bf0ec6cc49e0ee2cf990e07de8bd52cf66870a2b17cb4e04bcfc33dd5515270497ff3c36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(invoke) python39-invoke python3dist(invoke)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-PyYAML python39-fluidity-sm python39-lexicon python39-pexpect python39-six update-alternatives"

inherit rpm
