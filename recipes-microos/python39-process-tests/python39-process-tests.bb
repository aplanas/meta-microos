SUMMARY = "Tools for testing processes"
DESCRIPTION = "Testcase classes and assertions for testing processes."
LICENSE = "BSD-2-Clause"

PV = "2.1.2"

RPM_NAME = "python39-process-tests-2.1.2-2.1.noarch.rpm"
RPM_HASH = "296d8c98b970388e7c48873f547cb23c7ce2bc62f9844355a0dd550ed7a12c0c3c838c7fc4fdaf0572119dfc9e6c425c0005235ab8625b494c476dcdd115ba7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(process-tests) python39-process-tests python3dist(process-tests)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
