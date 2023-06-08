SUMMARY = "Extract data from python stack frames and tracebacks"
DESCRIPTION = "Extract data from python stack frames and tracebacks for informative displays"
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "python39-stack-data-0.6.2-1.1.noarch.rpm"
RPM_HASH = "4d61964b5f1502822dfd2add198d73ee70328308cb098fd30665afd9642b09bf5d6b12c198b9940631fcf6c2f1761074c665c9e490cdb5d4fbb4ca74fb22df24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(stack-data) python39-stack-data python3dist(stack-data)"
RDEPENDS:${PN} += "python(abi) python39-asttokens python39-executing python39-pure-eval"

inherit rpm
