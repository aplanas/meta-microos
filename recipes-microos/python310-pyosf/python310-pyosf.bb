SUMMARY = "Python lib for synching with OpenScienceFramework projects"
DESCRIPTION = "The pyosf package is a pure Python library for file sync with \
Open Science Framework. \
 \
This package is for synchronisation of files from the local \
file space to the Open Science Framework (OSF). There is a more \
complex sync package by the Center for Open Science, \
who created OSF, called osf-sync. \
 \
The OSF official package is designed for continuous automated \
synchronisation of many projects (à la Dropbox). The authors of pyosf \
needed something simpler (for combination with PsychoPy). The pyosf \
package performs basic search/login/sync operations with single \
projects on OSF, but only when instructed to do so (no continuous \
sync)."
LICENSE = "MIT"

PV = "1.0.5"

RPM_NAME = "python310-pyosf-1.0.5-5.8.noarch.rpm"
RPM_HASH = "42587367deebe61ddca150398399ff3c62cbb92f128afd095706b3bd405b4b7ceec9040e1e612bea05d3118b1a24439dde3d39897060beea1522a8fe6f5596a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyosf \
python3.10dist(pyosf) \
python310-pyosf \
python3dist(pyosf)"
RDEPENDS:${PN} += "python(abi) \
python310-requests"

inherit rpm
