SUMMARY = "Python libary to flatten multi-file RELAX NG schemas"
DESCRIPTION = "The rnginline package is a Python library and command-line tool for \
multi-file RELAX NG schemas from arbitary URLs, and flattening them \
into a single RELAX NG schema."
LICENSE = "Apache-2.0"

PV = "0.0.2"

RPM_NAME = "python39-rnginline-0.0.2-4.9.noarch.rpm"
RPM_HASH = "ab28d49e173446a4ca5f40fa77c81c0e256c8e250abe16a38e94b07664a6b77226fab19f04e67c0aab6a704800c79a3c8adb32fffd2baae5bedaf710e75ebce9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(rnginline) python39-rnginline python3dist(rnginline)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-docopt python39-lxml python39-six update-alternatives"

inherit rpm
