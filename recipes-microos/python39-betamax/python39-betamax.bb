SUMMARY = "A VCR imitation for python-requests"
DESCRIPTION = "Betamax is a VCR_ imitation for requests. This will make mocking out requests \
much easier."
LICENSE = "Apache-2.0"

PV = "0.8.1"

RPM_NAME = "python39-betamax-0.8.1-2.1.noarch.rpm"
RPM_HASH = "a3e2803d169414a1f1162aff38e6a43fcaec62b0056cded8b0c63f8ecde697def10292186172dab56b791987f7e5e95c009484fc309b6167bbfbd97569fd7994"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(betamax) \
python39-betamax \
python3dist(betamax)"
RDEPENDS:${PN} += "python(abi) \
python39-requests"

inherit rpm
