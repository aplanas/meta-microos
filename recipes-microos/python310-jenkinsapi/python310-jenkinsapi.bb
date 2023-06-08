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

RPM_NAME = "python310-jenkinsapi-0.3.11-3.6.noarch.rpm"
RPM_HASH = "ddf2896aa9676a39d87a228e91a63bc47f2dc0ff5a231898257507fcca32952e198a25b32474e38af4426f092d22899cb37291efecbdec7cffce0a118f704fb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jenkinsapi python3.10dist(jenkinsapi) python310-jenkinsapi python3dist(jenkinsapi)"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/python3.10 python(abi) python310-pytz python310-requests python310-six"

inherit rpm
