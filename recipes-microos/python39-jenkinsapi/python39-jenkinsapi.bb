SUMMARY = "A Python API for accessing resources on a Jenkins continuous integration server"
DESCRIPTION = "Jenkins is a continuous integration system. \
 \
Jenkins (and its predecessor Hudson) are projects for automating \
common development tasks (e.g. unit testing, production batches), but \
they are somewhat Java-centric. The designers have provided a REST \
interface. This library wraps up that interface as more conventional \
Python objects. \
 \
This library can help to: \
 \
 * Query the test-results of a completed build \
 * Get a objects representing the latest builds of a job \
 * Search for artefacts by simple criteria \
 * Block until jobs are complete \
 * Install artefacts to custom-specified directory structures \
 \
and has \
 \
 * username/password auth support for jenkins instances with auth turned on \
 * Ability to search for builds by subversion revision \
 * Ability to add/remove/query Jenkins slaves \
 * Ability to add/remove/modify Jenkins views"
LICENSE = "MIT"

PV = "0.3.11"

RPM_NAME = "python39-jenkinsapi-0.3.11-3.6.noarch.rpm"
RPM_HASH = "7f7816c8c61094202c47623bf71a053974afd7ca31cfc4755af6b011fd77e8f86073c93c930ca4d8c8cc03bff29f37177fa83796b8393469c55bbd7ea6a83155"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jenkinsapi) python39-jenkinsapi python3dist(jenkinsapi)"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/python3.9 python(abi) python39-pytz python39-requests python39-six"

inherit rpm
