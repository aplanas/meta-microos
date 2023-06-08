SUMMARY = "Git archive plugin setuptools_scm"
DESCRIPTION = "This is a setuptools_scm plugin that adds support for git archives \
(for example the ones GitHub automatically generates). \
 \
Note that it only works for archives of tagged commits (because git currently \
lacks a format option equivalent to git describe --tags)."
LICENSE = "MIT"

PV = "1.1"

RPM_NAME = "python310-setuptools_scm_git_archive-1.1-2.1.noarch.rpm"
RPM_HASH = "e06abd77d10830ef3a277aa1534a50164c4d6b25c937f77d10e1a409864440a6108134046afd5c0ed5c009606ef4adc180a7a42aa3172ec001b3a2e013de66ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-setuptools_scm_git_archive python3.10dist(setuptools-scm-git-archive) python310-setuptools_scm_git_archive python3dist(setuptools-scm-git-archive)"
RDEPENDS:${PN} += "python(abi) python310-setuptools_scm"

inherit rpm
