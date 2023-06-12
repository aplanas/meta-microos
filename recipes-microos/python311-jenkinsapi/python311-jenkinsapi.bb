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

RPM_NAME = "python311-jenkinsapi-0.3.11-3.6.noarch.rpm"
RPM_HASH = "596ae227a821521c6574dcf017c666822594e86a1dd13c4c8fc2d6a6c0689d315c6032900e6b60c01c6b52ba2b46a6e19670a59a0c2e7c803c540fb74456e376"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(jenkinsapi) \
python311-jenkinsapi \
python3dist(jenkinsapi)"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-pytz \
python311-requests \
python311-six"

inherit rpm
