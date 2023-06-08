SUMMARY = "Extract data from python stack frames and tracebacks"
DESCRIPTION = "Extract data from python stack frames and tracebacks for informative displays"
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "python310-stack-data-0.6.2-1.1.noarch.rpm"
RPM_HASH = "bdd4b4827db474b1c5b85b9dc87272f22c28b1d5b357934e6ebab0205d635e4f339809dcb64a353cc559ba19b13679b91cc25d032b3eee15664672059f9674d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-stack-data python3.10dist(stack-data) python310-stack-data python3dist(stack-data)"
RDEPENDS:${PN} += "python(abi) python310-asttokens python310-executing python310-pure-eval"

inherit rpm
