SUMMARY = "Git archive plugin setuptools_scm"
DESCRIPTION = "This is a setuptools_scm plugin that adds support for git archives \
(for example the ones GitHub automatically generates). \
 \
Note that it only works for archives of tagged commits (because git currently \
lacks a format option equivalent to git describe --tags)."
LICENSE = "MIT"

PV = "1.1"

RPM_NAME = "python311-setuptools_scm_git_archive-1.1-2.1.noarch.rpm"
RPM_HASH = "cc4beef42bbb13bef8f1bcc8249ab945c5fdfbbf9b2633e04d7575d8bdecd5ff45c9c2828f2af2da0f142038d3aa5a711c4fd21cfdfa666e8a09f21ce2695e05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(setuptools-scm-git-archive) python311-setuptools_scm_git_archive python3dist(setuptools-scm-git-archive)"
RDEPENDS:${PN} += "python(abi) python311-setuptools_scm"

inherit rpm
