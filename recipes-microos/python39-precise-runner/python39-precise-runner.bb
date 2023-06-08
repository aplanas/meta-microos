SUMMARY = "Wrapper to use Mycroft Precise Wake Word Listener"
DESCRIPTION = "Wrapper to use the Mycroft Precise Wake Word Listener"
LICENSE = "Apache-2.0"

PV = "0.3.1"

RPM_NAME = "python39-precise-runner-0.3.1-1.15.noarch.rpm"
RPM_HASH = "0bcb128377cdc37a45148fee37ab582ee54804083dafeca1abce87f1303750e2872d22e2810b00ce88f03672dea2154f3b76f6da80d13b53b29c37fb4226e310"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(precise-runner) python39-precise-runner python3dist(precise-runner)"
RDEPENDS:${PN} += "python(abi) python39-PyAudio"

inherit rpm
