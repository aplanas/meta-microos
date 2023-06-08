SUMMARY = "Python mutation testing"
DESCRIPTION = "Python mutation testing."
LICENSE = "BSD-3-Clause"

PV = "2.0.0"

RPM_NAME = "python39-mutmut-2.0.0-4.7.noarch.rpm"
RPM_HASH = "1689f7ecfd0a25aea1b815dcdadbedbcd3066e833428c4bc5e95deadec800ee48056019c8a4148478f25f85c40515d740cdac1273f471063dadab092b26b06ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(mutmut) python39-mutmut python3dist(mutmut)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-click python39-glob2 python39-hammett python39-junit-xml python39-parso python39-pony python39-setuptools python39-tri.declarative update-alternatives"

inherit rpm
